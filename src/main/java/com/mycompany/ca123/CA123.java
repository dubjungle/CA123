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
            Scanner br = new Scanner(new FileReader("Students123.txt"));
            
            
            String firstName;

            String lastName;
            
            int numberOfClasses;
            
            String studentNumber;
            
            String[] eachLine = new String[3];
            
            for (int i = 1; br.hasNextLine(); i++) {
               
                for (int j = 0; j <= 2; j++) {
                eachLine[j] = br.nextLine();
           
                    if(j==2){  
                    
                    String[] splitNames = eachLine[0].split(" ");
                    
                    firstName = splitNames[0];
                    lastName = splitNames[1];
                   numberOfClasses = Integer.parseInt(eachLine[1]);
                   studentNumber = eachLine[2];
                   
                    
                    

                    System.out.println( firstName + " " + lastName);
                       
                     
                           if (firstName.matches(".*\\d.*")) {
                        System.out.println("Error: First name can only contain letters.");
                    }
                    
                    
                        if   (numberOfClasses >= 1 && numberOfClasses <=8){
                            System.out.println(numberOfClasses);}
   
                   else {
                       System.out.println("Error: must be between 1-8 ");}
                        
                        
                     
                        if(studentNumber.matches("\\d{2}[A-Za-z]{3}\\d*")){
                            
                            System.out.println(studentNumber);}
                        
                        else {System.out.println("Invalid student format:");
                            
                        }
                       
                        
                        FileWriter statusFile = new FileWriter("stats.txt");
                        PrintWriter statusPrint = new PrintWriter (statusFile);
                        
                       statusFile.write(studentNumber + " - " + lastName);
                      
                    
                        
                        
                     statusPrint.close();
                      statusFile.close();
                        
                    
                    
                        
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
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
    
    
        

    

