package org.infinity.model.buisobjects;

import java.util.Date;

public class Customer {
	
	private int customer_id;
	private String firstname;
	private String lastname;
	private String email;
	private int phone;
	private String gender;
	private Date birthdate;
	
	public int getCustomer_id()
	{
		return customer_id;
	}
	public void setCustomer_id(int value)
	{
		this.customer_id= value;
	}

	public int getPhone()
	{
		return phone;
	}
	public void setPhone(int value)
	{
		this.phone= value;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String value)
	{
		this.firstname= value;
	}
	
	public String getLastname()
	{
		return lastname;
	}
	public void setLastname(String value)
	{
		this.lastname= value;
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String value)
	{
		this.email= value;
	}
	
	public String getGender()
	{
		return gender;
	}
	public void setGender(String value)
	{
		this.gender= value;
	}
	
	public Date getBirthdate()
	{
		return birthdate;
	}
	public void setBirthdate(Date value)
	{
		this.birthdate= value;
	}
	
	
	public Customer(int Customer_id, String Firstname, String Lastname, String Email, int Phone, String Gender, Date Birthdate)
	{
		this.birthdate= Birthdate;
		this.customer_id= Customer_id;
		this.email= Email;
		this.firstname=Firstname;
		this.gender= Gender;
		this.lastname=Lastname;
		this.phone= Phone;
	}
}
