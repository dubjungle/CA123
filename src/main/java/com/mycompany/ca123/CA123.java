/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca123;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
                        System.out.println(numberOfClasses);
                       System.out.println(studentNumber);
                       
                       
                       
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
                     
                        if (!firstName.matches("[a-zA-Z]+")) {
                System.out.println("Error: first name must be only letters  ");
            }
            else if (lastName.matches("^[A-Za-z]+ [A-Za-z0-9]+$")) {
                System.out.println ("No symbols please ");
            }

            else if (numberOfClasses < 1 || numberOfClasses > 8) {
                System.out.println("Error: numbers of classes must be between 1 - 8" );
                
          }
            else if (studentNumber.length() < 6 ) {
                System.out.println("error: it must to be 6 charathers");
            }
            
              else if (!studentNumber.matches("^\\d{2}[A-Za-z]{2,5}\\d+$")) {
                  
              System.out.println("Error: The first two characters must be numbers.");
              
                    // ^\\d{2}: The first two characters must be digits.
                     //[A-Za-z]{2,5}: The next two to five characters must be letters (upper or lower case).
                      //\\d+$: Everything after the last letter character must be digits.
                        //                 
              
}
            
            
            else {  statusFile.write(studentNumber + " - " + lastName + "\n");
                       statusFile.write(workload + "\n");
            }
                       
              
                }
        
            }
               
            }

              statusFile.close();
                           
            
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
    
    
        

    

