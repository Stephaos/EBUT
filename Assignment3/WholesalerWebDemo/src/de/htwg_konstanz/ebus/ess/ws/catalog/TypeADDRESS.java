
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für typeADDRESS complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="typeADDRESS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}NAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}NAME2" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}NAME3" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CONTACT" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}STREET" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ZIP" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}BOXNO" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ZIPBOX" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CITY" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}STATE" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}COUNTRY" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}PHONE" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FAX" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}EMAIL" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}PUBLIC_KEY" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}URL" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ADDRESS_REMARKS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeADDRESS", propOrder = {
    "name",
    "name2",
    "name3",
    "contact",
    "street",
    "zip",
    "boxno",
    "zipbox",
    "city",
    "state",
    "country",
    "phone",
    "fax",
    "email",
    "publickey",
    "url",
    "addressremarks"
})
@XmlSeeAlso({
    de.htwg_konstanz.ebus.ess.ws.catalog.SUPPLIER.ADDRESS.class,
    de.htwg_konstanz.ebus.ess.ws.catalog.BUYER.ADDRESS.class
})
public class TypeADDRESS {

    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "NAME2")
    protected String name2;
    @XmlElement(name = "NAME3")
    protected String name3;
    @XmlElement(name = "CONTACT")
    protected String contact;
    @XmlElement(name = "STREET")
    protected String street;
    @XmlElement(name = "ZIP")
    protected String zip;
    @XmlElement(name = "BOXNO")
    protected String boxno;
    @XmlElement(name = "ZIPBOX")
    protected String zipbox;
    @XmlElement(name = "CITY")
    protected String city;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "COUNTRY")
    protected String country;
    @XmlElement(name = "PHONE")
    protected String phone;
    @XmlElement(name = "FAX")
    protected String fax;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "PUBLIC_KEY")
    protected List<PUBLICKEY> publickey;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "ADDRESS_REMARKS")
    protected String addressremarks;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der name2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME2() {
        return name2;
    }

    /**
     * Legt den Wert der name2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME2(String value) {
        this.name2 = value;
    }

    /**
     * Ruft den Wert der name3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME3() {
        return name3;
    }

    /**
     * Legt den Wert der name3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME3(String value) {
        this.name3 = value;
    }

    /**
     * Ruft den Wert der contact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTACT() {
        return contact;
    }

    /**
     * Legt den Wert der contact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTACT(String value) {
        this.contact = value;
    }

    /**
     * Ruft den Wert der street-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREET() {
        return street;
    }

    /**
     * Legt den Wert der street-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREET(String value) {
        this.street = value;
    }

    /**
     * Ruft den Wert der zip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIP() {
        return zip;
    }

    /**
     * Legt den Wert der zip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIP(String value) {
        this.zip = value;
    }

    /**
     * Ruft den Wert der boxno-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOXNO() {
        return boxno;
    }

    /**
     * Legt den Wert der boxno-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOXNO(String value) {
        this.boxno = value;
    }

    /**
     * Ruft den Wert der zipbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPBOX() {
        return zipbox;
    }

    /**
     * Legt den Wert der zipbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPBOX(String value) {
        this.zipbox = value;
    }

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der phone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONE() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONE(String value) {
        this.phone = value;
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

    /**
     * Ruft den Wert der addressremarks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSREMARKS() {
        return addressremarks;
    }

    /**
     * Legt den Wert der addressremarks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSREMARKS(String value) {
        this.addressremarks = value;
    }

}
