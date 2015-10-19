package org.WebServices.ProductCatalogWS;

import java.sql.*;
import java.util.*;
import javax.jws.*;

import org.DBagent.*;

@WebService
public class ProductCatalogImpl{


	public String[] getProductInfo(String product_id) 
	{
		String[] getproduct = null;
		try
		{
			agentDB DB = new agentDB();
			DB.startTransaction();
			getproduct = DB.getQueryResults(Queries.GET_PRODUCT_FOR_PRODUCT_ID(product_id));

			DB.endTransaction();
		}catch (Exception e) {

		} finally {        

		}

		return getproduct;

	}

	public String[] getProductList(String category_id) 
	{
		String[] getproductlist = null;
		try
		{
			agentDB DB = new agentDB();
			DB.startTransaction();
			getproductlist = DB.getQueryResults(Queries.GET_PRODUCT_FOR_CATEGORY(category_id));

			DB.endTransaction();
		}catch (Exception e) {

		} finally {        

		}

		return getproductlist;
	}

	public String[] getCategoryList() 
	{
		String[] getcategory = null;
		try
		{
			agentDB DB = new agentDB();

			DB.startTransaction();
			getcategory = DB.getQueryResults(Queries.GET_ALL_CATEGORY());

			DB.endTransaction();
		}catch (Exception e) {

		} finally {        

		}

		return getcategory;
	}


}
