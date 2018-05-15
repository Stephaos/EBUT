
package de.htwg_konstanz.ebus.ess.ws.delivery;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CONTROL_INFO" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_INFO"/>
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
    "controlinfo",
    "dispatchnotificationinfo"
})
@XmlRootElement(name = "DISPATCHNOTIFICATION_HEADER")
public class DISPATCHNOTIFICATIONHEADER {

    @XmlElement(name = "CONTROL_INFO")
    protected CONTROLINFO controlinfo;
    @XmlElement(name = "DISPATCHNOTIFICATION_INFO", required = true)
    protected DISPATCHNOTIFICATIONINFO dispatchnotificationinfo;

    /**
     * Ruft den Wert der controlinfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CONTROLINFO }
     *     
     */
    public CONTROLINFO getCONTROLINFO() {
        return controlinfo;
    }

    /**
     * Legt den Wert der controlinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTROLINFO }
     *     
     */
    public void setCONTROLINFO(CONTROLINFO value) {
        this.controlinfo = value;
    }

    /**
     * Ruft den Wert der dispatchnotificationinfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DISPATCHNOTIFICATIONINFO }
     *     
     */
    public DISPATCHNOTIFICATIONINFO getDISPATCHNOTIFICATIONINFO() {
        return dispatchnotificationinfo;
    }

    /**
     * Legt den Wert der dispatchnotificationinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DISPATCHNOTIFICATIONINFO }
     *     
     */
    public void setDISPATCHNOTIFICATIONINFO(DISPATCHNOTIFICATIONINFO value) {
        this.dispatchnotificationinfo = value;
    }

}
