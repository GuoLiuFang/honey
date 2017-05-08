package com.funcoming.niubi

import java.sql.DriverManager

/**
  * Created by LiuFangGuo on 5/8/17.
  */
object SMSCompletion {
  def getReferenceMap(): Map[String, Tuple7[String, Integer, String, String, String, Integer, Integer]] = {
    val driverName = "org.postgresql.Driver"
    val connectionUrl = "jdbc:postgresql://192.168.12.14:5432/tjdw"
    val username = "tj_root"
    val password = "77pbV1YU!T"
    Class.forName(driverName)
    val connectionInstance = DriverManager.getConnection(connectionUrl, username, password)
    val statementInstance = connectionInstance.createStatement()
    val sqlQuery = "select charge_code_id,service_provider_id,service_provider_name,dest_number,dest_number_code,price,charge_code_name,sms_business_text from bdl.honeycomb_sms_bridge_business"
    val resultSetInstance = statementInstance.executeQuery(sqlQuery)
    var referenceTableMap: Map[String, Tuple7[String, Integer, String, String, String, Integer, Integer]] = Map()
    while (resultSetInstance.next()) {
      if (!referenceTableMap.contains(resultSetInstance.getString("sms_business_text"))) {
        referenceTableMap += (resultSetInstance.getString("sms_business_text") -> Tuple7(resultSetInstance.getString("charge_code_name"), resultSetInstance.getInt("price"), resultSetInstance.getString("dest_number_code"), resultSetInstance.getString("dest_number"), resultSetInstance.getString("service_provider_name"), resultSetInstance.getInt("service_provider_id"), resultSetInstance.getInt("charge_code_id")))
      }
    }
    //    for ((k, v) <- referenceTableMap) printf("key: %s, value: %s\n", k, v)
    return referenceTableMap
  }

  def main(args: Array[String]): Unit = {
    getReferenceMap()

  }

}
