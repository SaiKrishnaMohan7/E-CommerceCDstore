package org.infinity.model.buisobjects;

import org.webservices.productcatalogws.ProductCatalogImpl;
import org.webservices.productcatalogws.ProductCatalogImplService;

public class Product {

	private int product_id;
	private int category_id;
	private int unit_price;
	private int quantity_onhand;
	private String name;
	private String description;
	private String image;
	private String status;
	
	public int getProduct_id()
	{
		return product_id;
	}
	public void setProduct_id(int value)
	{
		this.product_id= value;
	}
	
	public int getCategory_id()
	{
		return category_id;
	}
	public void setCategory_id(int value)
	{
		this.category_id= value;
	}
	
	public int getUnit_price()
	{
		return unit_price;
	}
	public void setUnit_price(int value)
	{
		this.unit_price = value;
	}
	
	public int getQuantity_onhand()
	{
		return quantity_onhand;
	}
	public void setQuantity_onhand(int value)
	{
		this.quantity_onhand= value;
	}
	
	public String getImage()
	{
		return image;
	}
	public void setImage(String value)
	{
		this.image= value;
	}
	
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String value)
	{
		this.status= value;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String value)
	{
		this.name = value;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String value)
	{
		description = value;
	}
	
	public Product(int Product_id, int Category_id, String Name, String Description, int Unit_price,int Quantity_onhand, String Image, String Status)
	{
		this.category_id= Category_id;
		this.description= Description;
		this.image=Image;
		this.name= Name;
		this.product_id= Product_id;
		this.quantity_onhand= Quantity_onhand;
		this.status= Status;
		this.unit_price= Unit_price;
	}
	
	public Product()
	{
		this.category_id= -1;
		this.description= "";
		this.image="";
		this.name= "";
		this.product_id= -1;
		this.quantity_onhand= -1;
		this.status= "";
		this.unit_price= -1;

	}
	
	
	
	
	
}


