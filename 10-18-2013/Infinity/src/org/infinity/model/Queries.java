package org.infinity.model;

public class Queries {

	public static String databaseName = "infinity_database";


	public static String GET_ALL_CATEGORY()
	{
		String x = "SELECT * FROM "+ databaseName +".category;"; 
		return x;
	}

	public static String INSERT_ACCOUNT(String p_accountName, String p_password, String p_firstName, String p_lastName, String p_paymentInfo)
	{
		String x = "Insert into "+databaseName+".account(accountname, password, firstname, lastname, paymentinfo)" +
				"  Values('" + p_accountName + "','"+ p_password +"','"+ p_firstName +"','"+ p_lastName +"','"+p_paymentInfo + "');"; 
		return x;
	}



	public static String INSERT_CATEGORY(int category_id, String name, String description)
	{
		String x = "INSERT INTO " + databaseName + ".`category`(`category_id`,`name`,`description`)" + "VALUES('" + category_id + "'" + ","  + "'" + name + "'" + "," +  "'" + description + "'" +");";

		return x;
	}

	public static String GET_ALL_CATEGORY(int category_id)
	{
		String x = "SELECT * FROM "+ databaseName +".`category` where category_id='" + category_id  +"' ;"; 
		return x;
	}

	public static String INSERT_ORDER_DETAILS(int id,int order_id, int product_id, int unit_price, int total)
	{
		String x ="INSERT INTO " + databaseName + ".`order_details`(`id`,`order_id`, `product_id`, `unit_price`, `total`)" + " VALUES('" + id +  "'" + "," + "'" + order_id + "'" + "," + "'" + product_id + "'" + "," + "'" + unit_price + "'" + "," + "'" + total + "'" + ");" ;

		return x;
	}

	public static String GET_ALL_ORDER_DETAILS(int order_id)
	{
		String x = "SELECT * FROM "+ databaseName +".`order_details` where order_id= '"+ order_id + "' ;" ; 
		return x;
	}

	public static String INSERT_PRODUCT(int product_id,int category_id,int quantity_onhand,int unit_price,  String name, String description, String image, String status )
	{
		String x = "INSERT INTO " + databaseName + ".`product`(`product_id`,`category_id`,`name`,`description`,`unit_price`,`quantity_onhand`,`image`,`status`)" + "VALUES('" + product_id + "'" + "," + "'" + category_id + "'" + ", " + "'"+ name + "'" + "," +  "'" + description + "'" + "," + "'" + unit_price + "'" + "," + "'" + quantity_onhand + "'" + "," + "'" + image + "'" + ");";
		return x;
	}

	public static String GET_ALL_PRODUCT()
	{
		String x = "SELECT * FROM "+ databaseName +".`product`;"; 
		return x;
	}

	public static String INSERT_SHIPPING_ADDRESS(int customer_id, int address_id, String name, String street1, String street2 , String city, String state, int zip )
	{
		String x =  "INSERT INTO " + databaseName + ".`shipping_address`(`customer_id`,`address_id`,`name`,`street1`,`street2`,`city`,`state`,`zip`)" + "VALUES('" + customer_id + "'" +"," + "'" + address_id + "'" + "," + "'" + name + "'" + "," + "'" + street1 + "'" + "," + "'" + street2 + "'" + "," + "'" + city + "'" + "," + "'" + state + "'" + "," + "'" + zip + "'" + ");";
		return x; 
	}   
	public static String GET_SHIPPING_ADDRESS(int customer_id, int address_id)
	{
		String x = "SELECT * FROM "+ databaseName +".`shipping_address` where customer_id = '"+customer_id+"';"; 
		return x;
	}


	public static String INSERT_CUSTOMER(int customer_id,String firstname, String lastname, String email, String gender , String birthdate, int phone )
	{
		String x =  "INSERT INTO " + databaseName + ".`customer`(`customer_id`,`firstname`,`lastname`,`email`,`phone`,`gender`,`birthdate`)" + "VALUES('" + customer_id + "'" +"," + "'" + firstname + "'" + "," + "'" + lastname + "'" + "," + "'" + email + "'" + "," + "'" + phone + "'" + "," + "'" + gender + "'" + "," + "'" + birthdate + "'" + ");";
		return x; 
	}   
	public static String GET_CUSTOMER(int login, String password)
	{
		String x = "SELECT * FROM "+ databaseName +".`customer` where login = '"+ login +"' and password = '"+ password +"';"; 
		return x;
	}

