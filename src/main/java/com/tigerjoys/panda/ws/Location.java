
package com.tigerjoys.panda.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cities" type="{http://ws.panda.tigerjoys.com/}cityVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://ws.panda.tigerjoys.com/}operatorVo" minOccurs="0"/>
 *         &lt;element name="physicalCities" type="{http://ws.panda.tigerjoys.com/}physicalCityVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="physicalProvince" type="{http://ws.panda.tigerjoys.com/}physicalProvinceVo" minOccurs="0"/>
 *         &lt;element name="province" type="{http://ws.panda.tigerjoys.com/}provinceVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "location", propOrder = {
    "cities",
    "operator",
    "physicalCities",
    "physicalProvince",
    "province"
})
public class Location {

    @XmlElement(nillable = true)
    protected List<CityVo> cities;
    protected OperatorVo operator;
    @XmlElement(nillable = true)
    protected List<PhysicalCityVo> physicalCities;
    protected PhysicalProvinceVo physicalProvince;
    protected ProvinceVo province;

    /**
     * Gets the value of the cities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CityVo }
     * 
     * 
     */
    public List<CityVo> getCities() {
        if (cities == null) {
            cities = new ArrayList<CityVo>();
        }
        return this.cities;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorVo }
     *     
     */
    public OperatorVo getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorVo }
     *     
     */
    public void setOperator(OperatorVo value) {
        this.operator = value;
    }

    /**
     * Gets the value of the physicalCities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalCities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalCities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalCityVo }
     * 
     * 
     */
    public List<PhysicalCityVo> getPhysicalCities() {
        if (physicalCities == null) {
            physicalCities = new ArrayList<PhysicalCityVo>();
        }
        return this.physicalCities;
    }

    /**
     * Gets the value of the physicalProvince property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalProvinceVo }
     *     
     */
    public PhysicalProvinceVo getPhysicalProvince() {
        return physicalProvince;
    }

    /**
     * Sets the value of the physicalProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalProvinceVo }
     *     
     */
    public void setPhysicalProvince(PhysicalProvinceVo value) {
        this.physicalProvince = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link ProvinceVo }
     *     
     */
    public ProvinceVo getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvinceVo }
     *     
     */
    public void setProvince(ProvinceVo value) {
        this.province = value;
    }

}
