package com.mycompany.modul4;

import java.util.Scanner;

public class soalno3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int tinggi;
      int berat;
      int berat_ideal;
      
       System.out.print("tinggi = ");
       tinggi = input.nextInt();
       System.out.print("berat = ");
       berat = input.nextInt();
       
       berat_ideal = tinggi - berat;
       System.out.println("berat ideal = " + berat_ideal);
       
       if ((90 <= berat_ideal) && (berat_ideal <= 110)) {
           System.out.println("ideal");
       } else if (berat_ideal < 90) {
           System.out.println("terlalu gemuk");
       } else {
            System.out.println("terlalu kurus");
        }
    }
}



