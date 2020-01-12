package nccs.omts.view;

import java.sql.*;
import java.util.*;
import nccs.omts.control.*;
import nccs.omts.repository.*;
import nccs.omts.model.*;


/**
 *
 * @author specter
 */
public class ClientView {

    CustomersController customerController = new CustomersController();
    BookingController bookingController=new BookingController();
    ViewPage vp=new ViewPage();
    
    public void movie() throws SQLException {
       
        List<Movies> movie = MoviesRepository.getMovies();

        System.out.println("Movie ID : Movie Name");
        for (Movies movies : movie) {
            System.out.println(movies.getMovie_id() + "\t" + movies.getMovie_name());
        }

    }
    

    public void user(int a) throws SQLException {
        
        List<UserView> view = UserViewRepository.getViewPage(a);
        
        System.out.println("Date \t|\tShow id \t|\t movie name        \t|\t  hall name \t|\t shift     \t|\t price \t|\t seat left");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        for (UserView u : view) {
            System.out.println(u.getDate()+"\t|\t"+u.getShow_id()+"\t|\t"+u.getMovie_name()+"\t|\t"+u.getHall_name()+"     \t|\t"+u.getShift_time()+"\t|\t"+u.getPrice()+"\t|\t"+u.getTickets_num());
        }
    }
    public void userhall(int a) throws SQLException {
        
        List<UserView> view = UserViewRepository.getViewhall(a);
        
        System.out.println("Date \t|\tShow id \t|\t movie name        \t|\t  hall name \t|\t shift     \t|\t price \t|\t seat left");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        for (UserView u : view) {
            System.out.println(u.getDate()+"\t|\t"+u.getShow_id()+"\t|\t"+u.getMovie_name()+"\t|\t"+u.getHall_name()+"     \t|\t"+u.getShift_time()+"\t|\t"+u.getPrice()+"\t|\t"+u.getTickets_num());
        }
    }
    public void movie(int id) throws SQLException {
        List<Movies> movie = MoviesRepository.getMoviesById(id);
    
        System.out.println("\n\n\nMovie description:");
        System.out.println("---------------------------------------------------");
        for (Movies m : movie) {
            System.out.println("Movie:\t\t"+m.getMovie_name());
            System.out.println("Genre:\t\t"+m.getGenre_id());
            System.out.println("Length:\t\t"+m.getLength()+" min");
            System.out.println("Director:\t"+m.getDirector());
            System.out.println("Casts:\t\t"+m.getCast());
            System.out.println("Rating:\t\t"+m.getRating());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
    }
    
    public void moviePage() throws SQLException {
    
       
        System.out.println("\n\nWelcome ");
        Scanner scanner = new Scanner(System.in);

        int moviesId,showId;
        char book;
        do {
            movie();

            System.out.print("Select a movie or 0 to exit :");
            moviesId = scanner.nextInt();

            if (moviesId == 0) {
                return;
            }
            else{
                movie(moviesId);
                user(moviesId);
                System.out.print("Select a show or press 0 to return:");
                showId = scanner.nextInt();
                if (showId==0) {
                    return;
                }
                else{
                    System.out.println("Do you want to book this show?(y/n)");
                    book = scanner. next().charAt(0);
                    if(book=='y'||book=='Y'){
                        if (showId != 0) {
                            
                            
                            bookingController.addToBook(showId,moviesId,customerController.getCurrentUser());
                            System.out.println("Thank you for booking");  
                        }
                    }
                    else{
                        return;
                    }
                }
            }
        } while (true);
    }
    public void hallPage() throws SQLException {
       
        System.out.println("\nWelcome ");
        Scanner scanner = new Scanner(System.in);

        int showId,hallId;
        char book;
        do {
            hall();
            System.out.print("Select a movie or 0 to Return :");
            hallId = scanner.nextInt();
            
            

            if (hallId == 0) {
                return;
            }
            else{
                
                userhall(hallId);
                System.out.print("Select a show or press 0 to return:");
                showId = scanner.nextInt();
                if (showId==0) {
                    return;
                }
                else{
                    
                        System.out.println("Do you want to book this show?(y/n)");
                        book = scanner. next().charAt(0);
                        if(book=='y'||book=='Y'){
                            if (showId != 0) {
                                
                            
                                bookingController.addToBook(showId,hallId,customerController.getCurrentUser());
                                System.out.println("Thank you for booking");  
                            }
                        }
                        else{
                            return;
                        }
                    
                }
            }
        } while (true);
    }
    
    public void hall() throws SQLException{
        List<Hall> hall = HallRepository.getHall();

        System.out.println("Hall ID : Hall Name");
        for (Hall halls : hall) {
            System.out.println(halls.getHall_id()+ "\t" + halls.getHall_name());
        }
    }
 
    
   
}
