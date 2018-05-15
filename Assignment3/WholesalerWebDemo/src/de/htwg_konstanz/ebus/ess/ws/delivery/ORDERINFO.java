
package de.htwg_konstanz.ebus.ess.ws.delivery;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_DATE"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_PARTIES"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PRICE_CURRENCY"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PARTIAL_SHIPMENT_ALLOWED"/>
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
    "orderid",
    "orderdate",
    "orderparties",
    "pricecurrency",
    "partialshipmentallowed",
    "remark"
})
@XmlRootElement(name = "ORDER_INFO")
public class ORDERINFO {

    @XmlElement(name = "ORDER_ID", required = true)
    protected String orderid;
    @XmlElement(name = "ORDER_DATE", required = true)
    protected String orderdate;
    @XmlElement(name = "ORDER_PARTIES", required = true)
    protected ORDERPARTIES orderparties;
    @XmlElement(name = "PRICE_CURRENCY", required = true)
    @XmlSchemaType(name = "string")
    protected DtCURRENCIES pricecurrency;
    @XmlElement(name = "PARTIAL_SHIPMENT_ALLOWED", required = true)
    protected String partialshipmentallowed;
    @XmlElement(name = "REMARK")
    protected List<REMARK> remark;

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

    /**
     * Ruft den Wert der orderparties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ORDERPARTIES }
     *     
     */
    public ORDERPARTIES getORDERPARTIES() {
        return orderparties;
    }

    /**
     * Legt den Wert der orderparties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERPARTIES }
     *     
     */
    public void setORDERPARTIES(ORDERPARTIES value) {
        this.orderparties = value;
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
     * Ruft den Wert der partialshipmentallowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTIALSHIPMENTALLOWED() {
        return partialshipmentallowed;
    }

    /**
     * Legt den Wert der partialshipmentallowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTIALSHIPMENTALLOWED(String value) {
        this.partialshipmentallowed = value;
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
