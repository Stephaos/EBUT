
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}SUPPLIER_ID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}SUPPLIER_NAME"/>
 *         &lt;element name="ADDRESS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeADDRESS">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="supplier" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "supplierid",
    "suppliername",
    "address"
})
@XmlRootElement(name = "SUPPLIER")
public class SUPPLIER {

    @XmlElement(name = "SUPPLIER_ID")
    protected List<SUPPLIERID> supplierid;
    @XmlElement(name = "SUPPLIER_NAME", required = true)
    protected String suppliername;
    @XmlElement(name = "ADDRESS")
    protected SUPPLIER.ADDRESS address;

    /**
     * kann beim Einlesen ignoriert werden Gets the value of the supplierid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUPPLIERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SUPPLIERID }
     * 
     * 
     */
    public List<SUPPLIERID> getSUPPLIERID() {
        if (supplierid == null) {
            supplierid = new ArrayList<SUPPLIERID>();
        }
        return this.supplierid;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERNAME() {
        return suppliername;
    }

    /**
     * Legt den Wert der suppliername-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERNAME(String value) {
        this.suppliername = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SUPPLIER.ADDRESS }
     *     
     */
    public SUPPLIER.ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SUPPLIER.ADDRESS }
     *     
     */
    public void setADDRESS(SUPPLIER.ADDRESS value) {
        this.address = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeADDRESS">
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="supplier" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ADDRESS
        extends TypeADDRESS
    {

        @XmlAttribute(name = "type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            if (type == null) {
                return "supplier";
            } else {
                return type;
            }
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
