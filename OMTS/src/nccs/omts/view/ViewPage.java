/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nccs.omts.view;

import java.sql.SQLException;
import java.util.*;
import nccs.omts.control.CustomersController;

/**
 *
 * @author N0_M3rcE
 */
public class ViewPage {
    int choice;
    
    CustomersController customerController = new CustomersController();
    
    
    public boolean logIn() throws SQLException {
        Scanner s=new Scanner(System.in);
        String usr,pwd;
        System.out.println("****Login to your account****");
        System.out.print("\n\nUsername:");
        usr=s.nextLine();
        System.out.print("\nPassword:");
        pwd=s.nextLine();
        
        return customerController.login(usr,pwd);
    }
        
    public boolean bookticket() throws SQLException{
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.print("****Login page****\n1. Sign in\n2. Create an account\n3. Go back\n\n");
            System.out.println("enter a choice");
            choice=s.nextInt();
            switch(choice){
                case 1:{
                    return logIn();
                }
            
                case 2:{
                    customerController.addTOcos();
                    break;
                }
                
                case 3:{
                    firstPage();
                    break;
                }
                
                default:{
                    System.out.print("Invalid Choice");
                }
            }
        }
        
    }
    
    public void firstPage() throws SQLException{
        Scanner s=new Scanner(System.in);
        ClientView cv = new ClientView();
        while(true){
            
            System.out.println("********* Welcome to *********\nOnline Movie Ticketting System\n\n\n");
        
            System.out.println("What would you like to do\n1. Airing Movies\n2. Hall\n3.  Exit OMTS");
            System.out.print("\nEnter your choice:");
            
            choice=s.nextInt();
            switch(choice){
                
                case 1:{
                    cv.moviePage();
                    break;
                }
                
                case 2:{
                    cv.hallPage();
                    break;
                }
                
               
                case 3:{
                    System.exit(0);
                }
                
                
                default:
                    System.out.print("Invalid Pick");
                    
                    
            }
            
        }
    }
}
