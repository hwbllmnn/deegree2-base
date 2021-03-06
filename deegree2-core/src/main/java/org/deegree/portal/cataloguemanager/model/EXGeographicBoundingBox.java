//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.16 at 05:01:18 PM GMT 
//


package org.deegree.portal.cataloguemanager.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}extentTypeCode"/>
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}westBoundLongitude"/>
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}eastBoundLongitude"/>
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}southBoundLatitude"/>
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}northBoundLatitude"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extentTypeCode",
    "westBoundLongitude",
    "eastBoundLongitude",
    "southBoundLatitude",
    "northBoundLatitude"
})
@XmlRootElement(name = "EX_GeographicBoundingBox")
public class EXGeographicBoundingBox {

    @XmlElement(required = true)
    protected ExtentTypeCode extentTypeCode;
    @XmlElement(required = true)
    protected WestBoundLongitude westBoundLongitude;
    @XmlElement(required = true)
    protected EastBoundLongitude eastBoundLongitude;
    @XmlElement(required = true)
    protected SouthBoundLatitude southBoundLatitude;
    @XmlElement(required = true)
    protected NorthBoundLatitude northBoundLatitude;

    /**
     * Gets the value of the extentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExtentTypeCode }
     *     
     */
    public ExtentTypeCode getExtentTypeCode() {
        return extentTypeCode;
    }

    /**
     * Sets the value of the extentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtentTypeCode }
     *     
     */
    public void setExtentTypeCode(ExtentTypeCode value) {
        this.extentTypeCode = value;
    }

    /**
     * Gets the value of the westBoundLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link WestBoundLongitude }
     *     
     */
    public WestBoundLongitude getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * Sets the value of the westBoundLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link WestBoundLongitude }
     *     
     */
    public void setWestBoundLongitude(WestBoundLongitude value) {
        this.westBoundLongitude = value;
    }

    /**
     * Gets the value of the eastBoundLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link EastBoundLongitude }
     *     
     */
    public EastBoundLongitude getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * Sets the value of the eastBoundLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link EastBoundLongitude }
     *     
     */
    public void setEastBoundLongitude(EastBoundLongitude value) {
        this.eastBoundLongitude = value;
    }

    /**
     * Gets the value of the southBoundLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link SouthBoundLatitude }
     *     
     */
    public SouthBoundLatitude getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * Sets the value of the southBoundLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link SouthBoundLatitude }
     *     
     */
    public void setSouthBoundLatitude(SouthBoundLatitude value) {
        this.southBoundLatitude = value;
    }

    /**
     * Gets the value of the northBoundLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link NorthBoundLatitude }
     *     
     */
    public NorthBoundLatitude getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * Sets the value of the northBoundLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link NorthBoundLatitude }
     *     
     */
    public void setNorthBoundLatitude(NorthBoundLatitude value) {
        this.northBoundLatitude = value;
    }

}
