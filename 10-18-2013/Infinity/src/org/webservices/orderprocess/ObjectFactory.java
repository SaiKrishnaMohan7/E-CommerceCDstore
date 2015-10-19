
package org.webservices.orderprocess;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.webservices.orderprocess package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservices.orderprocess
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link ConfirmOrder }
     * 
     */
    public ConfirmOrder createConfirmOrder() {
        return new ConfirmOrder();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link ConfirmOrderResponse }
     * 
     */
    public ConfirmOrderResponse createConfirmOrderResponse() {
        return new ConfirmOrderResponse();
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

}
