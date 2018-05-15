
package de.htwg_konstanz.ebus.ess.ws.delivery;

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
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION"/>
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
    "userName",
    "password",
    "dispatchnotification"
})
@XmlRootElement(name = "DeliveryServiceRequest", namespace = "http://www.htwg-konstanz.de/ebsf/ws/delivery")
public class DeliveryServiceRequest {

    @XmlElement(namespace = "http://www.htwg-konstanz.de/ebsf/ws/delivery", required = true)
    protected String userName;
    @XmlElement(namespace = "http://www.htwg-konstanz.de/ebsf/ws/delivery", required = true)
    protected String password;
    @XmlElement(name = "DISPATCHNOTIFICATION", required = true)
    protected DISPATCHNOTIFICATION dispatchnotification;

    /**
     * Ruft den Wert der userName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Legt den Wert der userName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Ruft den Wert der dispatchnotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DISPATCHNOTIFICATION }
     *     
     */
    public DISPATCHNOTIFICATION getDISPATCHNOTIFICATION() {
        return dispatchnotification;
    }

    /**
     * Legt den Wert der dispatchnotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DISPATCHNOTIFICATION }
     *     
     */
    public void setDISPATCHNOTIFICATION(DISPATCHNOTIFICATION value) {
        this.dispatchnotification = value;
    }

}
