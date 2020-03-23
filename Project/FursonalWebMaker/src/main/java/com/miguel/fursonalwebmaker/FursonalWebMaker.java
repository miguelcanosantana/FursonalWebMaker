package com.miguel.fursonalwebmaker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FursonalWebMaker {
  public static void main(String[] args) {
    
    
    
    
    try {
      
      //Reading part
      
      
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
