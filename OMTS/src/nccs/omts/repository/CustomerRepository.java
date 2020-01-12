package nccs.omts.repository;

import java.sql.*;
import java.util.*;
import nccs.omts.*;
import nccs.omts.model.*;

public class CustomerRepository {
	public static List<Customers> getCustomer() throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from customer");
		List<Customers> customers=new ArrayList<>();
		
		while (rs.next()) {
			Customers customer = new Customers(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getLong(4),rs.getString(5),rs.getString(6));
			customers.add(customer);
		}
		return customers;
	}

	public void addToCustomer(String first_name,String last_name,Long phone_num,String email_id,String password)throws SQLException{
		Connection connection=DBconnection.getConnection();
		Statement statement=connection.createStatement();
		statement.executeUpdate("INSERT INTO customer(first_name, last_name, phone_num, email, password) values('"+first_name+"','"+last_name+"',"+phone_num+",'"+email_id+"','"+password+"');");
	}
}
