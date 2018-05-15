
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PAYMENT_TERM"/>
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
    "paymentterm"
})
@XmlRootElement(name = "CASH")
public class CASH {

    @XmlElement(name = "PAYMENT_TERM", required = true)
    protected PAYMENTTERM paymentterm;

    /**
     * Ruft den Wert der paymentterm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTTERM }
     *     
     */
    public PAYMENTTERM getPAYMENTTERM() {
        return paymentterm;
    }

    /**
     * Legt den Wert der paymentterm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTTERM }
     *     
     */
    public void setPAYMENTTERM(PAYMENTTERM value) {
        this.paymentterm = value;
    }

}
