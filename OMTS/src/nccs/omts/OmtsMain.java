package nccs.omts;

import java.sql.SQLException;

import nccs.omts.repository.*;

public class OmtsMain {

	public static void main(String[] args) throws SQLException {
			DBconnection.getConnection();
	}

}