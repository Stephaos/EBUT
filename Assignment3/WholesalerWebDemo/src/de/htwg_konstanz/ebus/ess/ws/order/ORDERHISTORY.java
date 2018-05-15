
package de.htwg_konstanz.ebus.ess.ws.order;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ALT_CUSTOMER_ORDER_ID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_ORDER_ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_DATE" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DELIVERYNOTE_ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DELIVERYNOTE_DATE" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}AGREEMENT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CATALOG_REFERENCE" minOccurs="0"/>
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
    "altcustomerorderid",
    "supplierorderid",
    "orderdate",
    "deliverynoteid",
    "deliverynotedate",
    "agreement",
    "catalogreference"
})
@XmlRootElement(name = "ORDER_HISTORY")
public class ORDERHISTORY {

    @XmlElement(name = "ORDER_ID", required = true)
    protected String orderid;
    @XmlElement(name = "ALT_CUSTOMER_ORDER_ID")
    protected List<String> altcustomerorderid;
    @XmlElement(name = "SUPPLIER_ORDER_ID")
    protected String supplierorderid;
    @XmlElement(name = "ORDER_DATE")
    protected String orderdate;
    @XmlElement(name = "DELIVERYNOTE_ID")
    protected String deliverynoteid;
    @XmlElement(name = "DELIVERYNOTE_DATE")
    protected String deliverynotedate;
    @XmlElement(name = "AGREEMENT")
    protected List<AGREEMENT> agreement;
    @XmlElement(name = "CATALOG_REFERENCE")
    protected CATALOGREFERENCE catalogreference;

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
     * Gets the value of the altcustomerorderid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altcustomerorderid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getALTCUSTOMERORDERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getALTCUSTOMERORDERID() {
        if (altcustomerorderid == null) {
            altcustomerorderid = new ArrayList<String>();
        }
        return this.altcustomerorderid;
    }

    /**
     * Ruft den Wert der supplierorderid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERORDERID() {
        return supplierorderid;
    }

    /**
     * Legt den Wert der supplierorderid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERORDERID(String value) {
        this.supplierorderid = value;
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
     * Ruft den Wert der deliverynoteid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYNOTEID() {
        return deliverynoteid;
    }

    /**
     * Legt den Wert der deliverynoteid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYNOTEID(String value) {
        this.deliverynoteid = value;
    }

    /**
     * Ruft den Wert der deliverynotedate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYNOTEDATE() {
        return deliverynotedate;
    }

    /**
     * Legt den Wert der deliverynotedate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYNOTEDATE(String value) {
        this.deliverynotedate = value;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAGREEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGREEMENT }
     * 
     * 
     */
    public List<AGREEMENT> getAGREEMENT() {
        if (agreement == null) {
            agreement = new ArrayList<AGREEMENT>();
        }
        return this.agreement;
    }

    /**
     * Ruft den Wert der catalogreference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CATALOGREFERENCE }
     *     
     */
    public CATALOGREFERENCE getCATALOGREFERENCE() {
        return catalogreference;
    }

    /**
     * Legt den Wert der catalogreference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CATALOGREFERENCE }
     *     
     */
    public void setCATALOGREFERENCE(CATALOGREFERENCE value) {
        this.catalogreference = value;
    }

}
