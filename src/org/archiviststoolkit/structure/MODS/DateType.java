//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.22 at 10:33:51 PM EDT 
//


package org.archiviststoolkit.structure.MODS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.archiviststoolkit.structure.MODS.BaseDateType;
//import org.archiviststoolkit.structure.MODS.DateType;


/**
 * <p>Java class for dateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>baseDateType">
 *       &lt;attribute name="keyDate">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="yes"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateType")
public class DateType
    extends BaseDateType
{

    @XmlAttribute
    protected String keyDate;

    /**
     * Gets the value of the keyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyDate() {
        return keyDate;
    }

    /**
     * Sets the value of the keyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyDate(String value) {
        this.keyDate = value;
    }

}
