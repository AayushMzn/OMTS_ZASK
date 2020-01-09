package nccs.omts.repository;

import java.sql.*;
import java.util.*;
import nccs.omts.*;
import nccs.omts.model.*;

public class CustomerRepository {
	public List<Customers> getCustomer() throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from customers");
		List<Customers> customers=new ArrayList<>();
		
		while (rs.next()) {
			Customers customer = new Customers(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
			customers.add(customer);
		}
		return customers;
	}

	public void addToCustomer(int customer_id,String customer_name,String email,int phone_num)throws SQLException{
		Connection connection=DBconnection.getConnection();
		Statement statement=connection.createStatement();
		statement.executeUpdate("INSERT INTO customers values("+customer_id+","+customer_name+","+phone_num+","+email+")");
	}
}

