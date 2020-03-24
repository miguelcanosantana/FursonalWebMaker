
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
      
      //Write document to index.html
      BufferedWriter bwrHtml = new BufferedWriter(new FileWriter("index.html"));
      
      int lineCounter = 1;
      String readText;
      
      //Variables
      String img = null;
      String name = null;
      String surname = null;
      String species = null;
      String habitat = null;
      String contact = null;
      
      
      //Print lines of text until no more the 12, so while ends.
        while (lineCounter <= 12) {
          readText = brd.readLine();
          //System.out.println(readText);
          
          switch(readText) {
            
            case "|||img_url":
              //Gets line after |||img_url data
              img = Files.readAllLines(Paths.get("parameters.txt")).get(lineCounter);
              //System.out.println(img);
              
            break;
            
            case "|||name":
              //Gets line after |||name data
              name = Files.readAllLines(Paths.get("parameters.txt")).get(lineCounter);
              //System.out.println(name);
              
            break;
            
            case "|||surname":
              //Gets line after |||surname data
              surname = Files.readAllLines(Paths.get("parameters.txt")).get(lineCounter);
              //System.out.println(surname);
              
            break;
            
            case "|||species":
              //Gets line after |||species data
              species = Files.readAllLines(Paths.get("parameters.txt")).get(lineCounter);
              //System.out.println(species);  
              
            break;
            
            case "|||habitat":
              //Gets line after |||habitat data
              habitat = Files.readAllLines(Paths.get("parameters.txt")).get(lineCounter);
              //System.out.println(habitat);
              
            break;
            
            case "|||contact":
              //Gets line after |||contact data
              contact = Files.readAllLines(Paths.get("parameters.txt")).get(lineCounter);
              //System.out.println(contact);
              
            break;
            
              
          }
          
          lineCounter++;
          
        } 
        
      System.out.println("Your file is ready, check \"index.html\". ");
        

      //Write HTML
      String htmlWebCode;

      htmlWebCode = 
      "<!DOCTYPE html>\n" +
      "<html lang=\"en\">\n" +
      "<head>\n" +
      "  <meta charset=\"UTF-8\">\n" +
      "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
      "  <title>" + name + "</title>\n" +
      "\n" +
      "  <!-- Bootstrap -->\n" +
      "  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n" +
      "\n" +
      "  <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n" +
      "  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
      "  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n" +
      "\n" +
      "\n" +
      "  <!-- Custom -->\n" +
      "  <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
      "  <link rel=\"shortcut icon\" href=\"" + img + "\" type=\"image/x-icon\">\n" +
      "\n" +
      "\n" +
      "</head>\n" +
      "<body>\n" +
      "\n" +
      "  <div class=\"container\">\n" +
      "    <div class=\"row justify-content-md-center\">\n" +
      "      <div class=\"col-12 col-md-8 col-lg-6\">\n" +
      "        <div class=\"jumbotron\">\n" +
      "          <br>\n" +
      "          <div class=\"row justify-content-center\">\n" +
      "            <img src=\"" + img + "\" class=\"img-fluid rounded-circle alt=\"Responsive image\">\n" +
      "          </div>\n" +
      "          <br>\n" +
      "          \n" +
      "          <h1 class=\"display-4\">" + name + "</h1>\n" +
      "          <hr class=\"my-4\">\n" +
      "          <p class=\"lead\">This is " + name + " " + surname + ", a nice " + species + " that comes from the " + habitat + ".</p>\n" +
      "          <hr class=\"my-4\">\n" +
      "          <p>Contact at " + contact + "</p>\n" +
      "        </div>\n" +
      "      </div>\n" +
      "    </div>\n" +
      "  </div>\n" +
      "\n" +
      "</body>\n" +
      "</html>";
      
      
      
  
      
      bwrHtml.write(htmlWebCode);
      bwrHtml.close();
      brd.close();
      
      
      
    } catch (FileNotFoundException f) {
      System.out.println("File not found.");
      System.out.println("System error: " + f);
      
    } catch (IOException io) {
      System.out.println("Couldn't write.");
      System.out.println("System error: " + io);
      
    }
    
    
    
  }
 
  
}
