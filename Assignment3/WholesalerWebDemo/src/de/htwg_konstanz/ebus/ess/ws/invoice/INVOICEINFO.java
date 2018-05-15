
package de.htwg_konstanz.ebus.ess.ws.invoice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_DATE"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BUYER_PARTY"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_PARTY"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PRICE_CURRENCY"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PAYMENT" minOccurs="0"/>
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
    "invoiceid",
    "invoicedate",
    "buyerparty",
    "supplierparty",
    "pricecurrency",
    "payment",
    "remark"
})
@XmlRootElement(name = "INVOICE_INFO")
public class INVOICEINFO {

    @XmlElement(name = "INVOICE_ID", required = true)
    protected String invoiceid;
    @XmlElement(name = "INVOICE_DATE", required = true)
    protected String invoicedate;
    @XmlElement(name = "BUYER_PARTY", required = true)
    protected BUYERPARTY buyerparty;
    @XmlElement(name = "SUPPLIER_PARTY", required = true)
    protected SUPPLIERPARTY supplierparty;
    @XmlElement(name = "PRICE_CURRENCY", required = true)
    @XmlSchemaType(name = "string")
    protected DtCURRENCIES pricecurrency;
    @XmlElement(name = "PAYMENT")
    protected PAYMENT payment;
    @XmlElement(name = "REMARK")
    protected List<REMARK> remark;

    /**
     * Ruft den Wert der invoiceid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICEID() {
        return invoiceid;
    }

    /**
     * Legt den Wert der invoiceid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICEID(String value) {
        this.invoiceid = value;
    }

    /**
     * Ruft den Wert der invoicedate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICEDATE() {
        return invoicedate;
    }

    /**
     * Legt den Wert der invoicedate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICEDATE(String value) {
        this.invoicedate = value;
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
     * Ruft den Wert der pricecurrency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DtCURRENCIES }
     *     
     */
    public DtCURRENCIES getPRICECURRENCY() {
        return pricecurrency;
    }

    /**
     * Legt den Wert der pricecurrency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtCURRENCIES }
     *     
     */
    public void setPRICECURRENCY(DtCURRENCIES value) {
        this.pricecurrency = value;
    }

    /**
     * Ruft den Wert der payment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENT }
     *     
     */
    public PAYMENT getPAYMENT() {
        return payment;
    }

    /**
     * Legt den Wert der payment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENT }
     *     
     */
    public void setPAYMENT(PAYMENT value) {
        this.payment = value;
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
