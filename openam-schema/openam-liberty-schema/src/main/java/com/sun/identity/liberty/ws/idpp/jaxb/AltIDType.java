//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.idpp.jaxb;


/**
 * Java content class for AltIDType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-id-sis-pp.xsd line 122)
 * <p>
 * <pre>
 * &lt;complexType name="AltIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}IDValue"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}IDType" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}Extension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:liberty:id-sis-pp:2003-08}commonAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AltIDType {


    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType getExtension();

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType}
     */
    void setExtension(com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType value);

    /**
     * Gets the value of the modificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getModificationTime();

    /**
     * Sets the value of the modificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setModificationTime(java.util.Calendar value);

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.IDTypeElement}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTURI getIDType();

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.IDTypeElement}
     */
    void setIDType(com.sun.identity.liberty.ws.idpp.jaxb.DSTURI value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.IDValueElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTString getIDValue();

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.IDValueElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     */
    void setIDValue(com.sun.identity.liberty.ws.idpp.jaxb.DSTString value);

}
