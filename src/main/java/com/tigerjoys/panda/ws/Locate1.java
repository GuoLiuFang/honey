
package com.tigerjoys.panda.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locate1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ips" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locate1", propOrder = {
    "sc",
    "imsi",
    "ips"
})
public class Locate1 {

    protected String sc;
    protected String imsi;
    protected String ips;

    /**
     * Gets the value of the sc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSc() {
        return sc;
    }

    /**
     * Sets the value of the sc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSc(String value) {
        this.sc = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the ips property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIps() {
        return ips;
    }

    /**
     * Sets the value of the ips property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIps(String value) {
        this.ips = value;
    }

}
