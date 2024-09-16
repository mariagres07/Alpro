package Modul4;

import java.util.Scanner;

public class soalno1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double bilangan;
        
        System.out.print("bilangan = ");
        bilangan = keyboard.nextDouble();
        
        if (bilangan % 2 == 0) {
            System.out.println("bilangan genap");  
        } else {
            System.out.println("bilangan ganjil");
        }
        
    }
}

