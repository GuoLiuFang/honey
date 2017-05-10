
package com.tigerjoys.panda.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "locate", propOrder = {
    "uuid",
    "ips"
})
public class Locate {

    protected long uuid;
    protected String ips;

    /**
     * Gets the value of the uuid property.
     * 
     */
    public long getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     */
    public void setUuid(long value) {
        this.uuid = value;
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
