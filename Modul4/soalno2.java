package com.mycompany.modul4;

import java.util.Scanner;

public class soalno2 {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in); 
        
        double a;
        double b;
        
        System.out.print("bilangan 1 = ");
        a = keyboard.nextDouble();
        System.out.print("bilangan 2 = ");
        b = keyboard.nextDouble();
        
        if (a > b) {
            System.out.println("bilangan 1 lebih besar dari bilangan 2");
        } else if (a < b) {
            System.out.println("bilangan 2 lebih besar dari bilangan 1");
        } else {
            System.out.println("bilangan 1 sama dengan bilangan 2");
    }
    }
}

