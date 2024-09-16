package com.mycompany.modul3_ep;

import java.util.Scanner;

public class soalno4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double jarak;
        double harga_bensin_per_liter;
        double bensin_per_kilometer;
        double parkir;
        double tol;
        double biaya_per_hari;
        
        System.out.print("jarak = ");
        jarak = keyboard.nextDouble();
        
        System.out.print("harga bensin per liter = ");
        harga_bensin_per_liter = keyboard.nextDouble();
        
        System.out.print("rata-rata kebutuhan bensin per kilometer = ");
        bensin_per_kilometer = keyboard.nextDouble();
        
        System.out.print("biaya parkir = ");
        parkir = keyboard.nextDouble();
        
        System.out.print("biaya tol = ");
        tol = keyboard.nextDouble();
        
        System.out.println("");
        System.out.println("jarak = " + jarak);
        System.out.println("harga bensin per liter= " + harga_bensin_per_liter);
        System.out.println("bensin per kilometer = " + bensin_per_kilometer);
        System.out.println("parkir = " + parkir);
        System.out.println("tol = " + tol);
        
        biaya_per_hari = (jarak * bensin_per_kilometer * harga_bensin_per_liter) + parkir + tol;
        System.out.println("biaya per hari = " + biaya_per_hari);
    }
}
