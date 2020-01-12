package nccs.omts.repository;

import java.sql.*;
import java.util.*;
import nccs.omts.*;
import nccs.omts.model.*;

public class UserViewRepository {
	public static List<UserView> getViewPage(int u) throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from viewpage where movie_id="+u);
		List<UserView> users=new ArrayList<>();
		
		while (rs.next()) {
			UserView user = new UserView(rs.getString(3), rs.getInt(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getDouble(8),rs.getInt(9));
			users.add(user);
		}
		return users;
	}
        public static List<UserView> getViewhall(int u) throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from viewpage where hall_id="+u);
		List<UserView> users=new ArrayList<>();
		
		while (rs.next()) {
			UserView user = new UserView(rs.getString(3), rs.getInt(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getDouble(8),rs.getInt(9));
			users.add(user);
		}
		return users;
	}
}
