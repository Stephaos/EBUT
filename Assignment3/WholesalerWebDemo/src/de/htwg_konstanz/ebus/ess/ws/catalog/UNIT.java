
package de.htwg_konstanz.ebus.ess.ws.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}UNIT_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}UNIT_NAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}UNIT_DESCR" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="system">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}dtSTRING">
 *             &lt;maxLength value="20"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unitid",
    "unitname",
    "unitdescr"
})
@XmlRootElement(name = "UNIT")
public class UNIT {

    @XmlElement(name = "UNIT_ID", required = true)
    protected String unitid;
    @XmlElement(name = "UNIT_NAME")
    protected String unitname;
    @XmlElement(name = "UNIT_DESCR")
    protected String unitdescr;
    @XmlAttribute(name = "system")
    protected String system;

    /**
     * Ruft den Wert der unitid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITID() {
        return unitid;
    }

    /**
     * Legt den Wert der unitid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITID(String value) {
        this.unitid = value;
    }

    /**
     * Ruft den Wert der unitname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITNAME() {
        return unitname;
    }

    /**
     * Legt den Wert der unitname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITNAME(String value) {
        this.unitname = value;
    }

    /**
     * Ruft den Wert der unitdescr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITDESCR() {
        return unitdescr;
    }

    /**
     * Legt den Wert der unitdescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITDESCR(String value) {
        this.unitdescr = value;
    }

    /**
     * Ruft den Wert der system-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Legt den Wert der system-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

}
