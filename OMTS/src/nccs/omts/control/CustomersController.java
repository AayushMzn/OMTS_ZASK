package nccs.omts.control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
}
