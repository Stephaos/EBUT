
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FNAME"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}VARIANTS"/>
 *           &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FVALUE" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FUNIT" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FORDER" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FDESCR" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FVALUE_DETAILS" minOccurs="0"/>
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
    "fname",
    "variants",
    "fvalue",
    "funit",
    "forder",
    "fdescr",
    "fvaluedetails"
})
@XmlRootElement(name = "FEATURE")
public class FEATURE {

    @XmlElement(name = "FNAME", required = true)
    protected String fname;
    @XmlElement(name = "VARIANTS")
    protected VARIANTS variants;
    @XmlElement(name = "FVALUE")
    protected List<String> fvalue;
    @XmlElement(name = "FUNIT")
    protected String funit;
    @XmlElement(name = "FORDER")
    protected BigInteger forder;
    @XmlElement(name = "FDESCR")
    protected String fdescr;
    @XmlElement(name = "FVALUE_DETAILS")
    protected String fvaluedetails;

    /**
     * Ruft den Wert der fname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNAME() {
        return fname;
    }

    /**
     * Legt den Wert der fname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNAME(String value) {
        this.fname = value;
    }

    /**
     * Ruft den Wert der variants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VARIANTS }
     *     
     */
    public VARIANTS getVARIANTS() {
        return variants;
    }

    /**
     * Legt den Wert der variants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VARIANTS }
     *     
     */
    public void setVARIANTS(VARIANTS value) {
        this.variants = value;
    }

    /**
     * Gets the value of the fvalue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fvalue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFVALUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFVALUE() {
        if (fvalue == null) {
            fvalue = new ArrayList<String>();
        }
        return this.fvalue;
    }

    /**
     * Ruft den Wert der funit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNIT() {
        return funit;
    }

    /**
     * Legt den Wert der funit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNIT(String value) {
        this.funit = value;
    }

    /**
     * Ruft den Wert der forder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFORDER() {
        return forder;
    }

    /**
     * Legt den Wert der forder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFORDER(BigInteger value) {
        this.forder = value;
    }

    /**
     * Ruft den Wert der fdescr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDESCR() {
        return fdescr;
    }

    /**
     * Legt den Wert der fdescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDESCR(String value) {
        this.fdescr = value;
    }

    /**
     * Ruft den Wert der fvaluedetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVALUEDETAILS() {
        return fvaluedetails;
    }

    /**
     * Legt den Wert der fvaluedetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVALUEDETAILS(String value) {
        this.fvaluedetails = value;
    }

}
