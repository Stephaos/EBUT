
package de.htwg_konstanz.ebus.ess.ws.delivery;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}LINE_ITEM_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_DATE" minOccurs="0"/>
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
    "orderid",
    "lineitemid",
    "orderdate"
})
@XmlRootElement(name = "ORDER_REFERENCE")
public class ORDERREFERENCE {

    @XmlElement(name = "ORDER_ID", required = true)
    protected String orderid;
    @XmlElement(name = "LINE_ITEM_ID", required = true)
    protected String lineitemid;
    @XmlElement(name = "ORDER_DATE")
    protected String orderdate;

    /**
     * Ruft den Wert der orderid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERID() {
        return orderid;
    }

    /**
     * Legt den Wert der orderid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERID(String value) {
        this.orderid = value;
    }

    /**
     * Ruft den Wert der lineitemid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEITEMID() {
        return lineitemid;
    }

    /**
     * Legt den Wert der lineitemid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEITEMID(String value) {
        this.lineitemid = value;
    }

    /**
     * Ruft den Wert der orderdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERDATE() {
        return orderdate;
    }

    /**
     * Legt den Wert der orderdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERDATE(String value) {
        this.orderdate = value;
    }

}
