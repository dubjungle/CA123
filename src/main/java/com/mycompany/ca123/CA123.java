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
    
    
    public static void main(String args[]){
        try { //  FileReader reading text from the students.txt file
              // FileWriter writing data wich one is correct. For this project.  
            Scanner sc = new Scanner(new FileReader("Students.txt"));
             FileWriter statusFile = new FileWriter("stats.txt");
             
            
             
            String workload = null;
            
            // This variable stores the firstName of students.
            String firstName;
            // This name variable stores the lastName of students.
            String lastName;
            //This variable holds the number of classes a student is enrolling in
            int numberOfClasses;
            //This variable stores the student number.
            String studentNumber;
            
            // This line declares and initiliazes an array string wich is named eachLine and size of it is 3.
            String[] eachLine = new String[3];
            
            // this loop continuos as long as there another line available.
            for (int i = 1; sc.hasNextLine(); i++) {
                
                
               // This loop iterates three times (j starts from 0 and goes up to 2).
                for (int j = 0; j <= 2; j++) {
                eachLine[j] = sc.nextLine();
                
                // check or j it's equals to 2.
                    if(j==2){  
                        
                    // Split the first line of input (eachLine[0]) using space as the delimiter.
                    String[] splitNames = eachLine[0].split(" ");
                    // Extracting the first and Last names from the splitNames array.
                    firstName = splitNames[0];
                    lastName = splitNames[1];
                    // Parse the second line of eachLine[1] as a integer to get number of classes
                   numberOfClasses = Integer.parseInt(eachLine[1]);
                   //this line is directly assigned to the studentNumber.
                   studentNumber = eachLine[2];
                   
                    
                    // Print the full name
                    // Print the numbers of classes stored in "numberOfClasses" variable.
                    // Print the student numbers stored in "studentNumber" variable.
                    

                    System.out.println( firstName + " " + lastName);
                        System.out.println(numberOfClasses);
                       System.out.println(studentNumber);
                       
                       //Switch statment based on the numberOfClasses variable
                      // It assigns a workload category to the 'workload' variable based on the number of classes.

                       
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
                     // Check if the 'firstName' contains only letters using a regular expression.
                     // The regular expression [a-zA-Z]+ ensures that the string consists of one or more letters.
                     
                        if (!firstName.matches("[a-zA-Z]+")) {
                System.out.println("Error: first name must be only letters  "
                );     // If the condition is true print an error message indicating that the first name

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
    
    
        

    

