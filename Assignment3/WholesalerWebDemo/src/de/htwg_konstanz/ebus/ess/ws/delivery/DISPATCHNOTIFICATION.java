
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_HEADER"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_ITEM_LIST"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_SUMMARY"/>
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
    "dispatchnotificationheader",
    "dispatchnotificationitemlist",
    "dispatchnotificationsummary"
})
@XmlRootElement(name = "DISPATCHNOTIFICATION")
public class DISPATCHNOTIFICATION {

    @XmlElement(name = "DISPATCHNOTIFICATION_HEADER", required = true)
    protected DISPATCHNOTIFICATIONHEADER dispatchnotificationheader;
    @XmlElement(name = "DISPATCHNOTIFICATION_ITEM_LIST", required = true)
    protected DISPATCHNOTIFICATIONITEMLIST dispatchnotificationitemlist;
    @XmlElement(name = "DISPATCHNOTIFICATION_SUMMARY", required = true)
    protected DISPATCHNOTIFICATIONSUMMARY dispatchnotificationsummary;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Ruft den Wert der dispatchnotificationheader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DISPATCHNOTIFICATIONHEADER }
     *     
     */
    public DISPATCHNOTIFICATIONHEADER getDISPATCHNOTIFICATIONHEADER() {
        return dispatchnotificationheader;
    }

    /**
     * Legt den Wert der dispatchnotificationheader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DISPATCHNOTIFICATIONHEADER }
     *     
     */
    public void setDISPATCHNOTIFICATIONHEADER(DISPATCHNOTIFICATIONHEADER value) {
        this.dispatchnotificationheader = value;
    }

    /**
     * ADD CONSTRAINT: NUR EINE ORDER_ID
     * 
     * @return
     *     possible object is
     *     {@link DISPATCHNOTIFICATIONITEMLIST }
     *     
     */
    public DISPATCHNOTIFICATIONITEMLIST getDISPATCHNOTIFICATIONITEMLIST() {
        return dispatchnotificationitemlist;
    }

    /**
     * Legt den Wert der dispatchnotificationitemlist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DISPATCHNOTIFICATIONITEMLIST }
     *     
     */
    public void setDISPATCHNOTIFICATIONITEMLIST(DISPATCHNOTIFICATIONITEMLIST value) {
        this.dispatchnotificationitemlist = value;
    }

    /**
     * Ruft den Wert der dispatchnotificationsummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DISPATCHNOTIFICATIONSUMMARY }
     *     
     */
    public DISPATCHNOTIFICATIONSUMMARY getDISPATCHNOTIFICATIONSUMMARY() {
        return dispatchnotificationsummary;
    }

    /**
     * Legt den Wert der dispatchnotificationsummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DISPATCHNOTIFICATIONSUMMARY }
     *     
     */
    public void setDISPATCHNOTIFICATIONSUMMARY(DISPATCHNOTIFICATIONSUMMARY value) {
        this.dispatchnotificationsummary = value;
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
