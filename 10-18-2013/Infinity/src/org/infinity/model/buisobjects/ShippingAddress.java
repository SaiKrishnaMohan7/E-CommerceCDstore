package org.infinity.model.buisobjects;

public class ShippingAddress {

	private int customer_id;
	private int address_id;
	private String name;
	private  String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;

	public int getCustomer_id()
	{
		return customer_id;
	}

	public void setCustomer_id(int value)
	{
		this.customer_id = value;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String value)
	{
		this.name = value;
	}

	public int getAddress_id()
	{
		return address_id;
	}

	public void setAddress_id(int value)
	{
		this.address_id= value;
	}

	public String getStreet1()
	{
		return street1;
	}

	public void setStreet1(String value)
	{
		this.street1= value;
	}

	public String getStreet2()
	{
		return street2;
	}

	public void setStreet2(String value)
	{
		this.street2=value;
	}

	public String getCity()
	{
		return city;
	}
	public void setCity(String value)
	{
		this.city= value;
	}

	public String getState()
	{
		return state;
	}
	public void setState(String value)
	{
		this.state= value;
	}
	
	public String getZip()
	{
		return this.zip;
	}
	public void setZip(String value)
	{
		this.zip= value;
	}

	public ShippingAddress(int Customer_id, int Address_id, String Street1, String Street2, String City, String State, String Zip, String Name)
	{
		this.customer_id= Customer_id;
		this.address_id= Address_id;
		this.city=City;
		this.name=Name;
		this.state=State;
		this.street1=Street1;
		this.street2=Street2;
		this.zip=Zip;
	}
}
