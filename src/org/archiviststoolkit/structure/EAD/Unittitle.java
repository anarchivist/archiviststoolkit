//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.11 at 01:13:59 PM EDT 
//


package org.archiviststoolkit.structure.EAD;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for unittitle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unittitle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{urn:isbn:1-931666-22-9}m.phrase.basic"/>
 *         &lt;group ref="{urn:isbn:1-931666-22-9}m.access"/>
 *         &lt;element name="unitdate" type="{urn:isbn:1-931666-22-9}unitdate"/>
 *         &lt;element name="num" type="{urn:isbn:1-931666-22-9}num"/>
 *         &lt;element name="date" type="{urn:isbn:1-931666-22-9}date"/>
 *         &lt;element name="bibseries" type="{urn:isbn:1-931666-22-9}bibseries"/>
 *         &lt;element name="edition" type="{urn:isbn:1-931666-22-9}edition"/>
 *         &lt;element name="imprint" type="{urn:isbn:1-931666-22-9}imprint"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{urn:isbn:1-931666-22-9}a.common"/>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="encodinganalog" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unittitle", namespace = "urn:isbn:1-931666-22-9", propOrder = {
    "content"
})
public class Unittitle {

    @XmlElementRefs({
        @XmlElementRef(name = "imprint", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "ptr", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "num", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "persname", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "expan", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "extref", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "geogname", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "unitdate", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "name", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "subject", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "occupation", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "archref", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "bibref", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "function", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "emph", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "extptr", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "ref", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "lb", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "genreform", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "title", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "date", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "famname", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "abbr", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "edition", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "linkgrp", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "bibseries", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "corpname", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String label;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String encodinganalog;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String altrender;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String audience;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Imprint }{@code >}
     * {@link JAXBElement }{@code <}{@link Ptr }{@code >}
     * {@link JAXBElement }{@code <}{@link Num }{@code >}
     * {@link JAXBElement }{@code <}{@link Persname }{@code >}
     * {@link JAXBElement }{@code <}{@link Expan }{@code >}
     * {@link JAXBElement }{@code <}{@link Extref }{@code >}
     * {@link JAXBElement }{@code <}{@link Geogname }{@code >}
     * {@link JAXBElement }{@code <}{@link Unitdate }{@code >}
     * {@link JAXBElement }{@code <}{@link Name }{@code >}
     * {@link JAXBElement }{@code <}{@link Subject }{@code >}
     * {@link JAXBElement }{@code <}{@link Occupation }{@code >}
     * {@link JAXBElement }{@code <}{@link Archref }{@code >}
     * {@link JAXBElement }{@code <}{@link Bibref }{@code >}
     * {@link JAXBElement }{@code <}{@link Function }{@code >}
     * {@link JAXBElement }{@code <}{@link Emph }{@code >}
     * {@link JAXBElement }{@code <}{@link Extptr }{@code >}
     * {@link JAXBElement }{@code <}{@link Ref }{@code >}
     * {@link JAXBElement }{@code <}{@link Lb }{@code >}
     * {@link JAXBElement }{@code <}{@link Genreform }{@code >}
     * {@link JAXBElement }{@code <}{@link Title }{@code >}
     * {@link JAXBElement }{@code <}{@link Date }{@code >}
     * {@link JAXBElement }{@code <}{@link Famname }{@code >}
     * {@link JAXBElement }{@code <}{@link Abbr }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link Edition }{@code >}
     * {@link JAXBElement }{@code <}{@link Linkgrp }{@code >}
     * {@link JAXBElement }{@code <}{@link Bibseries }{@code >}
     * {@link JAXBElement }{@code <}{@link Corpname }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the encodinganalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodinganalog() {
        return encodinganalog;
    }

    /**
     * Sets the value of the encodinganalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodinganalog(String value) {
        this.encodinganalog = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the altrender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrender() {
        return altrender;
    }

    /**
     * Sets the value of the altrender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltrender(String value) {
        this.altrender = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

}
