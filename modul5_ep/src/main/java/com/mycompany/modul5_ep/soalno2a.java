package com.mycompany.modul5_ep;

import java.util.Scanner;

public class soalno2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String ukuran;
        double harga_total = 0;
        int jumlah;
        
        System.out.print("ukuran yang dipilih = ");
        ukuran = in.nextLine();
        System.out.print("jumlah pakaian yang dipilih = ");
        jumlah = in.nextInt();
        
        if (ukuran.equalsIgnoreCase("S")) {
           harga_total = 30000 * jumlah;
        }if (ukuran.equalsIgnoreCase("M")) {
           harga_total = 38000 * jumlah;
        }if (ukuran.equalsIgnoreCase("L")) {
           harga_total = 45000 * jumlah;
        }if (ukuran.equalsIgnoreCase("XL")) {
           harga_total = 50000 * jumlah;
        }if (ukuran.equalsIgnoreCase("XXL")) {
           harga_total = 60000 * jumlah;
        }
        
        System.out.println("harga total = " + harga_total);
    }
}
