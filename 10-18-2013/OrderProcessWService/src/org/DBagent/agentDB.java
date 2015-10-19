package org.DBagent;
import java.sql.*;
import java.util.*;

public class agentDB {
	private Connection connect = null;

	public boolean startTransaction() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException
	{
		String connectURL = "jdbc:mysql://localhost:3306/test";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connect = DriverManager.getConnection(connectURL, "root", "fall2013");
		if (connect != null)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public boolean endTransaction() throws SQLException 
	{
		// check if the connection was not null
		if (connect == null)
		{
			return false;
		}
		//close it
		connect.close();
		// return true if closed otherwise false
		if (connect.isClosed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int executeQuery(String query) throws SQLException
	{
		int noOfRowsEffected = 0;
		if (connect == null)
		{
			return noOfRowsEffected;
		}
		else
		{
			Statement st = connect.createStatement();
			noOfRowsEffected = st.executeUpdate(query);
			// no. of rows returned will be 
			return noOfRowsEffected;	
		}
	}

	public String[] getQueryResults(String query) throws SQLException
	{
		List<String> getQueryList = new ArrayList<String>();
		ResultSet result = null;
		if (connect == null)
		{
			return (String[]) getQueryList.toArray(new String[getQueryList.size()]);
		}
		else
		{
			Statement st = connect.createStatement();
			result = st.executeQuery(query);
			ResultSetMetaData metadata = result.getMetaData();
			int numberOfColumns = metadata.getColumnCount();

			while (result.next()) {              
				int i = 1;
				String tmp = "";
				while(i <= numberOfColumns) {

					tmp = tmp + result.getString(i).toString() + ";";
					i++;
				}
				getQueryList.add(tmp);
			}
		}
		return (String[]) getQueryList.toArray(new String[getQueryList.size()]);
	}

	
	public static Connection getConnectionPool() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		Connection connectPool = null;
		String connectURL = "jdbc:mysql://localhost:3306/test";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connectPool = DriverManager.getConnection(connectURL, "root", "fall2013");
		return connectPool;
	}
	
	public static int executeQuery(String query, Connection connectPool) throws SQLException
	{
		int noOfRowsEffected = 0;
		if (connectPool == null)
		{
			return noOfRowsEffected;
		}
		else
		{
			Statement st = connectPool.createStatement();
			noOfRowsEffected = st.executeUpdate(query);
			// no. of rows returned will be 
			return noOfRowsEffected;	
		}
	}
	
	public ResultSet getQueryResults(String query, Connection connectPool) throws SQLException
	{
		ResultSet result = null;
		if (connectPool == null)
		{
			return result;
		}
		else
		{
			Statement st = connectPool.createStatement();
			result = st.executeQuery(query);
			return result;
		}
	}
	
}
