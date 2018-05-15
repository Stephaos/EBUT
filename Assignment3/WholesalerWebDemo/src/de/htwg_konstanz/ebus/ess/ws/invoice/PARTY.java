
package de.htwg_konstanz.ebus.ess.ws.invoice;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PARTY_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ADDRESS" minOccurs="0"/>
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
    "partyid",
    "address"
})
@XmlRootElement(name = "PARTY")
public class PARTY {

    @XmlElement(name = "PARTY_ID", required = true)
    protected PARTYID partyid;
    @XmlElement(name = "ADDRESS")
    protected ADDRESS address;

    /**
     * Ruft den Wert der partyid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PARTYID }
     *     
     */
    public PARTYID getPARTYID() {
        return partyid;
    }

    /**
     * Legt den Wert der partyid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTYID }
     *     
     */
    public void setPARTYID(PARTYID value) {
        this.partyid = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESS }
     *     
     */
    public ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESS }
     *     
     */
    public void setADDRESS(ADDRESS value) {
        this.address = value;
    }

}
