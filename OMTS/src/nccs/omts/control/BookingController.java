package nccs.omts.control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nccs.omts.model.*;
import nccs.omts.repository.*;


public class BookingController {
	
    List<Booking> selectedMovie = new ArrayList<>();
    
    public boolean addToBook(int showId,int movieId, Customers customer,int seat) throws SQLException {
    	Shows show = ShowRepository.getShow(showId);
  
    	Movies movie = MoviesRepository.getMovie(movieId);
    	
        if (movie != null && seat>0) {
            
            BookingRepository.addToBooking(show.getShow_id(), customer.getCustomer_id());
            return true;
        }
        else{
            return false;
        }
    }
}
