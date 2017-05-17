package com.funcoming.lihai;

import com.tigerjoys.panda.ws.Location;
import com.tigerjoys.panda.ws.LocationWebService;
import com.tigerjoys.panda.ws.LocationWebService_Service;
import com.tigerjoys.panda.ws.ResultWapper;

import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by LiuFangGuo on 5/8/17.
 */
public class MainApp {

    public static String getLocation(String sc, String imsi, String sms_business_text) {
        if (!sms_business_text.equals("\\N")) {

            try {
                URL wsdlUrl = new URL("http://panda.didiman.com:82/Panda/LocationWebService?wsdl");
                LocationWebService_Service locationWebServiceService = new LocationWebService_Service(wsdlUrl, new QName("http://ws.panda.tigerjoys.com/", "LocationWebService"));
                LocationWebService locationWebService = locationWebServiceService.getLocationWebServicePort();
                ResultWapper resultWapper = locationWebService.locate1(sc, imsi, "");
                Location result = (Location) resultWapper.getResult();
                return result.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                System.out.println("调用wsdl的web service出错sc=" + sc + "imsi=" + imsi);
            }
        }
        return "\\N|\\N|\\N|0|null|\\N|\\N|\\N|\\N|\\N|\\N|\\N";
    }

    public static String getLineMD5(String line) {
        try {
            return new BigInteger(1, MessageDigest.getInstance("MD5").digest(line.getBytes())).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.println("生成 MD5失败" + line);
        }
        return "\\N";
    }

    public static void main(String[] args) {
        System.out.println(getLineMD5("abc"));
        String line = "742078621|10658139126311118411|【贵州移动】2月话费电子账单已送达您的139邮箱，看账单邮件戳“立即刮卡”参与刮刮乐活动，30M-2G流量、邮箱积分等您拿，点击查看账单详情 http://y.10086.cn/t?s=gzH0MusICLPB&m=kr9ZK|460024853503185|460024853503185|460024853503185|865157020906402|ShGSh02_GR_DM_YDG|20160808|1002_4.10.20160420.1014_000|8613800851500|015b2b6b-5f94-4d2e-afec-8c176d48b39b|19|9.2.20160808.1757.0|4.4.2|2017-04-07 20:37:55|2017-04-08 02:51:33|ZTE|ZTE Q507T|MTK";
        String[] split = line.split("[|]");
        System.out.println("imsi" + split[4]);
        System.out.println("sc" + split[10]);
        System.out.println("content" + split[2]);
        int i = split[2].indexOf("账单");
        System.out.println("子字符串的关系是index" + split[2].substring(0, i));
        System.out.println("子字符串的关系是index" + split[2].substring(i + "账单".length(), split[2].length()));
        System.out.println("字符串的长度是" + "凤凰圈".length());
        try {
            URL wsdlUrl = new URL("http://panda.didiman.com:82/Panda/LocationWebService?wsdl");
            LocationWebService_Service locationWebServiceService = new LocationWebService_Service(wsdlUrl, new QName("http://ws.panda.tigerjoys.com/", "LocationWebService"));
            LocationWebService locationWebService = locationWebServiceService.getLocationWebServicePort();
            ResultWapper resultWapper = locationWebService.locate1("8613800554500", "460023055405799", "");
            Location result = (Location) resultWapper.getResult();
            System.out.println(result.toString());
            System.out.println("第二波");
            ResultWapper x = locationWebService.locate1(split[10], split[4], "");
            Location y = (Location) x.getResult();
            System.out.println(y.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
