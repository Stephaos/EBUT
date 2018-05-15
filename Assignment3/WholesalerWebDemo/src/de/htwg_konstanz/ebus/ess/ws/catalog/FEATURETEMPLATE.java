
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_UNIT" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_ORDER" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" default="free_entry">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="free_entry"/>
 *             &lt;enumeration value="defaults"/>
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
    "ftname",
    "ftunit",
    "ftorder"
})
@XmlRootElement(name = "FEATURE_TEMPLATE")
public class FEATURETEMPLATE {

    @XmlElement(name = "FT_NAME", required = true)
    protected String ftname;
    @XmlElement(name = "FT_UNIT")
    protected String ftunit;
    @XmlElement(name = "FT_ORDER")
    protected BigInteger ftorder;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

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
     * Ruft den Wert der ftunit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTUNIT() {
        return ftunit;
    }

    /**
     * Legt den Wert der ftunit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTUNIT(String value) {
        this.ftunit = value;
    }

    /**
     * Ruft den Wert der ftorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFTORDER() {
        return ftorder;
    }

    /**
     * Legt den Wert der ftorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFTORDER(BigInteger value) {
        this.ftorder = value;
    }

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
            return "free_entry";
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
