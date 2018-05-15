
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}GROUP_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}GROUP_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}GROUP_DESCRIPTION" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}PARENT_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}GROUP_ORDER" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}MIME_INFO" minOccurs="0"/>
 *         &lt;element name="USER_DEFINED_EXTENSIONS" type="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}catstrucUSER_DEFINED_EXTENSIONS" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}KEYWORD" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="root"/>
 *             &lt;enumeration value="node"/>
 *             &lt;enumeration value="leaf"/>
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
    "groupid",
    "groupname",
    "groupdescription",
    "parentid",
    "grouporder",
    "mimeinfo",
    "userdefinedextensions",
    "keyword"
})
@XmlRootElement(name = "CATALOG_STRUCTURE")
public class CATALOGSTRUCTURE {

    @XmlElement(name = "GROUP_ID", required = true)
    protected String groupid;
    @XmlElement(name = "GROUP_NAME", required = true)
    protected String groupname;
    @XmlElement(name = "GROUP_DESCRIPTION")
    protected String groupdescription;
    @XmlElement(name = "PARENT_ID", required = true)
    protected String parentid;
    @XmlElement(name = "GROUP_ORDER")
    protected BigInteger grouporder;
    @XmlElement(name = "MIME_INFO")
    protected MIMEINFO mimeinfo;
    @XmlElement(name = "USER_DEFINED_EXTENSIONS")
    protected CatstrucUSERDEFINEDEXTENSIONS userdefinedextensions;
    @XmlElement(name = "KEYWORD")
    protected List<String> keyword;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Ruft den Wert der groupid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPID() {
        return groupid;
    }

    /**
     * Legt den Wert der groupid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPID(String value) {
        this.groupid = value;
    }

    /**
     * Ruft den Wert der groupname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPNAME() {
        return groupname;
    }

    /**
     * Legt den Wert der groupname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPNAME(String value) {
        this.groupname = value;
    }

    /**
     * Ruft den Wert der groupdescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPDESCRIPTION() {
        return groupdescription;
    }

    /**
     * Legt den Wert der groupdescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPDESCRIPTION(String value) {
        this.groupdescription = value;
    }

    /**
     * Ruft den Wert der parentid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENTID() {
        return parentid;
    }

    /**
     * Legt den Wert der parentid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENTID(String value) {
        this.parentid = value;
    }

    /**
     * Ruft den Wert der grouporder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGROUPORDER() {
        return grouporder;
    }

    /**
     * Legt den Wert der grouporder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGROUPORDER(BigInteger value) {
        this.grouporder = value;
    }

    /**
     * Ruft den Wert der mimeinfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MIMEINFO }
     *     
     */
    public MIMEINFO getMIMEINFO() {
        return mimeinfo;
    }

    /**
     * Legt den Wert der mimeinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMEINFO }
     *     
     */
    public void setMIMEINFO(MIMEINFO value) {
        this.mimeinfo = value;
    }

    /**
     * Ruft den Wert der userdefinedextensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CatstrucUSERDEFINEDEXTENSIONS }
     *     
     */
    public CatstrucUSERDEFINEDEXTENSIONS getUSERDEFINEDEXTENSIONS() {
        return userdefinedextensions;
    }

    /**
     * Legt den Wert der userdefinedextensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CatstrucUSERDEFINEDEXTENSIONS }
     *     
     */
    public void setUSERDEFINEDEXTENSIONS(CatstrucUSERDEFINEDEXTENSIONS value) {
        this.userdefinedextensions = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKEYWORD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKEYWORD() {
        if (keyword == null) {
            keyword = new ArrayList<String>();
        }
        return this.keyword;
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
        return type;
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
