package Modul3;

import java.util.Scanner;

public class soalno1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double IMT;
        double berat;
        double tinggi;
            
        System.out.print("berat = ");
        berat = keyboard.nextDouble();
        System.out.print("tinggi = ");
        tinggi = keyboard.nextDouble();
        
        IMT = berat / (tinggi * tinggi);
        System.out.println("IMT = " +  IMT);
    }
}
