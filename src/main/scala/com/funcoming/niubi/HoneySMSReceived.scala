package com.funcoming.niubi


import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

import scala.util.matching.Regex


/**
  * Created by LiuFangGuo on 201612/01/.
  */
object HoneySMSReceived {
  def main(args: Array[String]): Unit = {
    //    val line = """2017-04-06 00:00:02 [http-nio-8080-exec-132] INFO  c.tigerjoys.controller.LogController - requestId:cd58b9dc-1bb7-4557-98b9-dc1bb7f55781:{"_id":"a684860f-d400-44f9-a317-0ef52a9f41cc","eventId":"sms_received","reasons":{"content":"您好，您4G语音28元套餐2015版中包含的国内语音主叫通话时长为100分钟，截至04月05日23时54分，已通话70分钟，套餐内剩余通话时长30分钟。仅供参考，具体以月结账单为准。如需退订该提醒服务，请回复QXYYTX。中国移动","number":"10086","imsi":"460021726182634"},"timeStamp":1491408001032,"phoneTime":"2017-04-06 00:00:01","phoneBrand":"koobee","e":"867500020049186","tag":"ShZhYSC01_GU_DM_YDG","dm_v":"1002_4.10.20160613.1628_000","sc":"8613800710500","aid":"c531202d-9765-44a8-aa6c-d5ac05966c61","phoneModel":"k509","androidSdk":"19","version":"9.2.20160613.1628.0","imsi1":"460021726182634","sub_tag":"20160613","androidOs":"4.4.4","imsi":"460021726182634","uuid":"734576858","dm_ph":"/system/bin/lpnkey","createTime":"2017-04-06 00:00:02"}"""
    //    val line =
    //      """\N|743015272|10657061191283320|【化州市第一小学】何昭文的家长：您孩子的作业，语文 1、抄写|一15课生字词，每词抄一个。2、熟记本学期单元作文。。请督促完成，可登录客户端查看。|460009714211309|460009714211309|460009714211309|867275026482554|SzZSC06_HA_DM_HGZ|20160808|1002_4.10.20160808.1757_000|\|f0f923b3-b551-4051-87dd-061ff3c11fbb|19|9.2.20160808.1757.0|4.4.4|2016-11-08 16:58:11|2016-11-08 16:58:12|OPPO|msm8916_32|QUALCOMM"""
    //        //    if (line.contains(""""eventId":"sms_received"""")) {
    //        //    }
    //        val phonePlatform_re = new Regex(""""phonePlatform":"(.*?)"""", "phonePlatform")
    //        var phonePlatform = """\N"""
    //        if (!phonePlatform_re.findFirstMatchIn(line).isEmpty) {
    //          val result = phonePlatform_re.findFirstMatchIn(line).get
    //          phonePlatform = result.group("phonePlatform")
    //        }
    //    println(line)
    //    val new_line = line.replaceAll("""[|]""","""""")
    //    println(new_line)
    //
    //    //-------------------------------
    /*
    spark-submit --class com.tigerjoys.log.cleansing.spark.app.HoneySMSReceived --driver-memory 8G --driver-java-options "-XX:MaxPermSize=4G" --executor-memory 8G --num-executors 15 --executor-cores 5 --conf spark.yarn.executo    r.memoryOverhead=2048 --conf spark.shuffle.consolidateFiles=true  /data/sdg/guoliufang/other_work_space/log_cleansing.jar
    /data/logcenter/honeycomb/${whichlog} /user/guoliufang/honeysms
    输入          输出
    */
    start(args(0), args(1))
    //    val xx = clear(line)
    //    println(xx)
  }

  def formateTimeStamp(create_time_tmp: String): String = {
    val date = new Date(java.lang.Long.parseLong(create_time_tmp))
    val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    simpleDateFormat.format(date)
  }

