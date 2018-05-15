
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FEATURE_GROUP_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FEATURE_GROUP_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FEATURE_TEMPLATE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FEATURE_GROUP_DESCR" minOccurs="0"/>
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
    "featuregroupid",
    "featuregroupname",
    "featuretemplate",
    "featuregroupdescr"
})
@XmlRootElement(name = "FEATURE_GROUP")
public class FEATUREGROUP {

    @XmlElement(name = "FEATURE_GROUP_ID", required = true)
    protected String featuregroupid;
    @XmlElement(name = "FEATURE_GROUP_NAME", required = true)
    protected String featuregroupname;
    @XmlElement(name = "FEATURE_TEMPLATE")
    protected List<FEATURETEMPLATE> featuretemplate;
    @XmlElement(name = "FEATURE_GROUP_DESCR")
    protected String featuregroupdescr;

    /**
     * Ruft den Wert der featuregroupid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEATUREGROUPID() {
        return featuregroupid;
    }

    /**
     * Legt den Wert der featuregroupid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEATUREGROUPID(String value) {
        this.featuregroupid = value;
    }

    /**
     * Ruft den Wert der featuregroupname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEATUREGROUPNAME() {
        return featuregroupname;
    }

    /**
     * Legt den Wert der featuregroupname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEATUREGROUPNAME(String value) {
        this.featuregroupname = value;
    }

    /**
     * Gets the value of the featuretemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featuretemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEATURETEMPLATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEATURETEMPLATE }
     * 
     * 
     */
    public List<FEATURETEMPLATE> getFEATURETEMPLATE() {
        if (featuretemplate == null) {
            featuretemplate = new ArrayList<FEATURETEMPLATE>();
        }
        return this.featuretemplate;
    }

    /**
     * Ruft den Wert der featuregroupdescr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEATUREGROUPDESCR() {
        return featuregroupdescr;
    }

    /**
     * Legt den Wert der featuregroupdescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEATUREGROUPDESCR(String value) {
        this.featuregroupdescr = value;
    }

}
