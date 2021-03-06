
package com.tigerjoys.panda.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LocationWebService", targetNamespace = "http://ws.panda.tigerjoys.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocationWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.tigerjoys.panda.ws.ProvinceVo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProvincesByIds", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.GetProvincesByIds")
    @ResponseWrapper(localName = "getProvincesByIdsResponse", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.GetProvincesByIdsResponse")
    public List<ProvinceVo> getProvincesByIds(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Long> arg0);

    /**
     * 
     * @param sc
     * @param imsi
     * @param ips
     * @return
     *     returns com.tigerjoys.panda.ws.ResultWapper
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "locate1", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.Locate1")
    @ResponseWrapper(localName = "locate1Response", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.Locate1Response")
    public ResultWapper locate1(
        @WebParam(name = "sc", targetNamespace = "")
        String sc,
        @WebParam(name = "imsi", targetNamespace = "")
        String imsi,
        @WebParam(name = "ips", targetNamespace = "")
        String ips);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.tigerjoys.panda.ws.CityVo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCitiesByProvince", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.GetCitiesByProvince")
    @ResponseWrapper(localName = "getCitiesByProvinceResponse", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.GetCitiesByProvinceResponse")
    public List<CityVo> getCitiesByProvince(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param uuid
     * @param ips
     * @return
     *     returns com.tigerjoys.panda.ws.ResultWapper
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "locate", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.Locate")
    @ResponseWrapper(localName = "locateResponse", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.LocateResponse")
    public ResultWapper locate(
        @WebParam(name = "uuid", targetNamespace = "")
        long uuid,
        @WebParam(name = "ips", targetNamespace = "")
        String ips);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.tigerjoys.panda.ws.CityVo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCitiesByIds", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.GetCitiesByIds")
    @ResponseWrapper(localName = "getCitiesByIdsResponse", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.GetCitiesByIdsResponse")
    public List<CityVo> getCitiesByIds(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Long> arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.tigerjoys.panda.ws.ProvinceVo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllProvinces", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.GetAllProvinces")
    @ResponseWrapper(localName = "getAllProvincesResponse", targetNamespace = "http://ws.panda.tigerjoys.com/", className = "com.tigerjoys.panda.ws.GetAllProvincesResponse")
    public List<ProvinceVo> getAllProvinces();

}
