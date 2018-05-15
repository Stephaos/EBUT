
package de.htwg_konstanz.ebus.ess.ws.delivery;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_DATE"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BUYER_PARTY"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_PARTY"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}REMARK" maxOccurs="unbounded" minOccurs="0"/>
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
    "dispatchnotificationid",
    "dispatchnotificationdate",
    "buyerparty",
    "supplierparty",
    "remark"
})
@XmlRootElement(name = "DISPATCHNOTIFICATION_INFO")
public class DISPATCHNOTIFICATIONINFO {

    @XmlElement(name = "DISPATCHNOTIFICATION_ID", required = true)
    protected String dispatchnotificationid;
    @XmlElement(name = "DISPATCHNOTIFICATION_DATE", required = true)
    protected String dispatchnotificationdate;
    @XmlElement(name = "BUYER_PARTY", required = true)
    protected BUYERPARTY buyerparty;
    @XmlElement(name = "SUPPLIER_PARTY", required = true)
    protected SUPPLIERPARTY supplierparty;
    @XmlElement(name = "REMARK")
    protected List<REMARK> remark;

    /**
     * Ruft den Wert der dispatchnotificationid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPATCHNOTIFICATIONID() {
        return dispatchnotificationid;
    }

    /**
     * Legt den Wert der dispatchnotificationid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPATCHNOTIFICATIONID(String value) {
        this.dispatchnotificationid = value;
    }

    /**
     * Ruft den Wert der dispatchnotificationdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPATCHNOTIFICATIONDATE() {
        return dispatchnotificationdate;
    }

    /**
     * Legt den Wert der dispatchnotificationdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPATCHNOTIFICATIONDATE(String value) {
        this.dispatchnotificationdate = value;
    }

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

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREMARK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REMARK }
     * 
     * 
     */
    public List<REMARK> getREMARK() {
        if (remark == null) {
            remark = new ArrayList<REMARK>();
        }
        return this.remark;
    }

}
