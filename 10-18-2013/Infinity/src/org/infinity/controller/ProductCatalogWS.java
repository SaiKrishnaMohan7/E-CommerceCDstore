package org.infinity.controller;


import java.util.ArrayList;
import java.util.List;

import org.webservices.productcatalogws.ProductCatalogImpl;
import org.webservices.productcatalogws.ProductCatalogImplService;

public class ProductCatalogWS {

	ProductCatalogImplService ws = new ProductCatalogImplService();
	ProductCatalogImpl productservice = ws.getProductCatalogImpl();
	
	public List<String> getCategoryList() {
		List<String> getcat  = new ArrayList<String>();
		getcat = productservice.getCategoryList();
		return getcat;
				
	}

	public List<String> getProductList(String categoryId) {
		List<String> getprodlist  = new ArrayList<String>();
		getprodlist = productservice.getProductList(categoryId);
		return getprodlist;
	}
	
	public List<String> getProductinfo (String productId)
	{
		List<String> getprodinfo  = new ArrayList<String>();
		getprodinfo = productservice.getProductInfo(productId);
		return getprodinfo;
	}
}
