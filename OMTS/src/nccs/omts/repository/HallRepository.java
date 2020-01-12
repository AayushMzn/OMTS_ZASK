package nccs.omts.repository;

import java.sql.*;
import java.util.*;

import nccs.omts.DBconnection;
import nccs.omts.model.Hall;



public class HallRepository {
    public static List<Hall> getHall() throws SQLException{
	Connection connection = DBconnection.getConnection();
	Statement statement=connection.createStatement();
	ResultSet rs=statement.executeQuery("Select * from hall");
	List<Hall> halls=new ArrayList<>();
		
	while (rs.next()) {
            Hall hall = new Hall(rs.getInt(1), rs.getString(2), rs.getInt(3));
            halls.add(hall);
        }
	return halls;
    }
    public static Hall getHall(int hallId) throws SQLException {
        List<Hall> allProduct = getHall();
        for (Hall hall : allProduct) {
            if (hall.getHall_id() == hallId) {
                return hall;
            }
        }
        return null;
    }
     public void addToHall(int hall_id,String hall_name, int seats)throws SQLException{
		Connection connection=DBconnection.getConnection();
		Statement statement=connection.createStatement();
		statement.executeUpdate("INSERT INTO customers(hall_name,seats) values('"+hall_name+"',"+seats+");");
	}
}
