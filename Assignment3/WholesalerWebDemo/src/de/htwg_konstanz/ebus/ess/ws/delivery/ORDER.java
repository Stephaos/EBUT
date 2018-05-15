
package de.htwg_konstanz.ebus.ess.ws.delivery;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_HEADER"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_ITEM_LIST"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_SUMMARY"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.opentrans.org/XMLSchema/1.0}dtSTRING" fixed="1.0" />
 *       &lt;attribute name="type" default="standard">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="standard"/>
 *             &lt;enumeration value="express"/>
 *             &lt;enumeration value="release"/>
 *             &lt;enumeration value="consignment"/>
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
    "orderheader",
    "orderitemlist",
    "ordersummary"
})
@XmlRootElement(name = "ORDER")
public class ORDER {

    @XmlElement(name = "ORDER_HEADER", required = true)
    protected ORDERHEADER orderheader;
    @XmlElement(name = "ORDER_ITEM_LIST", required = true)
    protected ORDERITEMLIST orderitemlist;
    @XmlElement(name = "ORDER_SUMMARY", required = true)
    protected ORDERSUMMARY ordersummary;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * CHANGED
     * 
     * @return
     *     possible object is
     *     {@link ORDERHEADER }
     *     
     */
    public ORDERHEADER getORDERHEADER() {
        return orderheader;
    }

    /**
     * Legt den Wert der orderheader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERHEADER }
     *     
     */
    public void setORDERHEADER(ORDERHEADER value) {
        this.orderheader = value;
    }

    /**
     * CHANGED
     * 
     * @return
     *     possible object is
     *     {@link ORDERITEMLIST }
     *     
     */
    public ORDERITEMLIST getORDERITEMLIST() {
        return orderitemlist;
    }

    /**
     * Legt den Wert der orderitemlist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERITEMLIST }
     *     
     */
    public void setORDERITEMLIST(ORDERITEMLIST value) {
        this.orderitemlist = value;
    }

    /**
     * Ruft den Wert der ordersummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ORDERSUMMARY }
     *     
     */
    public ORDERSUMMARY getORDERSUMMARY() {
        return ordersummary;
    }

    /**
     * Legt den Wert der ordersummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERSUMMARY }
     *     
     */
    public void setORDERSUMMARY(ORDERSUMMARY value) {
        this.ordersummary = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
            return "standard";
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
