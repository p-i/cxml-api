//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.06 at 12:52:04 AM EDT 
//


package org.cxml.fulfull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PackageIdentification")
public class PackageIdentification {

    @XmlAttribute(name = "rangeBegin", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rangeBegin;
    @XmlAttribute(name = "rangeEnd", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rangeEnd;

    /**
     * Gets the value of the rangeBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeBegin() {
        return rangeBegin;
    }

    /**
     * Sets the value of the rangeBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeBegin(String value) {
        this.rangeBegin = value;
    }

    /**
     * Gets the value of the rangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeEnd() {
        return rangeEnd;
    }

    /**
     * Sets the value of the rangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeEnd(String value) {
        this.rangeEnd = value;
    }

}
