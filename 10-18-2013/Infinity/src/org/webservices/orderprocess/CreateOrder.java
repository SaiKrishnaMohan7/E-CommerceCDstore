
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
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipping_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="billing_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="order_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipping_cost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grand_total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "orderId",
    "customerId",
    "shippingId",
    "billingId",
    "orderDate",
    "total",
    "shippingCost",
    "tax",
    "grandTotal",
    "status"
})
@XmlRootElement(name = "createOrder")
public class CreateOrder {

    @XmlElement(name = "order_id")
    protected int orderId;
    @XmlElement(name = "customer_id")
    protected int customerId;
    @XmlElement(name = "shipping_id")
    protected int shippingId;
    @XmlElement(name = "billing_id")
    protected int billingId;
    @XmlElement(name = "order_date", required = true)
    protected String orderDate;
    protected int total;
    @XmlElement(name = "shipping_cost")
    protected int shippingCost;
    protected int tax;
    @XmlElement(name = "grand_total")
    protected int grandTotal;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
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
     * Gets the value of the shippingId property.
     * 
     */
    public int getShippingId() {
        return shippingId;
    }

    /**
     * Sets the value of the shippingId property.
     * 
     */
    public void setShippingId(int value) {
        this.shippingId = value;
    }

    /**
     * Gets the value of the billingId property.
     * 
     */
    public int getBillingId() {
        return billingId;
    }

    /**
     * Sets the value of the billingId property.
     * 
     */
    public void setBillingId(int value) {
        this.billingId = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the shippingCost property.
     * 
     */
    public int getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     */
    public void setShippingCost(int value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     */
    public int getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     */
    public void setTax(int value) {
        this.tax = value;
    }

    /**
     * Gets the value of the grandTotal property.
     * 
     */
    public int getGrandTotal() {
        return grandTotal;
    }

    /**
     * Sets the value of the grandTotal property.
     * 
     */
    public void setGrandTotal(int value) {
        this.grandTotal = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
