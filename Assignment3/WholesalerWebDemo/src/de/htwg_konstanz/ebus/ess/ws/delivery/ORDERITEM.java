
package de.htwg_konstanz.ebus.ess.ws.delivery;

import java.math.BigDecimal;
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}LINE_ITEM_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ARTICLE_ID"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}QUANTITY"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_UNIT"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ARTICLE_PRICE" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}REMARK" maxOccurs="unbounded" minOccurs="0"/>
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
    "lineitemid",
    "articleid",
    "quantity",
    "orderunit",
    "articleprice",
    "remark"
})
@XmlRootElement(name = "ORDER_ITEM")
public class ORDERITEM {

    @XmlElement(name = "LINE_ITEM_ID", required = true)
    protected String lineitemid;
    @XmlElement(name = "ARTICLE_ID", required = true)
    protected ARTICLEID articleid;
    @XmlElement(name = "QUANTITY", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "ORDER_UNIT", required = true)
    protected String orderunit;
    @XmlElement(name = "ARTICLE_PRICE")
    protected ARTICLEPRICE articleprice;
    @XmlElement(name = "REMARK")
    protected List<REMARK> remark;

    /**
     * wird von ePS generiert; entspricht im ePS: order_item.line_item_number 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEITEMID() {
        return lineitemid;
    }

    /**
     * Legt den Wert der lineitemid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEITEMID(String value) {
        this.lineitemid = value;
    }

    /**
     * Ruft den Wert der articleid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ARTICLEID }
     *     
     */
    public ARTICLEID getARTICLEID() {
        return articleid;
    }

    /**
     * Legt den Wert der articleid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ARTICLEID }
     *     
     */
    public void setARTICLEID(ARTICLEID value) {
        this.articleid = value;
    }

    /**
     * in ePS: order_item.order_size
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQUANTITY() {
        return quantity;
    }

    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQUANTITY(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * in ePS: product.order_unit.code
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
     * Ruft den Wert der articleprice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ARTICLEPRICE }
     *     
     */
    public ARTICLEPRICE getARTICLEPRICE() {
        return articleprice;
    }

    /**
     * Legt den Wert der articleprice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ARTICLEPRICE }
     *     
     */
    public void setARTICLEPRICE(ARTICLEPRICE value) {
        this.articleprice = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREMARK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REMARK }
     * 
     * 
     */
    public List<REMARK> getREMARK() {
        if (remark == null) {
            remark = new ArrayList<REMARK>();
        }
        return this.remark;
    }

}
