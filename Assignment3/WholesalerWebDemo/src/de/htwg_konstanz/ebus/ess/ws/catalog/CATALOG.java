
package de.htwg_konstanz.ebus.ess.ws.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}LANGUAGE"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CATALOG_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CATALOG_VERSION"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CATALOG_NAME" minOccurs="0"/>
 *         &lt;element name="DATETIME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeDATETIME">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="generation_date" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "language",
    "catalogid",
    "catalogversion",
    "catalogname",
    "datetime"
})
@XmlRootElement(name = "CATALOG")
public class CATALOG {

    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "CATALOG_ID", required = true)
    protected String catalogid;
    @XmlElement(name = "CATALOG_VERSION", required = true)
    protected String catalogversion;
    @XmlElement(name = "CATALOG_NAME")
    protected String catalogname;
    @XmlElement(name = "DATETIME")
    protected CATALOG.DATETIME datetime;

    /**
     * kann beim Einlesen ignoriert werden; sollte DE sein
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATALOGID() {
        return catalogid;
    }

    /**
     * Legt den Wert der catalogid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATALOGID(String value) {
        this.catalogid = value;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATALOGVERSION() {
        return catalogversion;
    }

    /**
     * Legt den Wert der catalogversion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATALOGVERSION(String value) {
        this.catalogversion = value;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATALOGNAME() {
        return catalogname;
    }

    /**
     * Legt den Wert der catalogname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATALOGNAME(String value) {
        this.catalogname = value;
    }

    /**
     * Ruft den Wert der datetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CATALOG.DATETIME }
     *     
     */
    public CATALOG.DATETIME getDATETIME() {
        return datetime;
    }

    /**
     * Legt den Wert der datetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CATALOG.DATETIME }
     *     
     */
    public void setDATETIME(CATALOG.DATETIME value) {
        this.datetime = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeDATETIME">
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="generation_date" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DATETIME
        extends TypeDATETIME
    {

        @XmlAttribute(name = "type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            if (type == null) {
                return "generation_date";
            } else {
                return type;
            }
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
