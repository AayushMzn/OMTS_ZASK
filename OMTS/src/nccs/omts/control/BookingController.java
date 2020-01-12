package nccs.omts.control;

import java.sql.SQLException;

import java.util.*;
import nccs.omts.model.*;
import nccs.omts.repository.*;
import nccs.omts.control.*;

public class BookingController {
	
    List<Booking> selectedMovie = new ArrayList<>();
    
    public boolean addToBook(int showId,int movieId,Customers customer) throws SQLException {
        //1List<Customers> customers = CustomerRepository.getCustomer();
    	Shows show = ShowRepository.getShow(showId);
        Scanner s= new Scanner(System.in);
        System.out.println(show.getDate());
    	Movies movie = MoviesRepository.getMovie(movieId);
        System.out.println("enter your id:");
        int id =s.nextInt();
        
        if (movie != null) {
            
            BookingRepository.addToBooking(show.getShow_id(),id,show.getDate(),1);
            return true;
        }
        else{
            return false;
        }
    }
    
}
