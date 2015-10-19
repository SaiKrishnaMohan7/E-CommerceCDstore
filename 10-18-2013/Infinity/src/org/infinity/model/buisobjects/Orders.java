package org.infinity.model.buisobjects;

import java.util.Date;

public class Orders {

	private int order_id;
	private int customer_id;
	private int billing_id;
	private int shipping_id;
	private Date order_date;
	private int total;
	private int shipping_cost;
	private int tax;
	private int grand_total;
	private String status;
	
	public int getOrder_id()
	{
		return order_id;
	}
	public void setOrder_id(int value)
	{
		this.order_id= value;
	}
	
	public int getShipping_id()
	{
		return shipping_id;
	}
	public void setShipping_id(int value)
	{
		this.shipping_id= value;
	}
	
	public int getCustomer_id()
	{
		return customer_id;
	}
	public void setCustomer_id(int value)
	{
		this.customer_id= value;
	}
	
	public int getBilling_id()
	{
		return billing_id;
	}
	public void setBilling_id(int value)
	{
		this.billing_id= value;
	}
	
	public int getTotal()
	{
		return total;
	}
	public void setTotal(int value)
	{
		this.total= value;
	}
	
	public int getShipping_cost()
	{
		return shipping_cost;
	}
	public void setShipping_cost(int value)
	{
		this.shipping_cost= value;
	}
	
	public int getGrand_total()
	{
		return grand_total;
	}
	public void setGrand_total(int value)
	{
		this.grand_total= value;
	}
	
	public int getTax()
	{
		return tax;
	}
	public void setTax(int value)
	{
		this.tax= value;
	}
	
	public String getStatus()
	{
	  return status;	
	}
	public void setStatus(String value)
	{
		this.status= value; 
	}
	
	public Date getOrder_date()
	
	{
		return order_date;
	}
	public void setOrder_date(Date value)
	{
		this.order_date= value;
	}
	
	public Orders(int Order_id, int Customer_id, int Shipping_id, int Billing_id, Date Order_date, int Total, int Shipping_cost, int Tax, int Grand_total, String Status)
	{
		this.billing_id= Billing_id;
		this.customer_id= Customer_id;
		this.grand_total= Grand_total;
		this.order_date= Order_date;
		this.order_id= Order_id;
		this.shipping_cost= Shipping_cost;
		this.shipping_id= Shipping_id;
		this.status= Status;
		this.tax= Tax;
		this.total= Total;
	}
}
