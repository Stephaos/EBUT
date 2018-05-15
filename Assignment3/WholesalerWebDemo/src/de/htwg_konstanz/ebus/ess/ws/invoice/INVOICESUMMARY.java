
package de.htwg_konstanz.ebus.ess.ws.invoice;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TOTAL_ITEM_NUM"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TOTAL_AMOUNT"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TOTAL_TAX_AMOUNT"/>
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
    "totalitemnum",
    "totalamount",
    "totaltaxamount"
})
@XmlRootElement(name = "INVOICE_SUMMARY")
public class INVOICESUMMARY {

    @XmlElement(name = "TOTAL_ITEM_NUM", required = true)
    protected BigInteger totalitemnum;
    @XmlElement(name = "TOTAL_AMOUNT", required = true)
    protected BigDecimal totalamount;
    @XmlElement(name = "TOTAL_TAX_AMOUNT", required = true)
    protected BigDecimal totaltaxamount;

    /**
     * Ruft den Wert der totalitemnum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTOTALITEMNUM() {
        return totalitemnum;
    }

    /**
     * Legt den Wert der totalitemnum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTOTALITEMNUM(BigInteger value) {
        this.totalitemnum = value;
    }

    /**
     * Ruft den Wert der totalamount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALAMOUNT() {
        return totalamount;
    }

    /**
     * Legt den Wert der totalamount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALAMOUNT(BigDecimal value) {
        this.totalamount = value;
    }

    /**
     * Ruft den Wert der totaltaxamount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALTAXAMOUNT() {
        return totaltaxamount;
    }

    /**
     * Legt den Wert der totaltaxamount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALTAXAMOUNT(BigDecimal value) {
        this.totaltaxamount = value;
    }

}
