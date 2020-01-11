/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nccs.omts.view;

import java.util.*;
/**
 *
 * @author N0_M3rcE
 */
public class ViewPage {
    int choice;
    Scanner s=new Scanner(System.in);
    
    void airedmovie(){
        
    }
    void mybooking(){
        
    }
        
    void bookticket(){
        String usr,pwd;
        while(true){
            System.out.print("Do you want to\n1. Sign in\n2. Create an account\n3. Go back");
            choice=s.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("****Login to your account****");
                    System.out.print("\n\nUsername:");
                    usr=s.nextLine();
                    System.out.print("\nPassword:");
                    pwd=s.nextLine();
                    
                    
                    break;
                }
            
                case 2:{
                    String first_name,last_name,email_id,password,password1,contact; 
                    int length,flag=0;
                    
                    System.out.println("****Create a new account****");
                    System.out.print("\n\nFirst name:");
                    first_name=s.nextLine();
                    System.out.print("\nLast name:");
                    last_name=s.nextLine();
                    System.out.print("\nEmail-ID:");
                    email_id=s.nextLine();
                    System.out.print("\nNew Password:");
                    password=s.nextLine();
                    System.out.print("\nEnter the password again:");
                    password1=s.nextLine();
                    System.out.print("/nPhone number:");
                    while(flag==0){
                        System.out.print("Phone number:");
                        contact=s.nextLine();
                        length=contact.length();
                        if(length!=10&&length!=7){
                            System.out.print("Contact Invalid");
                        }
                        else{
                            flag=1;
                        }	
                    }    
                    break;
                }
                
                case 3:{
                    FirstPage();
                    break;
                }
                
                default:{
                    System.out.print("Invalid Choice");
                }
            }
        }
        
    }
    
    void FirstPage(){
        while(true){
            
            System.out.println("********* Welcome to *********\nOnline Movie Ticketting System\n\n\n");
        
            System.out.println("What would you like to do\n1.Airing Movies\n2. My Booking\n3. Book a ticket \n4. Exit OMTS");
            System.out.print("\nEnter your choice:");
            
            choice=s.nextInt();
            switch(choice){
                
                case 1:{
                    airedmovie();
                    
                    break;
                }
                
                case 2:{
                    mybooking();
                    break;
                }
                
                case 3:{
                    bookticket();
                    break;
                }
                
                case 4:{
                    System.exit(0);
                    
                }
                
                default:
                    System.out.print("Invalid Pick");
                    
                    
            }
            
        }
    }
}
