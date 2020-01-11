package nccs.omts.control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import nccs.omts.repository.*;
import nccs.omts.model.*;

	
public class CustomersController {
	    
    private Customers currentUser = null;
    
    public Customers getCurrentUser() {
        return currentUser;
    }
    public boolean login(String email) throws SQLException {
       
        CustomerRepository customerRepository = new CustomerRepository();
        List<Customers> customers = customerRepository.getCustomer();
        
        for ( Customers customer: customers) {
            if ( customer.getEmail().equals(email)) {
                currentUser = customer;
                
            }
            else{
                System.out.println("invalid email!!!");
            }
        }
        return currentUser != null;
    }
    public void addTOcos() throws SQLException{
        Scanner s= new Scanner(System.in);
        CustomerRepository customerRepository = new CustomerRepository();
        
        System.out.println("Enter your info:");
        System.out.println("Name:");
        String customer_name=s.nextLine();
        System.out.println("Email:");
        String email=s.nextLine();
        System.out.println("Phone no:");
        String phone_num=s.nextLine();
        
        customerRepository.addToCustomer(customer_name,email,phone_num);
    }
}
