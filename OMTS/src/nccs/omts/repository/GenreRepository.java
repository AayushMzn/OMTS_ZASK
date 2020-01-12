package nccs.omts.repository;

import java.sql.*;
import java.util.*;
import nccs.omts.*;
import nccs.omts.model.*;

public class GenreRepository {
	public List<Genre> getGenre() throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from genre");
		List<Genre> genre=new ArrayList<>();
		
		while (rs.next()) {
			Genre genres = new Genre(rs.getInt(1),rs.getString(2));
			genre.add(genres);
		}
		return genre;
	}
        public void addToGenre(String genre_name)throws SQLException{
		Connection connection=DBconnection.getConnection();
		Statement statement=connection.createStatement();
		statement.executeUpdate("INSERT INTO customers(genre_name) values('"+genre_name+"');");
	}

}
