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
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}specification"/>
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}explanation"/>
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}pass"/>
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
    "specification",
    "explanation",
    "pass"
})
@XmlRootElement(name = "DQ_ConformanceResult")
public class DQConformanceResult {

    @XmlElement(required = true)
    protected Specification specification;
    @XmlElement(required = true)
    protected Explanation explanation;
    @XmlElement(required = true)
    protected Pass pass;

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link Specification }
     *     
     */
    public Specification getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Specification }
     *     
     */
    public void setSpecification(Specification value) {
        this.specification = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link Explanation }
     *     
     */
    public Explanation getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Explanation }
     *     
     */
    public void setExplanation(Explanation value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the pass property.
     * 
     * @return
     *     possible object is
     *     {@link Pass }
     *     
     */
    public Pass getPass() {
        return pass;
    }

    /**
     * Sets the value of the pass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pass }
     *     
     */
    public void setPass(Pass value) {
        this.pass = value;
    }

}
