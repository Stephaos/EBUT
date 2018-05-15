
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FVALUE"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}SUPPLIER_AID_SUPPLEMENT"/>
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
    "fvalue",
    "supplieraidsupplement"
})
@XmlRootElement(name = "VARIANT")
public class VARIANT {

    @XmlElement(name = "FVALUE", required = true)
    protected String fvalue;
    @XmlElement(name = "SUPPLIER_AID_SUPPLEMENT", required = true)
    protected String supplieraidsupplement;

    /**
     * Ruft den Wert der fvalue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVALUE() {
        return fvalue;
    }

    /**
     * Legt den Wert der fvalue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVALUE(String value) {
        this.fvalue = value;
    }

    /**
     * Ruft den Wert der supplieraidsupplement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERAIDSUPPLEMENT() {
        return supplieraidsupplement;
    }

    /**
     * Legt den Wert der supplieraidsupplement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERAIDSUPPLEMENT(String value) {
        this.supplieraidsupplement = value;
    }

}
