
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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CONTROL_INFO" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_INFO"/>
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
    "invoiceinfo"
})
@XmlRootElement(name = "INVOICE_HEADER")
public class INVOICEHEADER {

    @XmlElement(name = "CONTROL_INFO")
    protected CONTROLINFO controlinfo;
    @XmlElement(name = "INVOICE_INFO", required = true)
    protected INVOICEINFO invoiceinfo;

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
     * Ruft den Wert der invoiceinfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INVOICEINFO }
     *     
     */
    public INVOICEINFO getINVOICEINFO() {
        return invoiceinfo;
    }

    /**
     * Legt den Wert der invoiceinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INVOICEINFO }
     *     
     */
    public void setINVOICEINFO(INVOICEINFO value) {
        this.invoiceinfo = value;
    }

}
