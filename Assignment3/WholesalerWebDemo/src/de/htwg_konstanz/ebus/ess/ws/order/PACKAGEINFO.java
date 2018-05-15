
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PACKAGE_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PACKAGE_TYPE" minOccurs="0"/>
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
    "packageid",
    "packagetype"
})
@XmlRootElement(name = "PACKAGE_INFO")
public class PACKAGEINFO {

    @XmlElement(name = "PACKAGE_ID", required = true)
    protected String packageid;
    @XmlElement(name = "PACKAGE_TYPE")
    protected String packagetype;

    /**
     * Ruft den Wert der packageid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGEID() {
        return packageid;
    }

    /**
     * Legt den Wert der packageid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGEID(String value) {
        this.packageid = value;
    }

    /**
     * Ruft den Wert der packagetype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGETYPE() {
        return packagetype;
    }

    /**
     * Legt den Wert der packagetype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGETYPE(String value) {
        this.packagetype = value;
    }

}
