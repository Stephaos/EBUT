
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}DESCRIPTION_SHORT"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}DESCRIPTION_LONG" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}EAN" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}SUPPLIER_ALT_AID" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}BUYER_AID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}MANUFACTURER_AID" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}MANUFACTURER_NAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}MANUFACTURER_TYPE_DESCR" minOccurs="0"/>
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
    "descriptionshort",
    "descriptionlong",
    "ean",
    "supplieraltaid",
    "buyeraid",
    "manufactureraid",
    "manufacturername",
    "manufacturertypedescr"
})
@XmlRootElement(name = "ARTICLE_DETAILS")
public class ARTICLEDETAILS {

    @XmlElement(name = "DESCRIPTION_SHORT", required = true)
    protected String descriptionshort;
    @XmlElement(name = "DESCRIPTION_LONG")
    protected String descriptionlong;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "SUPPLIER_ALT_AID")
    protected String supplieraltaid;
    @XmlElement(name = "BUYER_AID")
    protected List<BUYERAID> buyeraid;
    @XmlElement(name = "MANUFACTURER_AID")
    protected String manufactureraid;
    @XmlElement(name = "MANUFACTURER_NAME")
    protected String manufacturername;
    @XmlElement(name = "MANUFACTURER_TYPE_DESCR")
    protected String manufacturertypedescr;

    /**
     * ePSDB: product.description_short
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTIONSHORT() {
        return descriptionshort;
    }

    /**
     * Legt den Wert der descriptionshort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTIONSHORT(String value) {
        this.descriptionshort = value;
    }

    /**
     * ePSDB: product.description_long
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTIONLONG() {
        return descriptionlong;
    }

    /**
     * Legt den Wert der descriptionlong-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTIONLONG(String value) {
        this.descriptionlong = value;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Legt den Wert der ean-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERALTAID() {
        return supplieraltaid;
    }

    /**
     * Legt den Wert der supplieraltaid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERALTAID(String value) {
        this.supplieraltaid = value;
    }

    /**
     * kann beim Einlesen ignoriert werden Gets the value of the buyeraid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyeraid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBUYERAID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BUYERAID }
     * 
     * 
     */
    public List<BUYERAID> getBUYERAID() {
        if (buyeraid == null) {
            buyeraid = new ArrayList<BUYERAID>();
        }
        return this.buyeraid;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUFACTURERAID() {
        return manufactureraid;
    }

    /**
     * Legt den Wert der manufactureraid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUFACTURERAID(String value) {
        this.manufactureraid = value;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUFACTURERNAME() {
        return manufacturername;
    }

    /**
     * Legt den Wert der manufacturername-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUFACTURERNAME(String value) {
        this.manufacturername = value;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUFACTURERTYPEDESCR() {
        return manufacturertypedescr;
    }

    /**
     * Legt den Wert der manufacturertypedescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUFACTURERTYPEDESCR(String value) {
        this.manufacturertypedescr = value;
    }

}
