
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}GENERATOR_INFO" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CATALOG"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}SUPPLIER"/>
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
    "generatorinfo",
    "catalog",
    "supplier"
})
@XmlRootElement(name = "HEADER")
public class HEADER {

    @XmlElement(name = "GENERATOR_INFO")
    protected String generatorinfo;
    @XmlElement(name = "CATALOG", required = true)
    protected CATALOG catalog;
    @XmlElement(name = "SUPPLIER", required = true)
    protected SUPPLIER supplier;

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERATORINFO() {
        return generatorinfo;
    }

    /**
     * Legt den Wert der generatorinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERATORINFO(String value) {
        this.generatorinfo = value;
    }

    /**
     * Ruft den Wert der catalog-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CATALOG }
     *     
     */
    public CATALOG getCATALOG() {
        return catalog;
    }

    /**
     * Legt den Wert der catalog-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CATALOG }
     *     
     */
    public void setCATALOG(CATALOG value) {
        this.catalog = value;
    }

    /**
     * Ruft den Wert der supplier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SUPPLIER }
     *     
     */
    public SUPPLIER getSUPPLIER() {
        return supplier;
    }

    /**
     * Legt den Wert der supplier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SUPPLIER }
     *     
     */
    public void setSUPPLIER(SUPPLIER value) {
        this.supplier = value;
    }

}
