
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BUYER_PARTY"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_PARTY"/>
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
    "buyerparty",
    "supplierparty"
})
@XmlRootElement(name = "ORDER_PARTIES")
public class ORDERPARTIES {

    @XmlElement(name = "BUYER_PARTY", required = true)
    protected BUYERPARTY buyerparty;
    @XmlElement(name = "SUPPLIER_PARTY", required = true)
    protected SUPPLIERPARTY supplierparty;

    /**
     * Ruft den Wert der buyerparty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BUYERPARTY }
     *     
     */
    public BUYERPARTY getBUYERPARTY() {
        return buyerparty;
    }

    /**
     * Legt den Wert der buyerparty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BUYERPARTY }
     *     
     */
    public void setBUYERPARTY(BUYERPARTY value) {
        this.buyerparty = value;
    }

    /**
     * Ruft den Wert der supplierparty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SUPPLIERPARTY }
     *     
     */
    public SUPPLIERPARTY getSUPPLIERPARTY() {
        return supplierparty;
    }

    /**
     * Legt den Wert der supplierparty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SUPPLIERPARTY }
     *     
     */
    public void setSUPPLIERPARTY(SUPPLIERPARTY value) {
        this.supplierparty = value;
    }

}
