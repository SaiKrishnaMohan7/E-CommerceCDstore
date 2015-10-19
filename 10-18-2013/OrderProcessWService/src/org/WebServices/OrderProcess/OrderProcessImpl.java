package org.WebServices.OrderProcess;

import javax.jws.WebService;

import org.DBagent.*;

@WebService
public class OrderProcessImpl {

	public Boolean createOrder(int order_id, int customer_id, int shipping_id, int billing_id, String order_date, int total,  int shipping_cost, int tax, int grand_total, String status)
	{
		agentDB DB = new agentDB();
		int noOfRowsChanged = 0;
		try{
			DB.startTransaction();
			noOfRowsChanged = DB.executeQuery(Queries.INSERT_ORDER(order_id, customer_id, shipping_id, billing_id, order_date, total, shipping_cost, tax, grand_total, status));
			DB.endTransaction();		
		}catch(Exception e)
		{

		}

		if(noOfRowsChanged > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean createAccount(String login, String password, int customer_id, String date_created, String late_accessed, int attempts)
	{
		agentDB DB = new agentDB();
		int noOfRowsChanged = 0;
		try{
			DB.startTransaction();
			noOfRowsChanged = DB.executeQuery(Queries.INSERT_CUSTOMER_LOGIN(login, password, customer_id, date_created, late_accessed, attempts));
			DB.endTransaction();		
		}
		catch(Exception e)
		{
			
		}
		if(noOfRowsChanged > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String[] getAccount(String accountName, String accountPassword) 
	{

		String[] rs = null;
		agentDB DB = new agentDB();
		try
		{
			DB.startTransaction();
			rs = DB.getQueryResults(Queries.GET_CUSTOMER_LOGIN(accountName, accountPassword));
			DB.endTransaction();
		}
		catch(Exception e)
		{

		}
		return rs;
	}

	public Boolean confirmOrder(String order_id, String status)
	{
		agentDB DB = new agentDB();
		int noOfRowsChanged = 0;
		try{
			DB.startTransaction();
			noOfRowsChanged = DB.executeQuery(Queries.CONFIRM_ORDER(order_id, status));
			DB.endTransaction();		
		}catch(Exception e)
		{
			
		}
		if(noOfRowsChanged > 0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

}