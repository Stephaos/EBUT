
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CONTROL_INFO" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_INFO"/>
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
    "controlinfo",
    "orderinfo"
})
@XmlRootElement(name = "ORDER_HEADER")
public class ORDERHEADER {

    @XmlElement(name = "CONTROL_INFO")
    protected CONTROLINFO controlinfo;
    @XmlElement(name = "ORDER_INFO", required = true)
    protected ORDERINFO orderinfo;

    /**
     * Ruft den Wert der controlinfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CONTROLINFO }
     *     
     */
    public CONTROLINFO getCONTROLINFO() {
        return controlinfo;
    }

    /**
     * Legt den Wert der controlinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTROLINFO }
     *     
     */
    public void setCONTROLINFO(CONTROLINFO value) {
        this.controlinfo = value;
    }

    /**
     * CHANGED: PARTIAL_SHIPMENT_ALLOWED.minOccurs="1" / PARTIAL_SHIPMENT_ALLOWED.WERT=FALSE; CHANGED: PRICE_CURRENCY.minOccurs="1"
     * 
     * @return
     *     possible object is
     *     {@link ORDERINFO }
     *     
     */
    public ORDERINFO getORDERINFO() {
        return orderinfo;
    }

    /**
     * Legt den Wert der orderinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERINFO }
     *     
     */
    public void setORDERINFO(ORDERINFO value) {
        this.orderinfo = value;
    }

}
