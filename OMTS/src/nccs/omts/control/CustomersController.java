package nccs.omts.control;

import java.sql.SQLException;
import java.util.*;
import nccs.omts.repository.*;
import nccs.omts.model.*;

	
public class CustomersController {
	    
    private Customers currentUser = null;
    
    public Customers getCurrentUser() {
        return currentUser;
    }
    public boolean login(String email,String pass) throws SQLException {
       
        CustomerRepository customerRepository = new CustomerRepository();
        List<Customers> customers = customerRepository.getCustomer();
        
        for ( Customers customer: customers) {
            if ( customer.getEmail_id().equals(email)&&customer.getPassword().equals(pass)) {
                currentUser = customer;
                System.out.println("****************");
                System.out.println("*  your id : "+customer.getCustomer_id()+"*");
                System.out.println("****************");
                        
            }
            else{
                System.out.println("invalid email!!!");
            }
        }
        return currentUser != null;
    }
    public void addTOcos() throws SQLException{
        CustomerRepository customerRepository = new CustomerRepository();
        Scanner s=new Scanner(System.in);
        
        String first_name,last_name,email_id,password;
                long phone_num = 0; 
                    int length=0,flag=0;
                    
                    System.out.println("****Create a new account****");
                    System.out.print("\n\nFirst name:");
                    first_name=s.nextLine();
                    System.out.print("\nLast name:");
                    last_name=s.nextLine();
                    System.out.print("\nEmail-ID:");
                    email_id=s.nextLine();
                    System.out.print("\nNew Password:");
                    password=s.nextLine();
                    
                    while(flag==0){
                        System.out.print("\nPhone number:");
                        phone_num=s.nextLong();
                        long n=phone_num;
                        while(n!=0){
                            
                            n=n/10;
                            length++;
                            
                        }
                        if(length!=10&&length!=7){
                            System.out.print("Contact Invalid");
                        }
                        else{
                            flag=1;
                        }	
                    }
        customerRepository.addToCustomer(first_name,last_name,phone_num,email_id,password);
        System.out.println("one account added.");
    }
    /*public Customers com() throws SQLException {
    
    CustomerRepository customerRepository = new CustomerRepository();
    List<Customers> customers = customerRepository.getCustomer();
    
    for ( Customers customer: customers) {
    if ( customer.getEmail_id().equals(email)&&customer.getPassword().equals(pass)) {
    currentUser = customer;
    return customer;
    }
    else{
    System.out.println("invalid email!!!");
    }
    }
    return null;
    
    }*/
}
