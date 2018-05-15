
package de.htwg_konstanz.ebus.ess.ws.order;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_HEADER"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_ITEM_LIST"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_SUMMARY"/>
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
    "invoiceheader",
    "invoiceitemlist",
    "invoicesummary"
})
@XmlRootElement(name = "INVOICE")
public class INVOICE {

    @XmlElement(name = "INVOICE_HEADER", required = true)
    protected INVOICEHEADER invoiceheader;
    @XmlElement(name = "INVOICE_ITEM_LIST", required = true)
    protected INVOICEITEMLIST invoiceitemlist;
    @XmlElement(name = "INVOICE_SUMMARY", required = true)
    protected INVOICESUMMARY invoicesummary;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Ruft den Wert der invoiceheader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INVOICEHEADER }
     *     
     */
    public INVOICEHEADER getINVOICEHEADER() {
        return invoiceheader;
    }

    /**
     * Legt den Wert der invoiceheader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INVOICEHEADER }
     *     
     */
    public void setINVOICEHEADER(INVOICEHEADER value) {
        this.invoiceheader = value;
    }

    /**
     * Ruft den Wert der invoiceitemlist-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INVOICEITEMLIST }
     *     
     */
    public INVOICEITEMLIST getINVOICEITEMLIST() {
        return invoiceitemlist;
    }

    /**
     * Legt den Wert der invoiceitemlist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INVOICEITEMLIST }
     *     
     */
    public void setINVOICEITEMLIST(INVOICEITEMLIST value) {
        this.invoiceitemlist = value;
    }

    /**
     * Ruft den Wert der invoicesummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INVOICESUMMARY }
     *     
     */
    public INVOICESUMMARY getINVOICESUMMARY() {
        return invoicesummary;
    }

    /**
     * Legt den Wert der invoicesummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INVOICESUMMARY }
     *     
     */
    public void setINVOICESUMMARY(INVOICESUMMARY value) {
        this.invoicesummary = value;
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
