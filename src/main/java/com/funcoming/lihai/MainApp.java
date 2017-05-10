package com.funcoming.lihai;

import com.tigerjoys.panda.ws.Location;
import com.tigerjoys.panda.ws.LocationWebService;
import com.tigerjoys.panda.ws.LocationWebService_Service;
import com.tigerjoys.panda.ws.ResultWapper;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by LiuFangGuo on 5/8/17.
 */
public class MainApp {
    public static void main(String[] args) {
        try {
            URL wsdlUrl = new URL("http://panda.didiman.com:82/Panda/LocationWebService?wsdl");
            LocationWebService_Service locationWebServiceService = new LocationWebService_Service(wsdlUrl, new QName("http://ws.panda.tigerjoys.com/", "LocationWebService"));
            LocationWebService locationWebService = locationWebServiceService.getLocationWebServicePort();
            ResultWapper resultWapper = locationWebService.locate1("", "", "");
            Location result = (Location) resultWapper.getResult();
            System.out.println(result.toString());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
