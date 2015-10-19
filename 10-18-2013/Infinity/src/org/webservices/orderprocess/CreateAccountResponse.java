
package org.webservices.orderprocess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="createAccountReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "createAccountReturn"
})
@XmlRootElement(name = "createAccountResponse")
public class CreateAccountResponse {

    protected boolean createAccountReturn;

    /**
     * Gets the value of the createAccountReturn property.
     * 
     */
    public boolean isCreateAccountReturn() {
        return createAccountReturn;
    }

    /**
     * Sets the value of the createAccountReturn property.
     * 
     */
    public void setCreateAccountReturn(boolean value) {
        this.createAccountReturn = value;
    }

}
