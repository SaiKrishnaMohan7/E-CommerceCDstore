
package org.webservices.orderprocess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date_created" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="late_accessed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "login",
    "password",
    "customerId",
    "dateCreated",
    "lateAccessed",
    "attempts"
})
@XmlRootElement(name = "createAccount")
public class CreateAccount {

    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(name = "customer_id")
    protected int customerId;
    @XmlElement(name = "date_created", required = true)
    protected String dateCreated;
    @XmlElement(name = "late_accessed", required = true)
    protected String lateAccessed;
    protected int attempts;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the password property.
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
     * Sets the value of the password property.
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
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreated(String value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the lateAccessed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateAccessed() {
        return lateAccessed;
    }

    /**
     * Sets the value of the lateAccessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateAccessed(String value) {
        this.lateAccessed = value;
    }

    /**
     * Gets the value of the attempts property.
     * 
     */
    public int getAttempts() {
        return attempts;
    }

    /**
     * Sets the value of the attempts property.
     * 
     */
    public void setAttempts(int value) {
        this.attempts = value;
    }

}
