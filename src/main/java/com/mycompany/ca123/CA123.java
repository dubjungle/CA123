/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca123;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CA123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(new FileReader("Students123.txt"));
             FileWriter statusFile = new FileWriter("stats.txt");
             PrintWriter statusPrint = new PrintWriter (statusFile);
             
             
            String workload = null;
            
            String firstName;

            String lastName;
            
            int numberOfClasses;
            
            String studentNumber;
            
            String[] eachLine = new String[3];
            
            for (int i = 1; sc.hasNextLine(); i++) {
               
                for (int j = 0; j <= 2; j++) {
                eachLine[j] = sc.nextLine();
           
                    if(j==2){  
                    
                    String[] splitNames = eachLine[0].split(" ");
                    
                    firstName = splitNames[0];
                    lastName = splitNames[1];
                   numberOfClasses = Integer.parseInt(eachLine[1]);
                   studentNumber = eachLine[2];
                   
                    
                    

                    System.out.println( firstName + " " + lastName);
                       
                       switch (numberOfClasses) {
                            case 1:
                                workload = "Very Light";
                                break;
                            case 2:
                                workload = "Light";
                                break;
                            case 3:
                                workload = "Part Time";
                                break;
                            case 4:
                                workload = "Part Time";
                                break;
                            case 5:
                                workload = "Part Time";
                                break;
                            case 6:
                                workload = "Full Time";
                                break;
                            case 7:
                                workload = "Full Time";
                                break;
                            case 8:
                                workload = "Full Time";
                                
                        }
                     
                        if (orgcurrency.matches("[0-9]+") || orgcurrency.length() !=3 ){
                System.out.println("Error: must be 3 letters ");
            }
            else if (dest.matches("[0-9]+") || dest.length() !=3 || dest.equals(orgcurrency)) {

                System.out.println("Error: it's supposed to have 3 letters and can't be the same "); // fix
            }

            else if (numberOfClasses < 1 && numberOfClasses > 8) {
                System.out.println(" Error : It's have to be between 1 - 8 " );
                
                
            }
            else if (position1 == -1 ) {
                System.out.println("Error: '-' Cannot be found ");
            }
            else if (amount.matches("[a-zA-Z]+")){
                System.out.println(" Error: Must be number");
            }

            else if (!symb.contains("O") && (!symb.contains("R")) ){
                System.out.println( "Error: must have O or R " );
            }
            else {  statusFile.write(studentNumber + " - " + lastName + "\n");
                       statusFile.write(workload + "\n");
            }
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                           if (firstName.matches(".*\\d.*")) {
                        System.out.println("Error: First name can only contain letters.");
                    }
                    
                    
               
                        
                        
                     
                        if(studentNumber.matches("\\d{2}[A-Za-z]{3}\\d*")){
                            
                            System.out.println(studentNumber);}
                        
                        else {System.out.println("Invalid student format:");
                            
                        }
                       
                        
                       
                      
                      
                    
                        
                        
                
                    
                    
                        
//                    if (firstName.matches(".*\\d.*")) {
//                System.out.println("Error: First name can only contain letters.");
//            }
//                     if (numberOfClasses >= 1 && numberOfClasses <= 8)  {
//                        System.out.println("Error: Number of classes supposed to be between 1-8");}
//                    
//            
                }
        
            }
               
            }
              statusPrint.close();
              statusFile.close();
                           
            
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
    
    
        

    

