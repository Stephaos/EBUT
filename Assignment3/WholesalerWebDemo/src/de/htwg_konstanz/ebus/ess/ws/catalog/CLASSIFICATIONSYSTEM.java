
package de.htwg_konstanz.ebus.ess.ws.catalog;

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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_FULLNAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_VERSION" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_DESCR" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_LEVELS" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_LEVEL_NAMES" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ALLOWED_VALUES" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}UNITS" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_FEATURE_TEMPLATES" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_GROUPS"/>
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
    "classificationsystemname",
    "classificationsystemfullname",
    "classificationsystemversion",
    "classificationsystemdescr",
    "classificationsystemlevels",
    "classificationsystemlevelnames",
    "allowedvalues",
    "units",
    "classificationsystemfeaturetemplates",
    "classificationgroups"
})
@XmlRootElement(name = "CLASSIFICATION_SYSTEM")
public class CLASSIFICATIONSYSTEM {

    @XmlElement(name = "CLASSIFICATION_SYSTEM_NAME", required = true)
    protected String classificationsystemname;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_FULLNAME")
    protected String classificationsystemfullname;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_VERSION")
    protected String classificationsystemversion;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_DESCR")
    protected String classificationsystemdescr;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_LEVELS")
    protected BigInteger classificationsystemlevels;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_LEVEL_NAMES")
    protected CLASSIFICATIONSYSTEMLEVELNAMES classificationsystemlevelnames;
    @XmlElement(name = "ALLOWED_VALUES")
    protected ALLOWEDVALUES allowedvalues;
    @XmlElement(name = "UNITS")
    protected UNITS units;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_FEATURE_TEMPLATES")
    protected CLASSIFICATIONSYSTEMFEATURETEMPLATES classificationsystemfeaturetemplates;
    @XmlElement(name = "CLASSIFICATION_GROUPS", required = true)
    protected CLASSIFICATIONGROUPS classificationgroups;

    /**
     * Ruft den Wert der classificationsystemname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONSYSTEMNAME() {
        return classificationsystemname;
    }

    /**
     * Legt den Wert der classificationsystemname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONSYSTEMNAME(String value) {
        this.classificationsystemname = value;
    }

    /**
     * Ruft den Wert der classificationsystemfullname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONSYSTEMFULLNAME() {
        return classificationsystemfullname;
    }

    /**
     * Legt den Wert der classificationsystemfullname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONSYSTEMFULLNAME(String value) {
        this.classificationsystemfullname = value;
    }

    /**
     * Ruft den Wert der classificationsystemversion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONSYSTEMVERSION() {
        return classificationsystemversion;
    }

    /**
     * Legt den Wert der classificationsystemversion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONSYSTEMVERSION(String value) {
        this.classificationsystemversion = value;
    }

    /**
     * Ruft den Wert der classificationsystemdescr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONSYSTEMDESCR() {
        return classificationsystemdescr;
    }

    /**
     * Legt den Wert der classificationsystemdescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONSYSTEMDESCR(String value) {
        this.classificationsystemdescr = value;
    }

    /**
     * Ruft den Wert der classificationsystemlevels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCLASSIFICATIONSYSTEMLEVELS() {
        return classificationsystemlevels;
    }

    /**
     * Legt den Wert der classificationsystemlevels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCLASSIFICATIONSYSTEMLEVELS(BigInteger value) {
        this.classificationsystemlevels = value;
    }

    /**
     * Ruft den Wert der classificationsystemlevelnames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CLASSIFICATIONSYSTEMLEVELNAMES }
     *     
     */
    public CLASSIFICATIONSYSTEMLEVELNAMES getCLASSIFICATIONSYSTEMLEVELNAMES() {
        return classificationsystemlevelnames;
    }

    /**
     * Legt den Wert der classificationsystemlevelnames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASSIFICATIONSYSTEMLEVELNAMES }
     *     
     */
    public void setCLASSIFICATIONSYSTEMLEVELNAMES(CLASSIFICATIONSYSTEMLEVELNAMES value) {
        this.classificationsystemlevelnames = value;
    }

    /**
     * Ruft den Wert der allowedvalues-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ALLOWEDVALUES }
     *     
     */
    public ALLOWEDVALUES getALLOWEDVALUES() {
        return allowedvalues;
    }

    /**
     * Legt den Wert der allowedvalues-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ALLOWEDVALUES }
     *     
     */
    public void setALLOWEDVALUES(ALLOWEDVALUES value) {
        this.allowedvalues = value;
    }

    /**
     * Ruft den Wert der units-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UNITS }
     *     
     */
    public UNITS getUNITS() {
        return units;
    }

    /**
     * Legt den Wert der units-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UNITS }
     *     
     */
    public void setUNITS(UNITS value) {
        this.units = value;
    }

    /**
     * Ruft den Wert der classificationsystemfeaturetemplates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CLASSIFICATIONSYSTEMFEATURETEMPLATES }
     *     
     */
    public CLASSIFICATIONSYSTEMFEATURETEMPLATES getCLASSIFICATIONSYSTEMFEATURETEMPLATES() {
        return classificationsystemfeaturetemplates;
    }

    /**
     * Legt den Wert der classificationsystemfeaturetemplates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASSIFICATIONSYSTEMFEATURETEMPLATES }
     *     
     */
    public void setCLASSIFICATIONSYSTEMFEATURETEMPLATES(CLASSIFICATIONSYSTEMFEATURETEMPLATES value) {
        this.classificationsystemfeaturetemplates = value;
    }

    /**
     * Ruft den Wert der classificationgroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CLASSIFICATIONGROUPS }
     *     
     */
    public CLASSIFICATIONGROUPS getCLASSIFICATIONGROUPS() {
        return classificationgroups;
    }

    /**
     * Legt den Wert der classificationgroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASSIFICATIONGROUPS }
     *     
     */
    public void setCLASSIFICATIONGROUPS(CLASSIFICATIONGROUPS value) {
        this.classificationgroups = value;
    }

}
