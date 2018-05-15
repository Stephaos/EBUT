
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}AGREEMENT_ID"/>
 *         &lt;element name="DATETIME" maxOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeDATETIME">
 *                 &lt;attribute name="type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="agreement_start_date"/>
 *                       &lt;enumeration value="agreement_end_date"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
    "agreementid",
    "datetime"
})
@XmlRootElement(name = "AGREEMENT")
public class AGREEMENT {

    @XmlElement(name = "AGREEMENT_ID", required = true)
    protected String agreementid;
    @XmlElement(name = "DATETIME", required = true)
    protected List<AGREEMENT.DATETIME> datetime;

    /**
     * Ruft den Wert der agreementid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGREEMENTID() {
        return agreementid;
    }

    /**
     * Legt den Wert der agreementid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGREEMENTID(String value) {
        this.agreementid = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datetime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDATETIME().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGREEMENT.DATETIME }
     * 
     * 
     */
    public List<AGREEMENT.DATETIME> getDATETIME() {
        if (datetime == null) {
            datetime = new ArrayList<AGREEMENT.DATETIME>();
        }
        return this.datetime;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeDATETIME">
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="agreement_start_date"/>
     *             &lt;enumeration value="agreement_end_date"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DATETIME
        extends TypeDATETIME
    {

        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
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
            return type;
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
