
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_LEVEL_NAME" maxOccurs="unbounded"/>
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
    "classificationsystemlevelname"
})
@XmlRootElement(name = "CLASSIFICATION_SYSTEM_LEVEL_NAMES")
public class CLASSIFICATIONSYSTEMLEVELNAMES {

    @XmlElement(name = "CLASSIFICATION_SYSTEM_LEVEL_NAME", required = true)
    protected List<CLASSIFICATIONSYSTEMLEVELNAME> classificationsystemlevelname;

    /**
     * Gets the value of the classificationsystemlevelname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationsystemlevelname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCLASSIFICATIONSYSTEMLEVELNAME().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CLASSIFICATIONSYSTEMLEVELNAME }
     * 
     * 
     */
    public List<CLASSIFICATIONSYSTEMLEVELNAME> getCLASSIFICATIONSYSTEMLEVELNAME() {
        if (classificationsystemlevelname == null) {
            classificationsystemlevelname = new ArrayList<CLASSIFICATIONSYSTEMLEVELNAME>();
        }
        return this.classificationsystemlevelname;
    }

}
