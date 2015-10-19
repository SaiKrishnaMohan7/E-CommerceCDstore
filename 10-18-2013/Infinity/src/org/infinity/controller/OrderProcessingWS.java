package org.infinity.controller;


import java.util.ArrayList;
import java.util.List;

import org.webservices.orderprocess.OrderProcessImpl;
import org.webservices.orderprocess.OrderProcessImplService;

public class OrderProcessingWS {
	
	OrderProcessImplService OS= new OrderProcessImplService();
	OrderProcessImpl op = OS.getOrderProcessImpl();
	
	public boolean createOrder(int orderid, int custid, int shipid, int billid, String orderdate, int total, int shipcost, int tax, int gtotal, String status)
	{
		boolean y  = false;
		y = op.createOrder(orderid, custid, shipid, billid, orderdate, total, shipcost, tax, gtotal, status);
		return y;
	}
	
	
	public List<String> getAccount(String accountname, String password)
	{
		List<String> getacc = new ArrayList<String>();
		getacc = op.getAccount(accountname, password);
		return getacc;
	}
	
	public boolean createAccount(String login, String password, int custid, String dateCreated, String lastaccessed, int attempts)
	{
		boolean createacc = false;
		createacc = op.createAccount(login, password, custid, dateCreated, lastaccessed, attempts);
		return createacc;
	}
	
	public boolean confirmOrder(String Orderid, String Status)
	{
		boolean ordcnf = false;
		ordcnf = op.confirmOrder(Orderid, Status);
		return ordcnf;
	}
}