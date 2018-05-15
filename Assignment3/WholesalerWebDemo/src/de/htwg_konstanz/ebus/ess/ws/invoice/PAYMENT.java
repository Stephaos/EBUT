
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
 *       &lt;choice>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CARD"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ACCOUNT"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DEBIT"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CHECK"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CASH"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "card",
    "account",
    "debit",
    "check",
    "cash"
})
@XmlRootElement(name = "PAYMENT")
public class PAYMENT {

    @XmlElement(name = "CARD")
    protected CARD card;
    @XmlElement(name = "ACCOUNT")
    protected ACCOUNT account;
    @XmlElement(name = "DEBIT")
    protected DEBIT debit;
    @XmlElement(name = "CHECK")
    protected CHECK check;
    @XmlElement(name = "CASH")
    protected CASH cash;

    /**
     * Ruft den Wert der card-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CARD }
     *     
     */
    public CARD getCARD() {
        return card;
    }

    /**
     * Legt den Wert der card-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CARD }
     *     
     */
    public void setCARD(CARD value) {
        this.card = value;
    }

    /**
     * Ruft den Wert der account-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNT }
     *     
     */
    public ACCOUNT getACCOUNT() {
        return account;
    }

    /**
     * Legt den Wert der account-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNT }
     *     
     */
    public void setACCOUNT(ACCOUNT value) {
        this.account = value;
    }

    /**
     * Ruft den Wert der debit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DEBIT }
     *     
     */
    public DEBIT getDEBIT() {
        return debit;
    }

    /**
     * Legt den Wert der debit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DEBIT }
     *     
     */
    public void setDEBIT(DEBIT value) {
        this.debit = value;
    }

    /**
     * Ruft den Wert der check-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CHECK }
     *     
     */
    public CHECK getCHECK() {
        return check;
    }

    /**
     * Legt den Wert der check-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CHECK }
     *     
     */
    public void setCHECK(CHECK value) {
        this.check = value;
    }

    /**
     * Ruft den Wert der cash-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CASH }
     *     
     */
    public CASH getCASH() {
        return cash;
    }

    /**
     * Legt den Wert der cash-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CASH }
     *     
     */
    public void setCASH(CASH value) {
        this.cash = value;
    }

}
