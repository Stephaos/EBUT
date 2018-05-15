
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_ORDER_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_ORDER_ITEM_ID"/>
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
    "supplierorderid",
    "supplierorderitemid"
})
@XmlRootElement(name = "SUPPLIER_ORDER_REFERENCE")
public class SUPPLIERORDERREFERENCE {

    @XmlElement(name = "SUPPLIER_ORDER_ID", required = true)
    protected String supplierorderid;
    @XmlElement(name = "SUPPLIER_ORDER_ITEM_ID", required = true)
    protected String supplierorderitemid;

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
     * Ruft den Wert der supplierorderitemid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERORDERITEMID() {
        return supplierorderitemid;
    }

    /**
     * Legt den Wert der supplierorderitemid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERORDERITEMID(String value) {
        this.supplierorderitemid = value;
    }

}
