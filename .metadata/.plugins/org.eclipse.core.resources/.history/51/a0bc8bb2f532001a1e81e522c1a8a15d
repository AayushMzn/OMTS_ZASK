package nccs.omts.repository;

import java.sql.*;
import java.util.*;
import nccs.omts.*;
import nccs.omts.model.*;

public class MoviesRepository {
	public static List<Movies> getMovies() throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from movies");
		List<Movies> movies=new ArrayList<>();
		
		while (rs.next()) {
			Movies movie = new Movies(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7));
			movies.add(movie);
		}
		return movies;
	}
        
        public static List<Movies> getMoviesById(int id) throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from movies where movie_id="+id);
		List<Movies> movies=new ArrayList<>();
		
		while (rs.next()) {
			Movies movie = new Movies(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7));
			movies.add(movie);
		}
		return movies;
	}
}
