
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}BUYER_ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}BUYER_NAME"/>
 *         &lt;element name="ADDRESS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeADDRESS">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="buyer" />
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
    "buyerid",
    "buyername",
    "address"
})
@XmlRootElement(name = "BUYER")
public class BUYER {

    @XmlElement(name = "BUYER_ID")
    protected BUYERID buyerid;
    @XmlElement(name = "BUYER_NAME", required = true)
    protected String buyername;
    @XmlElement(name = "ADDRESS")
    protected BUYER.ADDRESS address;

    /**
     * Ruft den Wert der buyerid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BUYERID }
     *     
     */
    public BUYERID getBUYERID() {
        return buyerid;
    }

    /**
     * Legt den Wert der buyerid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BUYERID }
     *     
     */
    public void setBUYERID(BUYERID value) {
        this.buyerid = value;
    }

    /**
     * Ruft den Wert der buyername-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUYERNAME() {
        return buyername;
    }

    /**
     * Legt den Wert der buyername-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUYERNAME(String value) {
        this.buyername = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BUYER.ADDRESS }
     *     
     */
    public BUYER.ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BUYER.ADDRESS }
     *     
     */
    public void setADDRESS(BUYER.ADDRESS value) {
        this.address = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeADDRESS">
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="buyer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ADDRESS
        extends TypeADDRESS
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
                return "buyer";
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
