
package de.htwg_konstanz.ebus.ess.ws.invoice;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_ITEM" maxOccurs="unbounded"/>
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
    "invoiceitem"
})
@XmlRootElement(name = "INVOICE_ITEM_LIST")
public class INVOICEITEMLIST {

    @XmlElement(name = "INVOICE_ITEM", required = true)
    protected List<INVOICEITEM> invoiceitem;

    /**
     * Gets the value of the invoiceitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINVOICEITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INVOICEITEM }
     * 
     * 
     */
    public List<INVOICEITEM> getINVOICEITEM() {
        if (invoiceitem == null) {
            invoiceitem = new ArrayList<INVOICEITEM>();
        }
        return this.invoiceitem;
    }

}
