
package de.htwg_konstanz.ebus.ess.ws.invoice;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_AID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DESCRIPTION_SHORT" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DESCRIPTION_LONG" minOccurs="0"/>
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
    "supplieraid",
    "descriptionshort",
    "descriptionlong"
})
@XmlRootElement(name = "ARTICLE_ID")
public class ARTICLEID {

    @XmlElement(name = "SUPPLIER_AID", required = true)
    protected String supplieraid;
    @XmlElement(name = "DESCRIPTION_SHORT")
    protected String descriptionshort;
    @XmlElement(name = "DESCRIPTION_LONG")
    protected String descriptionlong;

    /**
     * in ePS: product.order_number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERAID() {
        return supplieraid;
    }

    /**
     * Legt den Wert der supplieraid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERAID(String value) {
        this.supplieraid = value;
    }

    /**
     * in ePS: product.descr_short
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
     * in ePS: product.descr_long
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

}
