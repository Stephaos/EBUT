
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.math.BigDecimal;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ORDER_UNIT"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CONTENT_UNIT" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}NO_CU_PER_OU" minOccurs="0"/>
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
    "orderunit",
    "contentunit",
    "nocuperou"
})
@XmlRootElement(name = "ARTICLE_ORDER_DETAILS")
public class ARTICLEORDERDETAILS {

    @XmlElement(name = "ORDER_UNIT", required = true)
    protected String orderunit;
    @XmlElement(name = "CONTENT_UNIT")
    protected String contentunit;
    @XmlElement(name = "NO_CU_PER_OU")
    protected BigDecimal nocuperou;

    /**
     * ePSDB: product.order_unit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERUNIT() {
        return orderunit;
    }

    /**
     * Legt den Wert der orderunit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERUNIT(String value) {
        this.orderunit = value;
    }

    /**
     * ePSDB: product.content_unit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTENTUNIT() {
        return contentunit;
    }

    /**
     * Legt den Wert der contentunit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTENTUNIT(String value) {
        this.contentunit = value;
    }

    /**
     * ePSDB: product.no_cu_per_ou
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOCUPEROU() {
        return nocuperou;
    }

    /**
     * Legt den Wert der nocuperou-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOCUPEROU(BigDecimal value) {
        this.nocuperou = value;
    }

}