  def clear(line: String): String = {
    //id,uuid,number,content,rimsi,imsi,imsi1,imei,tag,sub_tag,dm_v,sc,aid,android_sdk,loader_version,android_os,create_time,record_time,phoneBrand,phoneModel,phonePlatform
    //    val id =
    //      """\N"""
    val uuid_re = new Regex(""""uuid":"(.*?)"""", "uuid")
    var uuid = """\N"""
    if (!uuid_re.findFirstMatchIn(line).isEmpty) {
      val result = uuid_re.findFirstMatchIn(line).get
      uuid = result.group("uuid").replaceAll("""[|]""","""""")
    }

    val number_re = new Regex(""""number":"(.*?)"""", "number")
    var number = """\N"""
    if (!number_re.findFirstMatchIn(line).isEmpty) {
      val result = number_re.findFirstMatchIn(line).get
      number = result.group("number").replaceAll("""[|]""","""""")
    }

    val content_re = new Regex(""""content":"(.*?)"""", "content")
    var content = """\N"""
    if (!content_re.findFirstMatchIn(line).isEmpty) {
      val result = content_re.findFirstMatchIn(line).get
      content = result.group("content").replaceAll("""[|]""","""""")
    }

    val rimsi_re = new Regex(""""number":".*?","imsi":"(.*?)"""", "rimsi")
    var rimsi = """\N"""
    if (!rimsi_re.findFirstMatchIn(line).isEmpty) {
      val result = rimsi_re.findFirstMatchIn(line).get
      rimsi = result.group("rimsi").replaceAll("""[|]""","""""")
    }

    val imsi_re = new Regex(""""androidOs":".*?","imsi":"(.*?)"""", "imsi")
    var imsi = """\N"""
    if (!imsi_re.findFirstMatchIn(line).isEmpty) {
      val result = imsi_re.findFirstMatchIn(line).get
      imsi = result.group("imsi").replaceAll("""[|]""","""""")
    }

    val imsi1_re = new Regex(""""imsi1":"(.*?)"""", "imsi1")
    var imsi1 = """\N"""
    if (!imsi1_re.findFirstMatchIn(line).isEmpty) {
      val result = imsi1_re.findFirstMatchIn(line).get
      imsi1 = result.group("imsi1").replaceAll("""[|]""","""""")
    }

    val imei_re = new Regex(""""e":"(.*?)"""", "imei")
    var imei = """\N"""
    if (!imei_re.findFirstMatchIn(line).isEmpty) {
      val result = imei_re.findFirstMatchIn(line).get
      imei = result.group("imei").replaceAll("""[|]""","""""")
    }

    val tag_re = new Regex(""""tag":"(.*?)"""", "tag")
    var tag = """\N"""
    if (!tag_re.findFirstMatchIn(line).isEmpty) {
      val result = tag_re.findFirstMatchIn(line).get
      tag = result.group("tag").replaceAll("""[|]""","""""")
    }

    val sub_tag_re = new Regex(""""sub_tag":"(.*?)"""", "sub_tag")
    var sub_tag = """\N"""
    if (!sub_tag_re.findFirstMatchIn(line).isEmpty) {
      val result = sub_tag_re.findFirstMatchIn(line).get
      sub_tag = result.group("sub_tag").replaceAll("""[|]""","""""")
    }

    val dm_v_re = new Regex(""""dm_v":"(.*?)"""", "dm_v")
    var dm_v = """\N"""
    if (!dm_v_re.findFirstMatchIn(line).isEmpty) {
      val result = dm_v_re.findFirstMatchIn(line).get
      dm_v = result.group("dm_v").replaceAll("""[|]""","""""")
    }

    val sc_re = new Regex(""""sc":"(.*?)"""", "sc")
    var sc = """\N"""
    if (!sc_re.findFirstMatchIn(line).isEmpty) {
      val result = sc_re.findFirstMatchIn(line).get
      sc = result.group("sc").replaceAll("""[|]""","""""")
    }

    val aid_re = new Regex(""""aid":"(.*?)"""", "aid")
    var aid = """\N"""
    if (!aid_re.findFirstMatchIn(line).isEmpty) {
      val result = aid_re.findFirstMatchIn(line).get
      aid = result.group("aid").replaceAll("""[|]""","""""")
    }

    val android_sdk_re = new Regex(""""androidSdk":"(.*?)"""", "android_sdk")
    var android_sdk = """\N"""
    if (!android_sdk_re.findFirstMatchIn(line).isEmpty) {
      val result = android_sdk_re.findFirstMatchIn(line).get
      android_sdk = result.group("android_sdk").replaceAll("""[|]""","""""")
    }

    val loader_version_re = new Regex(""""version":"(.*?)"""", "loader_version")
    var loader_version = """\N"""
    if (!loader_version_re.findFirstMatchIn(line).isEmpty) {
      val result = loader_version_re.findFirstMatchIn(line).get
      loader_version = result.group("loader_version").replaceAll("""[|]""","""""")
    }

    val android_os_re = new Regex(""""androidOs":"(.*?)"""", "android_os")
    var android_os = """\N"""
    if (!android_os_re.findFirstMatchIn(line).isEmpty) {
      val result = android_os_re.findFirstMatchIn(line).get
      android_os = result.group("android_os").replaceAll("""[|]""","""""")
    }

    val create_time_re = new Regex(""""timeStamp":(\d*?),""", "create_time")
    var create_time = """\N"""
    if (!create_time_re.findFirstMatchIn(line).isEmpty) {
      val result = create_time_re.findFirstMatchIn(line).get
      val create_time_tmp = result.group("create_time")
      create_time = formateTimeStamp(create_time_tmp).replaceAll("""[|]""","""""")
      //      println("我是 timestape" + create_time)
    }

    val record_time_re = new Regex("""(message:)?(\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2})""", "xx", "record_time")
    var record_time = """\N"""
    if (!record_time_re.findFirstMatchIn(line).isEmpty) {
      val result = record_time_re.findFirstMatchIn(line).get
      //      println("XX的内容是" + result.group("xx"))
      record_time = result.group("record_time").replaceAll("""[|]""","""""")
    }

    val phoneBrand_re = new Regex(""""phoneBrand":"(.*?)"""", "phoneBrand")
    var phoneBrand = """\N"""
    if (!phoneBrand_re.findFirstMatchIn(line).isEmpty) {
      val result = phoneBrand_re.findFirstMatchIn(line).get
      phoneBrand = result.group("phoneBrand").replaceAll("""[|]""","""""")
    }

    val phoneModel_re = new Regex(""""phoneModel":"(.*?)"""", "phoneModel")
    var phoneModel = """\N"""
    if (!phoneModel_re.findFirstMatchIn(line).isEmpty) {
      val result = phoneModel_re.findFirstMatchIn(line).get
      phoneModel = result.group("phoneModel").replaceAll("""[|]""","""""")
    }

    val phonePlatform_re = new Regex(""""phonePlatform":"(.*?)"""", "phonePlatform")
    var phonePlatform = """\N"""
    if (!phonePlatform_re.findFirstMatchIn(line).isEmpty) {
      val result = phonePlatform_re.findFirstMatchIn(line).get
      phonePlatform = result.group("phonePlatform").replaceAll("""[|]""","""""")
    }
    val infinidbstr = uuid + '|' + number + '|' + content + '|' + rimsi + '|' + imsi + '|' + imsi1 + '|' + imei + '|' + tag + '|' + sub_tag + '|' + dm_v + '|' + sc + '|' + aid + '|' + android_sdk + '|' + loader_version + '|' + android_os + '|' + create_time + '|' + record_time + '|' + phoneBrand + '|' + phoneModel + '|' + phonePlatform
    return infinidbstr
  }

  def process(inputlinesRDD: RDD[String], outputpaath: String): Unit = {
    inputlinesRDD.filter(line => line.contains(""""eventId":"sms_received"""")).map(line => clear(line)).coalesce(1, true).saveAsTextFile(outputpaath)
  }

  def start(inputpath: String, outputpaath: String): Unit = {
    val conf = new SparkConf().setAppName("短信文本清洗")
    val sparkContext = new SparkContext(conf)
    val inputlinesRDD = sparkContext.textFile(inputpath)
    process(inputlinesRDD, outputpaath)
  }


}
