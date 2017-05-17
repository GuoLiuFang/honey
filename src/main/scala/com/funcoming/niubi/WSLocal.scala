package com.funcoming.niubi

import com.funcoming.lihai.MainApp
import org.apache.spark.{Accumulator, SparkConf, SparkContext}

/**
  * Created by LiuFangGuo on 5/8/17.
  */
object WSLocal {

  def main(args: Array[String]): Unit = {
    start(args(0), args(1))
  }

  def allTheCompletion(line: String, lnc: Accumulator[Long]): String = {
    lnc.add(1)
    val splitArray: Array[String] = line.split("[|]")
    val sc = splitArray(10)
    val imsi = splitArray(4)
    val md5Str = splitArray(28)
    val sms_business_text = splitArray(20)
    //    val start = System.currentTimeMillis()
    val location = MainApp.getLocation(sc, imsi, sms_business_text)
    //    val end = System.currentTimeMillis()
    //    println("本次 web service 调用共花费" + (end - start))
    //    val md5Str = MainApp.getLineMD5(line)
    return md5Str + "|" + location
  }

  def start(inputpath: String, outputpaath: String): Unit = {
    val conf = new SparkConf().setAppName("local NOparalize")
    //    val conf = new SparkConf().setAppName("local NOparalize").setMaster("local")
    val sparkContext = new SparkContext(conf)
    val lnc = sparkContext.accumulator(0L, "LineNumberCounter")
    val inputlinesRDD = sparkContext.textFile(inputpath)
    inputlinesRDD.map(line => allTheCompletion(line, lnc)).coalesce(1, true).saveAsTextFile(outputpaath)
    println("一共处理了%d行", lnc.value)
  }

}
