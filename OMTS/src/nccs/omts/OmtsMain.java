package nccs.omts;

import java.sql.*;
import nccs.omts.repository.*;
import nccs.omts.view.ClientView;

public class OmtsMain {

	  public static void main(String[] args) throws Exception {

	        ClientView clientView = new ClientView();
	        if (clientView.logIn()) {
	            clientView.mainPage();
	        }
	  }

}
