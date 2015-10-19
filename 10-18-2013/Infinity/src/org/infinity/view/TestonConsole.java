package org.infinity.view;

import org.infinity.model.buisobjects.*;
import org.webservices.productcatalogws.*;
public class TestonConsole {

	public static void main(String[] args)  
	{

			Product[] porod = Helper.getAllProducts("");
			for (Product item : porod)
			{
				System.out.println(item.getName());
			}

			Category[] cat = Helper.getAllCategory();
			for (Category item : cat)
			{
				System.out.println(item.getName());
			}

	

		//		Product[] items = Product.getAllProducts("");
		//		
		//		items[0].getCategory_id();
		//		System.out.println('t');
	}


}
