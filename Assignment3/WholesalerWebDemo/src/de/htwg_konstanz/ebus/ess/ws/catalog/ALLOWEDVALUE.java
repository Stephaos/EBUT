
package de.htwg_konstanz.ebus.ess.ws.catalog;

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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ALLOWED_VALUE_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ALLOWED_VALUE_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ALLOWED_VALUE_DESCR" minOccurs="0"/>
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
    "allowedvalueid",
    "allowedvaluename",
    "allowedvaluedescr"
})
@XmlRootElement(name = "ALLOWED_VALUE")
public class ALLOWEDVALUE {

    @XmlElement(name = "ALLOWED_VALUE_ID", required = true)
    protected String allowedvalueid;
    @XmlElement(name = "ALLOWED_VALUE_NAME", required = true)
    protected String allowedvaluename;
    @XmlElement(name = "ALLOWED_VALUE_DESCR")
    protected String allowedvaluedescr;

    /**
     * Ruft den Wert der allowedvalueid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWEDVALUEID() {
        return allowedvalueid;
    }

    /**
     * Legt den Wert der allowedvalueid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWEDVALUEID(String value) {
        this.allowedvalueid = value;
    }

    /**
     * Ruft den Wert der allowedvaluename-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWEDVALUENAME() {
        return allowedvaluename;
    }

    /**
     * Legt den Wert der allowedvaluename-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWEDVALUENAME(String value) {
        this.allowedvaluename = value;
    }

    /**
     * Ruft den Wert der allowedvaluedescr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWEDVALUEDESCR() {
        return allowedvaluedescr;
    }

    /**
     * Legt den Wert der allowedvaluedescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWEDVALUEDESCR(String value) {
        this.allowedvaluedescr = value;
    }

}
