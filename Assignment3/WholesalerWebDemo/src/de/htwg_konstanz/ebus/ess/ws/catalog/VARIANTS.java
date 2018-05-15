
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}VARIANT" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}VORDER"/>
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
    "variant",
    "vorder"
})
@XmlRootElement(name = "VARIANTS")
public class VARIANTS {

    @XmlElement(name = "VARIANT", required = true)
    protected List<VARIANT> variant;
    @XmlElement(name = "VORDER", required = true)
    protected BigInteger vorder;

    /**
     * Gets the value of the variant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVARIANT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VARIANT }
     * 
     * 
     */
    public List<VARIANT> getVARIANT() {
        if (variant == null) {
            variant = new ArrayList<VARIANT>();
        }
        return this.variant;
    }

    /**
     * Ruft den Wert der vorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVORDER() {
        return vorder;
    }

    /**
     * Legt den Wert der vorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVORDER(BigInteger value) {
        this.vorder = value;
    }

}
