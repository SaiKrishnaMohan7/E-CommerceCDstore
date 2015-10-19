
package org.webservices.productcatalogws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductCatalogImpl", targetNamespace = "http://ProductCatalogWS.WebServices.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductCatalogImpl {


    /**
     * 
     * @param productId
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "getProductInfoReturn", targetNamespace = "http://ProductCatalogWS.WebServices.org")
    @RequestWrapper(localName = "getProductInfo", targetNamespace = "http://ProductCatalogWS.WebServices.org", className = "org.webservices.productcatalogws.GetProductInfo")
    @ResponseWrapper(localName = "getProductInfoResponse", targetNamespace = "http://ProductCatalogWS.WebServices.org", className = "org.webservices.productcatalogws.GetProductInfoResponse")
    public List<String> getProductInfo(
        @WebParam(name = "product_id", targetNamespace = "http://ProductCatalogWS.WebServices.org")
        String productId);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "getCategoryListReturn", targetNamespace = "http://ProductCatalogWS.WebServices.org")
    @RequestWrapper(localName = "getCategoryList", targetNamespace = "http://ProductCatalogWS.WebServices.org", className = "org.webservices.productcatalogws.GetCategoryList")
    @ResponseWrapper(localName = "getCategoryListResponse", targetNamespace = "http://ProductCatalogWS.WebServices.org", className = "org.webservices.productcatalogws.GetCategoryListResponse")
    public List<String> getCategoryList();

    /**
     * 
     * @param categoryId
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "getProductListReturn", targetNamespace = "http://ProductCatalogWS.WebServices.org")
    @RequestWrapper(localName = "getProductList", targetNamespace = "http://ProductCatalogWS.WebServices.org", className = "org.webservices.productcatalogws.GetProductList")
    @ResponseWrapper(localName = "getProductListResponse", targetNamespace = "http://ProductCatalogWS.WebServices.org", className = "org.webservices.productcatalogws.GetProductListResponse")
    public List<String> getProductList(
        @WebParam(name = "category_id", targetNamespace = "http://ProductCatalogWS.WebServices.org")
        String categoryId);

}