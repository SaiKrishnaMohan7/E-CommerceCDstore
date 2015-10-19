package org.infinity.model.buisobjects;

import java.util.ArrayList;
import java.util.List;

import org.webservices.productcatalogws.ProductCatalogImpl;
import org.webservices.productcatalogws.ProductCatalogImplService;

public class Helper {

	public static Product[] getAllProducts(String categoryID)
	{
		ProductCatalogImplService service = new ProductCatalogImplService();
		ProductCatalogImpl productcatalog = service.getProductCatalogImpl();
		Product[] resultset = new Product[productcatalog.getProductList(categoryID).size()]; 	

		int count = 0;
		for (String item : productcatalog.getProductList(categoryID))
		{
			String[] splitt = item.split(";");

			Product tmp = new Product();
			
			tmp.setProduct_id(Integer.parseInt(splitt[0]));
			tmp.setCategory_id(Integer.parseInt(splitt[1]));
			tmp.setName(splitt[2]);
			tmp.setDescription(splitt[3]);
			tmp.setUnit_price(Integer.parseInt(splitt[4]));
			tmp.setQuantity_onhand(Integer.parseInt(splitt[5])) ;
			tmp.setImage(splitt[6]);
			tmp.setStatus(splitt[7]);

			resultset[count] = tmp;
			count++;

		}

		return resultset;
	}



	public static Product getProductInfo(String productId)
	{
		ProductCatalogImplService service = new ProductCatalogImplService();
		ProductCatalogImpl productcatalog = service.getProductCatalogImpl();
		Product resultset = new Product();

		int count = 0;
		for (String item : productcatalog.getProductInfo(productId))
		{
			String[] splitt = item.split(";");

			Product tmp = new Product();
			
			tmp.setProduct_id(Integer.parseInt(splitt[0]));
			tmp.setCategory_id(Integer.parseInt(splitt[1]));
			tmp.setName(splitt[2]);
			tmp.setDescription(splitt[3]);
			tmp.setUnit_price(Integer.parseInt(splitt[4]));
			tmp.setQuantity_onhand(Integer.parseInt(splitt[5])) ;
			tmp.setImage(splitt[6]);
			tmp.setStatus(splitt[7]);

			resultset = tmp;
			count++;
		}

		return resultset;
	}
	
	public static Category[] getAllCategory()
	{
		ProductCatalogImplService service = new ProductCatalogImplService();
		ProductCatalogImpl productcatalog = service.getProductCatalogImpl();
		
		Category[] resultset = new Category[productcatalog.getCategoryList().size()]; 	
		
		int count = 0;
		for (String item : productcatalog.getCategoryList())
		{
			String[] splitt = item.split(";");

			Category tmp = new Category();
			
			tmp.setCategory_id(Integer.parseInt(splitt[0]));
			tmp.setName(splitt[1]);
			tmp.setDescrition(splitt[2]);
			
			resultset[count] = tmp;
			count++;
		}
		return resultset;
	}
}
