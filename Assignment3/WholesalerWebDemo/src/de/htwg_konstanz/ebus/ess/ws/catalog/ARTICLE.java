
package de.htwg_konstanz.ebus.ess.ws.catalog;

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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}SUPPLIER_AID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ARTICLE_DETAILS"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ARTICLE_ORDER_DETAILS"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ARTICLE_PRICE_DETAILS"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}MIME_INFO" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ARTICLE_REFERENCE" maxOccurs="unbounded" minOccurs="0"/>
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
    "supplieraid",
    "articledetails",
    "articleorderdetails",
    "articlepricedetails",
    "mimeinfo",
    "articlereference"
})
@XmlRootElement(name = "ARTICLE")
public class ARTICLE {

    @XmlElement(name = "SUPPLIER_AID", required = true)
    protected String supplieraid;
    @XmlElement(name = "ARTICLE_DETAILS", required = true)
    protected ARTICLEDETAILS articledetails;
    @XmlElement(name = "ARTICLE_ORDER_DETAILS", required = true)
    protected ARTICLEORDERDETAILS articleorderdetails;
    @XmlElement(name = "ARTICLE_PRICE_DETAILS", required = true)
    protected ARTICLEPRICEDETAILS articlepricedetails;
    @XmlElement(name = "MIME_INFO")
    protected MIMEINFO mimeinfo;
    @XmlElement(name = "ARTICLE_REFERENCE")
    protected List<ARTICLEREFERENCE> articlereference;

    /**
     * ePSDB: product.order_number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERAID() {
        return supplieraid;
    }

    /**
     * Legt den Wert der supplieraid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERAID(String value) {
        this.supplieraid = value;
    }

    /**
     * Ruft den Wert der articledetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ARTICLEDETAILS }
     *     
     */
    public ARTICLEDETAILS getARTICLEDETAILS() {
        return articledetails;
    }

    /**
     * Legt den Wert der articledetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ARTICLEDETAILS }
     *     
     */
    public void setARTICLEDETAILS(ARTICLEDETAILS value) {
        this.articledetails = value;
    }

    /**
     * Ruft den Wert der articleorderdetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ARTICLEORDERDETAILS }
     *     
     */
    public ARTICLEORDERDETAILS getARTICLEORDERDETAILS() {
        return articleorderdetails;
    }

    /**
     * Legt den Wert der articleorderdetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ARTICLEORDERDETAILS }
     *     
     */
    public void setARTICLEORDERDETAILS(ARTICLEORDERDETAILS value) {
        this.articleorderdetails = value;
    }

    /**
     * CHANGED: minOccurs="1", maxOccurs="1"
     * 
     * @return
     *     possible object is
     *     {@link ARTICLEPRICEDETAILS }
     *     
     */
    public ARTICLEPRICEDETAILS getARTICLEPRICEDETAILS() {
        return articlepricedetails;
    }

    /**
     * Legt den Wert der articlepricedetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ARTICLEPRICEDETAILS }
     *     
     */
    public void setARTICLEPRICEDETAILS(ARTICLEPRICEDETAILS value) {
        this.articlepricedetails = value;
    }

    /**
     * kann beim Einlesen ignoriert werden
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
     * kann beim Einlesen ignoriert werden Gets the value of the articlereference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articlereference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARTICLEREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARTICLEREFERENCE }
     * 
     * 
     */
    public List<ARTICLEREFERENCE> getARTICLEREFERENCE() {
        if (articlereference == null) {
            articlereference = new ArrayList<ARTICLEREFERENCE>();
        }
        return this.articlereference;
    }

}
