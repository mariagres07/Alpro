package com.mycompany.latihan;
 
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
       int x;
       int y; 
  
       System.out.print("x =");
       x = keyboard.nextInt();
       System.out.print("y = ");
       y = keyboard.nextInt();
       
       if (x > y) {
            System.out.println("x lebih besar dari y");
       } else {
           System.out.println("y lebih besar dari x");
       }  
    }
}
