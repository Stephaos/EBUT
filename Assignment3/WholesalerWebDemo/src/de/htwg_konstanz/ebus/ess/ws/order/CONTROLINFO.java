
package de.htwg_konstanz.ebus.ess.ws.order;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}STOP_AUTOMATIC_PROCESSING" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}GENERATOR_INFO" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}GENERATION_DATE" minOccurs="0"/>
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
    "stopautomaticprocessing",
    "generatorinfo",
    "generationdate"
})
@XmlRootElement(name = "CONTROL_INFO")
public class CONTROLINFO {

    @XmlElement(name = "STOP_AUTOMATIC_PROCESSING")
    protected String stopautomaticprocessing;
    @XmlElement(name = "GENERATOR_INFO")
    protected String generatorinfo;
    @XmlElement(name = "GENERATION_DATE")
    protected String generationdate;

    /**
     * muss nicht von ePS generiert werden
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOPAUTOMATICPROCESSING() {
        return stopautomaticprocessing;
    }

    /**
     * Legt den Wert der stopautomaticprocessing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOPAUTOMATICPROCESSING(String value) {
        this.stopautomaticprocessing = value;
    }

    /**
     * vom ePS zu generieren: eindeutiger String für Einkäufer, z.B. "E-Procurement System Einkäufer-ID"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERATORINFO() {
        return generatorinfo;
    }

    /**
     * Legt den Wert der generatorinfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERATORINFO(String value) {
        this.generatorinfo = value;
    }

    /**
     * vom ePS zu generieren: Timestamp (dtDATETIME) für XML-Bestelldokument
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERATIONDATE() {
        return generationdate;
    }

    /**
     * Legt den Wert der generationdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERATIONDATE(String value) {
        this.generationdate = value;
    }

}
