package org.infinity.model.buisobjects;

import java.util.Date;

public class CustomerBilling {

	
	private int customer_id;
	private int card_id;
	private String card_type;
	private int card_number;
	private Date expiry_date;
	
	public int getCustomer_id()
	{
		return customer_id;
	}
	public void setCustomer_id(int value)
	{
		this.customer_id= value;
	}
	
	public int getCard_id()
	{
		return card_id;
	}
	public void setCard_id(int value)
	{
		this.card_id= value;
	}
	
	public int getCard_number()
	{
		return card_number;
	}
	public void setCard_number(int value)
	{
		this.card_number= value;
	}
	
	public String getCard_type()
	{
		return card_type; 
	}
	public void setCard_type(String value)
	{
		this.card_type= value;
	}
	
public Date getExpiry_date()
	
	{
		return expiry_date;
	}
	public void setExpiry_date(Date value)
	{
		this.expiry_date= value;
	}
	
	
	public CustomerBilling(int Customer_id, int Card_id, int Card_number,String Card_type,  Date Expiry_date )
	{
		this.card_id= Card_id;
		this.card_number= Card_number;
		this.card_type= Card_type;
		this.customer_id= Customer_id;
		this.expiry_date= Expiry_date;
		
	}
}
