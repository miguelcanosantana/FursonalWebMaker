
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Scanner;

public class FursonalWebMaker {
  public static void main(String[] args) {
    
    
    
    
    try {
      
      //Read from parameters.txt
      BufferedReader brd = new BufferedReader(new FileReader("parameters.txt"));
      
      int lineCounter = 1;
      String readText;
      
      //Print lines of text until no more the 12, so while ends.
        while (lineCounter <= 12) {
          readText = brd.readLine();
          System.out.println(readText);
          
          switch(readText) {
            
            case "|||img_url":
              //Gets line after |||img_url data
              String img = Files.readAllLines(Paths.get("parameters.txt")).get(lineCounter);
              System.out.println(img);
              
            break;
            
            case "|||name":
              //Gets line after |||name data
              String name = Files.readAllLines(Paths.get("parameters.txt")).get(lineCounter);
              System.out.println(name);
              
            break;
            
            case "|||surname":
              //Gets line after |||surname data
              String surname = Files.readAllLines(Paths.get("parameters.txt")).get(lineCounter);
              System.out.println(surname);
              
            break;
            
            case "|||species":
              
            break;
            
            case "|||habitat":
              
            break;
            
            case "|||contact":
              
            break;
            
              
          }
          
          
          
          
          
          
          
          
          lineCounter++;
          
        } 
        
        brd.close();
      
      

      
      
      
      
      
      
      
      //Write document to index.html
      BufferedWriter bwrHtml = new BufferedWriter(new FileWriter("index.html"));
      
      //Write document to style
      BufferedWriter bwrCss = new BufferedWriter(new FileWriter("style.css"));
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    } catch (FileNotFoundException f) {
      System.out.println("File not found.");
      System.out.println("System error: " + f);
      
    } catch (IOException io) {
      System.out.println("Couldn't write.");
      System.out.println("System error: " + io);
      
    }
    
    
    
  }
 
  
}
