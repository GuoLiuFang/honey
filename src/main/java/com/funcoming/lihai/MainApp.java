package com.funcoming.lihai;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

/**
 * Created by LiuFangGuo on 5/8/17.
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("操你妈");
        String wsdl_url = "http://panda.didiman.com:82/Panda/LocationWebService?wsdl";
        try {
            RPCServiceClient rpcServiceClient = new RPCServiceClient();
            EndpointReference endpointReference = new EndpointReference(wsdl_url);
            Options rpcServiceClientOptions = rpcServiceClient.getOptions();
            System.out.println();


        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        }


    }
}
