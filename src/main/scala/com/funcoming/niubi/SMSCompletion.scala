package com.funcoming.niubi

import java.sql.DriverManager

import org.apache.spark.broadcast.Broadcast
import org.apache.spark.{Accumulator, SparkConf, SparkContext}

/**
  * Created by LiuFangGuo on 5/8/17.
  */
object SMSCompletion {

  def main(args: Array[String]): Unit = {
    start(args(0), args(1))
  }

  def getReferenceMap(): scala.collection.mutable.Map[String, Tuple7[String, Integer, String, String, String, Integer, Integer]] = {
    val driverName = "org.postgresql.Driver"
    val connectionUrl = "jdbc:postgresql://192.168.12.14:5432/tjdw"
    val username = "tj_root"
    val password = "77pbV1YU!T"
    Class.forName(driverName)
    val connectionInstance = DriverManager.getConnection(connectionUrl, username, password)
    val statementInstance = connectionInstance.createStatement()
    val sqlQuery = "select charge_code_id,service_provider_id,service_provider_name,dest_number,dest_number_code,price,charge_code_name,sms_business_text from bdl.honeycomb_sms_bridge_business"
    val resultSetInstance = statementInstance.executeQuery(sqlQuery)
    var referenceTableMap = scala.collection.mutable.Map[String, Tuple7[String, Integer, String, String, String, Integer, Integer]]()
    while (resultSetInstance.next()) {
      if (!referenceTableMap.contains(resultSetInstance.getString("sms_business_text"))) {
        referenceTableMap(resultSetInstance.getString("sms_business_text")) = Tuple7(resultSetInstance.getString("charge_code_name"), resultSetInstance.getInt("price"), resultSetInstance.getString("dest_number_code"), resultSetInstance.getString("dest_number"), resultSetInstance.getString("service_provider_name"), resultSetInstance.getInt("service_provider_id"), resultSetInstance.getInt("charge_code_id"))
      }
    }
//    for ((k, v) <- referenceTableMap) printf("这是在主函数中key: %s, value: %s\n", k, v)
    return referenceTableMap
  }

  def allTheCompletion(line: String, bc: Broadcast[scala.collection.mutable.Map[String, (String, Integer, String, String, String, Integer, Integer)]], lnc: Accumulator[Long]): String = {
    //    for ((k, v) <- bc.value) printf("这是在Executor中，也就是每个Map中key: %s, value: %s\n", k, v)
    lnc.add(1)
    return "123"
  }

  def start(inputpath: String, outputpaath: String): Unit = {
    val conf = new SparkConf().setAppName("短信附加信息添加")
    val sparkContext = new SparkContext(conf)
    val bc = sparkContext.broadcast(getReferenceMap())
    val lnc = sparkContext.accumulator(0L, "LineNumberCounter")
    val inputlinesRDD = sparkContext.textFile(inputpath)
    inputlinesRDD.map(line => allTheCompletion(line, bc, lnc)).coalesce(1, true).saveAsTextFile(outputpaath)
    println("一共处理了%d行", lnc.value)
  }
}
