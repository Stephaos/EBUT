
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}PRICE_AMOUNT"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}PRICE_CURRENCY" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}TAX"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}TERRITORY" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="price_type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}dtSTRING">
 *             &lt;pattern value="net_list"/>
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
    "priceamount",
    "pricecurrency",
    "tax",
    "territory"
})
@XmlRootElement(name = "ARTICLE_PRICE")
public class ARTICLEPRICE {

    @XmlElement(name = "PRICE_AMOUNT", required = true)
    protected BigDecimal priceamount;
    @XmlElement(name = "PRICE_CURRENCY")
    @XmlSchemaType(name = "string")
    protected DtCURRENCIES pricecurrency;
    @XmlElement(name = "TAX", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "TERRITORY", required = true)
    protected List<String> territory;
    @XmlAttribute(name = "price_type", required = true)
    protected String priceType;

    /**
     * ePSDB: cat_price.price_amount
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICEAMOUNT() {
        return priceamount;
    }

    /**
     * Legt den Wert der priceamount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICEAMOUNT(BigDecimal value) {
        this.priceamount = value;
    }

    /**
     * kann beim Einlesen ignoriert werden
     * 
     * @return
     *     possible object is
     *     {@link DtCURRENCIES }
     *     
     */
    public DtCURRENCIES getPRICECURRENCY() {
        return pricecurrency;
    }

    /**
     * Legt den Wert der pricecurrency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DtCURRENCIES }
     *     
     */
    public void setPRICECURRENCY(DtCURRENCIES value) {
        this.pricecurrency = value;
    }

    /**
     * CHANGED: minOccurs="1";  INHALT Dezimalzahl (0.19 entspricht 19%); ePSDB: cat_price.tax_rate
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAX() {
        return tax;
    }

    /**
     * Legt den Wert der tax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAX(BigDecimal value) {
        this.tax = value;
    }

    /**
     * CHANGED: minOccurs="1"; CHANGED: Nur Hauptländercodes erlaubt (2 Buchstaben); ePSDB: country.iso_code Gets the value of the territory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTERRITORY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTERRITORY() {
        if (territory == null) {
            territory = new ArrayList<String>();
        }
        return this.territory;
    }

    /**
     * Ruft den Wert der priceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Legt den Wert der priceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

}