	public static String INSERT_CUSTOMER_ADDRESS(int customer_id, String name, String street1, String street2 , String city, String state, int zip )
	{
		String x =  "INSERT INTO " + databaseName + ".`customer_address`(`customer_id`,`name`,`street1`,`street2`,`city`,`state`,`zip`)" + "VALUES('" + customer_id + "'" +"," + "'" + name + "'" + "," + "'" + street1 + "'" + "," + "'" + street2 + "'" + "," + "'" + city + "'" + "," + "'" + state + "'" + "," + "'" + zip + "'" + ");";
		return x; 
	}   
	public static String GET_CUSTOMER_ADDRESS(int customer_id)
	{
		String x = "SELECT * FROM "+ databaseName +".`customer_address` where customer_id = '"+customer_id+"';"; 
		return x;
	}

	public static String INSERT_CUSTOMER_BILLING(int customer_id , String expiry_date,int card_number, int card_id, String card_type)
	{
		String x ="INSERT INTO " + databaseName + ".`customer_billing`(`customer_id`,`card_id`, `card_type`, `card_number`, `expiry_date`)" + " VALUES('" + customer_id +  "'" + "," + "'" + card_id + "'" + "," + "'" + card_type + "'" + "," + "'" + card_number + "'" + "," + "'" + expiry_date + "'" + ");" ;

		return x;
	}
	public static String GET_CUSTOMER_BILLING(int customer_id)
	{
		String x = "SELECT * FROM "+ databaseName +".`customer_billing` where customer_id = '" + customer_id + "' ;"; 
		return x;
	}


	public static String GET_PRODUCT_FOR_CATEGORY(String category_id)
	{
		String x = "";
		if(category_id.toCharArray().length != 0)
		{
			x = "SELECT * FROM "+ databaseName +".product where category_id = '" + category_id + "';"; 
		}
		else
		{
			x = "SELECT * FROM "+ databaseName +".product;";
		}
		return x;
	}

	public static String GET_PRODUCT_FOR_PRODUCT_ID(String product_id )
	{
		String x = "";
		if(product_id.toCharArray().length != 0)
		{
			x = "SELECT * FROM "+ databaseName +".product where product_id = '" + product_id + "';"; 
		}
		else
		{
			x = "SELECT * FROM "+ databaseName +".product;";
		}
		return x;
	}

	// ORDER PROCESS

	public static String INSERT_ORDER(int p_order_id, int p_customer_id, int p_shipping_id, int p_billing_id, String p_orderdate, int p_total,  int p_shipping_cost, int p_tax, int p_grandtotal, String p_status)
	{
		String x = "Insert into " + databaseName + ".orders(order_id, customer_id, shipping_id, billing_id, order_date, total, shipping_cost, tax, grand_total, status) ";
		x = x + "Values(";
		x = x + p_order_id + ", ";
		x = x + p_customer_id + ", ";
		x = x + p_shipping_id + ", ";
		x = x + p_billing_id + ", '";
		x = x + p_orderdate + "', ";
		x = x + p_total + ", ";
		x = x + p_shipping_cost + ", ";
		x = x + p_tax + ", ";
		x = x + p_grandtotal + ", '";
		x = x + p_status + "');";
		return x;

	}

	public static String INSERT_CUSTOMER_LOGIN(String p_login, String p_password, int p_customer_id, String p_date_created, String p_last_accessed, int p_attempts)
	{
		String x = "Insert into " + databaseName + ".customer_login(login, password, customer_id, date_created, last_accessed, attempts) ";
		x = x + "Values('";
		x = x + p_login + "', '";
		x = x + p_password + "', ";
		x = x + p_customer_id + ", '";
		x = x + p_date_created + "', '";
		x = x + p_last_accessed + "', ";
		x = x + p_attempts + ");";
		return x;

	}

	public static String GET_CUSTOMER_LOGIN(String p_login, String p_password)
	{
		String x = "";
		if(p_login.toCharArray().length != 0 && p_password.toCharArray().length != 0)
		{
			x = "SELECT * FROM "+ databaseName +".customer_login where login = '" + p_login + "' and password = '" + p_password +"';"; 
		}
		else
		{
			x = "SELECT * FROM "+ databaseName +".customer_login;";
		}
		return x;
	}

	public static String CONFIRM_ORDER(int order_id, String status)
	{

		String	x = "UPDATE `"+ databaseName + "`.`orders` SET `status`='"+ status +"' WHERE `order_id`='" + order_id + "';"; 
		return x;
	}

	public static String GET_ORDER(int order_id)
	{
		String x = "SELECT * FROM "+ databaseName +".`orders` where order_id= '"+ order_id + "' ;" ; 
		return x;
	}


	public static String GET_STATUS_DESC(String status_id)
	{
		String x = "SELECT * FROM "+ databaseName +".`status_codes` where status_code = '"+ status_id + "' ;" ; 
		return x;
	}
}


