package org.infinity.model.buisobjects;

import java.util.Date;

public class CustomerLogin {

	
	private int login;
	private String password;
	private int customer_id;
	private Date date_created;
	private Date last_accessed;
	private int attempts;
	
	public int getLogin()
			{
				return login;
			}
	public void setLogin(int value)
	{
		this.login= value;
	}
	
	
	public int getAttempts()
	{
		return attempts;
	}
	public void setAttempts(int value)
	{
		this.attempts= value;
	}
	
	public int getCustomer_id()
	{
		return customer_id;
	}
	public void setCustomer_id(int value)
	{
		this.customer_id= value;
	}
	
	public String getPassword()
	{
		return password;
	
	}
	public void setPassword(String value)
	{
		this.password= value;
	}
	
	public Date getDate_created()
	{
		return date_created;
	}
	
	public void setDate_created(Date value)
	{
		this.date_created= value;
	}
	
	public Date getLast_accessed()
	{
		return last_accessed;
	}
	
	public void setLast_accessed(Date value)
	{
		this.last_accessed= value;
	}
	
	
	public CustomerLogin(int Login, String Password, int Customer_id, Date Date_created, Date Last_accessed, int Attempts)
	{
		
		this.attempts= Attempts;
		this.customer_id= Customer_id;
		this.date_created= Date_created;
		this.last_accessed= Last_accessed;
		this.login= Login;
		this.password= Password;
		
	}
}
