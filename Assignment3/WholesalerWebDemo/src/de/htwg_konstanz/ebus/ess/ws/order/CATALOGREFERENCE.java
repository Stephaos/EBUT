
package de.htwg_konstanz.ebus.ess.ws.order;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CATALOG_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CATALOG_VERSION"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CATALOG_NAME" minOccurs="0"/>
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
    "catalogid",
    "catalogversion",
    "catalogname"
})
@XmlRootElement(name = "CATALOG_REFERENCE")
public class CATALOGREFERENCE {

    @XmlElement(name = "CATALOG_ID", required = true)
    protected String catalogid;
    @XmlElement(name = "CATALOG_VERSION", required = true)
    protected String catalogversion;
    @XmlElement(name = "CATALOG_NAME")
    protected String catalogname;

    /**
     * Ruft den Wert der catalogid-Eigenschaft ab.
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
     * Ruft den Wert der catalogversion-Eigenschaft ab.
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
     * Ruft den Wert der catalogname-Eigenschaft ab.
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

}
