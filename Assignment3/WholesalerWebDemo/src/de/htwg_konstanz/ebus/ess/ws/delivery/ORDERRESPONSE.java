
package de.htwg_konstanz.ebus.ess.ws.delivery;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE_HEADER"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE_ITEM_LIST"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE_SUMMARY"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.opentrans.org/XMLSchema/1.0}dtSTRING" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderresponseheader",
    "orderresponseitemlist",
    "orderresponsesummary"
})
@XmlRootElement(name = "ORDERRESPONSE")
public class ORDERRESPONSE {

    @XmlElement(name = "ORDERRESPONSE_HEADER", required = true)
    protected ORDERRESPONSEHEADER orderresponseheader;
    @XmlElement(name = "ORDERRESPONSE_ITEM_LIST", required = true)
    protected ORDERRESPONSEITEMLIST orderresponseitemlist;
    @XmlElement(name = "ORDERRESPONSE_SUMMARY", required = true)
    protected ORDERRESPONSESUMMARY orderresponsesummary;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Ruft den Wert der orderresponseheader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ORDERRESPONSEHEADER }
     *     
     */
    public ORDERRESPONSEHEADER getORDERRESPONSEHEADER() {
        return orderresponseheader;
    }

    /**
     * Legt den Wert der orderresponseheader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERRESPONSEHEADER }
     *     
     */
    public void setORDERRESPONSEHEADER(ORDERRESPONSEHEADER value) {
        this.orderresponseheader = value;
    }

    /**
     * Ruft den Wert der orderresponseitemlist-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ORDERRESPONSEITEMLIST }
     *     
     */
    public ORDERRESPONSEITEMLIST getORDERRESPONSEITEMLIST() {
        return orderresponseitemlist;
    }

    /**
     * Legt den Wert der orderresponseitemlist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERRESPONSEITEMLIST }
     *     
     */
    public void setORDERRESPONSEITEMLIST(ORDERRESPONSEITEMLIST value) {
        this.orderresponseitemlist = value;
    }

    /**
     * Ruft den Wert der orderresponsesummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ORDERRESPONSESUMMARY }
     *     
     */
    public ORDERRESPONSESUMMARY getORDERRESPONSESUMMARY() {
        return orderresponsesummary;
    }

    /**
     * Legt den Wert der orderresponsesummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERRESPONSESUMMARY }
     *     
     */
    public void setORDERRESPONSESUMMARY(ORDERRESPONSESUMMARY value) {
        this.orderresponsesummary = value;
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

}
