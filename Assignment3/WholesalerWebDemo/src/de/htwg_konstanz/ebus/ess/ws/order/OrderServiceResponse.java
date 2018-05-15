
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE"/>
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
    "orderresponse"
})
@XmlRootElement(name = "OrderServiceResponse", namespace = "http://www.htwg-konstanz.de/ebsf/ws/order")
public class OrderServiceResponse {

    @XmlElement(name = "ORDERRESPONSE", required = true)
    protected ORDERRESPONSE orderresponse;

    /**
     * Ruft den Wert der orderresponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ORDERRESPONSE }
     *     
     */
    public ORDERRESPONSE getORDERRESPONSE() {
        return orderresponse;
    }

    /**
     * Legt den Wert der orderresponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERRESPONSE }
     *     
     */
    public void setORDERRESPONSE(ORDERRESPONSE value) {
        this.orderresponse = value;
    }

}
