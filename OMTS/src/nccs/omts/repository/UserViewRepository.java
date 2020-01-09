/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nccs.omts.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import nccs.omts.DBconnection;
import nccs.omts.model.*;

/**
 *
 * @author Aayush
 */
public class UserViewRepository {
    public static List<UserView> getUserView(int u) throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from userview where show_id="+u);
		List<UserView> users=new ArrayList<>();
		
		while (rs.next()) {
			UserView user = new UserView(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4));
			users.add(user);
		}
		return users;
	}
}
