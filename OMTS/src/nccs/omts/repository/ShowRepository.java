package nccs.omts.repository;

import java.sql.*;
import java.util.*;
import nccs.omts.*;
import nccs.omts.model.*;

public class ShowRepository {
	public static List<Shows> getShows() throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from shows");
		List<Shows> show1=new ArrayList<>();
		
		while (rs.next()) {
			Shows show = new Shows(rs.getInt(1), rs.getInt(2),rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6), rs.getString(7));
			show1.add(show);
		}
		return show1;
	}
	
	public static Shows getShow(int showId) throws SQLException {
        List<Shows> allshow = getShows();
        for (Shows show : allshow) {
            if (show.getShow_id() == showId) {
                return show;
            }
        }
        return null;
    }
}
