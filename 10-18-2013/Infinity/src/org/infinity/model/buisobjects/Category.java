package org.infinity.model.buisobjects;

import org.webservices.productcatalogws.*;

public class Category {

	
	private int category_id;
	private  String name;
	private String description;
	
	public int getCategory_id()
	{
		return category_id;
	}
	public void setCategory_id(int value)
	{
		this.category_id= value;
	}
	
	public String getName()
	{
		return name; 
	}
	public void setName(String value)
	{
		this.name= value;
	}
	
	public String getDescription()
	{
		return description;
	}
	public void setDescrition(String value)
	{
		this.description= value;
	}
	
	public Category(int Category_id, String Name, String Description)
	{
		this.category_id= Category_id;
		this.description= Description;
		this.name= Name;
	}
	public Category()
	{
		this.category_id = -1;
		this.description = "";
		this.name = "";
		
	}
	
	
	
}
