
package com.tigerjoys.panda.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigerjoys.panda.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllProvinces_QNAME = new QName("http://ws.panda.tigerjoys.com/", "getAllProvinces");
    private final static QName _Locate_QNAME = new QName("http://ws.panda.tigerjoys.com/", "locate");
    private final static QName _Locate1_QNAME = new QName("http://ws.panda.tigerjoys.com/", "locate1");
    private final static QName _GetAllProvincesResponse_QNAME = new QName("http://ws.panda.tigerjoys.com/", "getAllProvincesResponse");
    private final static QName _GetCitiesByProvinceResponse_QNAME = new QName("http://ws.panda.tigerjoys.com/", "getCitiesByProvinceResponse");
    private final static QName _GetProvincesByIds_QNAME = new QName("http://ws.panda.tigerjoys.com/", "getProvincesByIds");
    private final static QName _LocateResponse_QNAME = new QName("http://ws.panda.tigerjoys.com/", "locateResponse");
    private final static QName _GetCitiesByIds_QNAME = new QName("http://ws.panda.tigerjoys.com/", "getCitiesByIds");
    private final static QName _GetCitiesByProvince_QNAME = new QName("http://ws.panda.tigerjoys.com/", "getCitiesByProvince");
    private final static QName _GetProvincesByIdsResponse_QNAME = new QName("http://ws.panda.tigerjoys.com/", "getProvincesByIdsResponse");
    private final static QName _GetCitiesByIdsResponse_QNAME = new QName("http://ws.panda.tigerjoys.com/", "getCitiesByIdsResponse");
    private final static QName _Locate1Response_QNAME = new QName("http://ws.panda.tigerjoys.com/", "locate1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigerjoys.panda.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCitiesByIds }
     * 
     */
    public GetCitiesByIds createGetCitiesByIds() {
        return new GetCitiesByIds();
    }

    /**
     * Create an instance of {@link GetCitiesByProvince }
     * 
     */
    public GetCitiesByProvince createGetCitiesByProvince() {
        return new GetCitiesByProvince();
    }

    /**
     * Create an instance of {@link GetProvincesByIdsResponse }
     * 
     */
    public GetProvincesByIdsResponse createGetProvincesByIdsResponse() {
        return new GetProvincesByIdsResponse();
    }

    /**
     * Create an instance of {@link GetAllProvinces }
     * 
     */
    public GetAllProvinces createGetAllProvinces() {
        return new GetAllProvinces();
    }

    /**
     * Create an instance of {@link Locate }
     * 
     */
    public Locate createLocate() {
        return new Locate();
    }

    /**
     * Create an instance of {@link Locate1 }
     * 
     */
    public Locate1 createLocate1() {
        return new Locate1();
    }

    /**
     * Create an instance of {@link GetAllProvincesResponse }
     * 
     */
    public GetAllProvincesResponse createGetAllProvincesResponse() {
        return new GetAllProvincesResponse();
    }

    /**
     * Create an instance of {@link GetCitiesByProvinceResponse }
     * 
     */
    public GetCitiesByProvinceResponse createGetCitiesByProvinceResponse() {
        return new GetCitiesByProvinceResponse();
    }

    /**
     * Create an instance of {@link GetProvincesByIds }
     * 
     */
    public GetProvincesByIds createGetProvincesByIds() {
        return new GetProvincesByIds();
    }

    /**
     * Create an instance of {@link LocateResponse }
     * 
     */
    public LocateResponse createLocateResponse() {
        return new LocateResponse();
    }

    /**
     * Create an instance of {@link Locate1Response }
     * 
     */
    public Locate1Response createLocate1Response() {
        return new Locate1Response();
    }

    /**
     * Create an instance of {@link GetCitiesByIdsResponse }
     * 
     */
    public GetCitiesByIdsResponse createGetCitiesByIdsResponse() {
        return new GetCitiesByIdsResponse();
    }

    /**
     * Create an instance of {@link CityVo }
     * 
     */
    public CityVo createCityVo() {
        return new CityVo();
    }

    /**
     * Create an instance of {@link PhysicalCityVo }
     * 
     */
    public PhysicalCityVo createPhysicalCityVo() {
        return new PhysicalCityVo();
    }

    /**
     * Create an instance of {@link ProvinceVo }
     * 
     */
    public ProvinceVo createProvinceVo() {
        return new ProvinceVo();
    }

    /**
     * Create an instance of {@link ResultWapper }
     * 
     */
    public ResultWapper createResultWapper() {
        return new ResultWapper();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link PhysicalProvinceVo }
     * 
     */
    public PhysicalProvinceVo createPhysicalProvinceVo() {
        return new PhysicalProvinceVo();
    }

    /**
     * Create an instance of {@link OperatorVo }
     * 
     */
    public OperatorVo createOperatorVo() {
        return new OperatorVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProvinces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "getAllProvinces")
    public JAXBElement<GetAllProvinces> createGetAllProvinces(GetAllProvinces value) {
        return new JAXBElement<GetAllProvinces>(_GetAllProvinces_QNAME, GetAllProvinces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "locate")
    public JAXBElement<Locate> createLocate(Locate value) {
        return new JAXBElement<Locate>(_Locate_QNAME, Locate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locate1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "locate1")
    public JAXBElement<Locate1> createLocate1(Locate1 value) {
        return new JAXBElement<Locate1>(_Locate1_QNAME, Locate1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProvincesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "getAllProvincesResponse")
    public JAXBElement<GetAllProvincesResponse> createGetAllProvincesResponse(GetAllProvincesResponse value) {
        return new JAXBElement<GetAllProvincesResponse>(_GetAllProvincesResponse_QNAME, GetAllProvincesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitiesByProvinceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "getCitiesByProvinceResponse")
    public JAXBElement<GetCitiesByProvinceResponse> createGetCitiesByProvinceResponse(GetCitiesByProvinceResponse value) {
        return new JAXBElement<GetCitiesByProvinceResponse>(_GetCitiesByProvinceResponse_QNAME, GetCitiesByProvinceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvincesByIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "getProvincesByIds")
    public JAXBElement<GetProvincesByIds> createGetProvincesByIds(GetProvincesByIds value) {
        return new JAXBElement<GetProvincesByIds>(_GetProvincesByIds_QNAME, GetProvincesByIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "locateResponse")
    public JAXBElement<LocateResponse> createLocateResponse(LocateResponse value) {
        return new JAXBElement<LocateResponse>(_LocateResponse_QNAME, LocateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitiesByIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "getCitiesByIds")
    public JAXBElement<GetCitiesByIds> createGetCitiesByIds(GetCitiesByIds value) {
        return new JAXBElement<GetCitiesByIds>(_GetCitiesByIds_QNAME, GetCitiesByIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitiesByProvince }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "getCitiesByProvince")
    public JAXBElement<GetCitiesByProvince> createGetCitiesByProvince(GetCitiesByProvince value) {
        return new JAXBElement<GetCitiesByProvince>(_GetCitiesByProvince_QNAME, GetCitiesByProvince.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvincesByIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "getProvincesByIdsResponse")
    public JAXBElement<GetProvincesByIdsResponse> createGetProvincesByIdsResponse(GetProvincesByIdsResponse value) {
        return new JAXBElement<GetProvincesByIdsResponse>(_GetProvincesByIdsResponse_QNAME, GetProvincesByIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitiesByIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "getCitiesByIdsResponse")
    public JAXBElement<GetCitiesByIdsResponse> createGetCitiesByIdsResponse(GetCitiesByIdsResponse value) {
        return new JAXBElement<GetCitiesByIdsResponse>(_GetCitiesByIdsResponse_QNAME, GetCitiesByIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locate1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.panda.tigerjoys.com/", name = "locate1Response")
    public JAXBElement<Locate1Response> createLocate1Response(Locate1Response value) {
        return new JAXBElement<Locate1Response>(_Locate1Response_QNAME, Locate1Response.class, null, value);
    }

}
