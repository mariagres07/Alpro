package com.mycompany.modul6_ep;

import java.util.Scanner;

public class soalno4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String ukuran;
        double harga_total = 0;
        int jumlah;
        
        System.out.print("Ukuran yang dipilih = ");
        ukuran = in.nextLine();      
        System.out.print("Jumlah pakaian yang dipilih = ");
        jumlah = in.nextInt();
        
        switch (ukuran.toUpperCase()) {
            case "S":
                harga_total = 30000 * jumlah;
                System.out.println("Harga total = " + harga_total);
                break;
            case "M":
                harga_total = 38000 * jumlah;
                System.out.println("Harga total = " + harga_total);
                break;
            case "L":
                harga_total = 45000 * jumlah;
                System.out.println("Harga total = " + harga_total);
                break;
            case  "XL":
                harga_total = 50000 * jumlah;
                System.out.println("Harga total = " + harga_total);
                break;
            case "XXL":
                harga_total = 60000 * jumlah;
                System.out.println("Harga total = " + harga_total);
                break;
            default: ukuran = "Invalid";
                break;
        }
    }
}
