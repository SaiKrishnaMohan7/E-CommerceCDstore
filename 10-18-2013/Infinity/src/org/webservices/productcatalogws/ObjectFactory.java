
package org.webservices.productcatalogws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.webservices.productcatalogws package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservices.productcatalogws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductList }
     * 
     */
    public GetProductList createGetProductList() {
        return new GetProductList();
    }

    /**
     * Create an instance of {@link GetProductInfoResponse }
     * 
     */
    public GetProductInfoResponse createGetProductInfoResponse() {
        return new GetProductInfoResponse();
    }

    /**
     * Create an instance of {@link GetCategoryListResponse }
     * 
     */
    public GetCategoryListResponse createGetCategoryListResponse() {
        return new GetCategoryListResponse();
    }

    /**
     * Create an instance of {@link GetCategoryList }
     * 
     */
    public GetCategoryList createGetCategoryList() {
        return new GetCategoryList();
    }

    /**
     * Create an instance of {@link GetProductInfo }
     * 
     */
    public GetProductInfo createGetProductInfo() {
        return new GetProductInfo();
    }

    /**
     * Create an instance of {@link GetProductListResponse }
     * 
     */
    public GetProductListResponse createGetProductListResponse() {
        return new GetProductListResponse();
    }

}
