
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_DESCR" minOccurs="0"/>
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
    "ftid",
    "ftname",
    "ftdescr"
})
@XmlRootElement(name = "CLASSIFICATION_SYSTEM_FEATURE_TEMPLATE")
public class CLASSIFICATIONSYSTEMFEATURETEMPLATE {

    @XmlElement(name = "FT_ID", required = true)
    protected String ftid;
    @XmlElement(name = "FT_NAME", required = true)
    protected String ftname;
    @XmlElement(name = "FT_DESCR")
    protected String ftdescr;

    /**
     * Ruft den Wert der ftid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTID() {
        return ftid;
    }

    /**
     * Legt den Wert der ftid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTID(String value) {
        this.ftid = value;
    }

    /**
     * Ruft den Wert der ftname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTNAME() {
        return ftname;
    }

    /**
     * Legt den Wert der ftname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTNAME(String value) {
        this.ftname = value;
    }

    /**
     * Ruft den Wert der ftdescr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTDESCR() {
        return ftdescr;
    }

    /**
     * Legt den Wert der ftdescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTDESCR(String value) {
        this.ftdescr = value;
    }

}
