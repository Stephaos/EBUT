
package de.htwg_konstanz.ebus.ess.ws.order;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CONTACT_NAME"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PHONE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}FAX" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}EMAIL" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PUBLIC_KEY" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}URL" minOccurs="0"/>
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
    "contactname",
    "phone",
    "fax",
    "email",
    "publickey",
    "url"
})
@XmlRootElement(name = "CONTACT")
public class CONTACT {

    @XmlElement(name = "CONTACT_NAME", required = true)
    protected String contactname;
    @XmlElement(name = "PHONE")
    protected List<PHONE> phone;
    @XmlElement(name = "FAX")
    protected String fax;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "PUBLIC_KEY")
    protected List<PUBLICKEY> publickey;
    @XmlElement(name = "URL")
    protected String url;

    /**
     * Ruft den Wert der contactname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTACTNAME() {
        return contactname;
    }

    /**
     * Legt den Wert der contactname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTACTNAME(String value) {
        this.contactname = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPHONE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PHONE }
     * 
     * 
     */
    public List<PHONE> getPHONE() {
        if (phone == null) {
            phone = new ArrayList<PHONE>();
        }
        return this.phone;
    }

    /**
     * Ruft den Wert der fax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Legt den Wert der fax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the publickey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publickey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPUBLICKEY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PUBLICKEY }
     * 
     * 
     */
    public List<PUBLICKEY> getPUBLICKEY() {
        if (publickey == null) {
            publickey = new ArrayList<PUBLICKEY>();
        }
        return this.publickey;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}
