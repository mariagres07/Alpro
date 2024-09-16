package com.mycompany.latihan;

import java.util.Scanner;

public class latihan3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hargaTotal, diskon1, diskon2, diskon3;
        int hari, jumlahBarangA, jumlahBarangB, jumlahBarangC;
        
        System.out.print("jumlah barang a = ");
        jumlahBarangA = in.nextInt();
        System.out.print("jumlah barang b = ");
        jumlahBarangB = in.nextInt();
        System.out.print("jumlah barang c = ");
        jumlahBarangC = in.nextInt();
        System.out.print("hari = ");
        hari = in.nextInt();
        
        if (hari == 1 || hari == 2 || hari == 3) {
            System.out.println("tidak ada diskon");
            hargaTotal = (10000* jumlahBarangA) + (15000* jumlahBarangB) + (20000 * jumlahBarangC);
            System.out.println("harga total = " + hargaTotal);
            
        } else if (hari == 4  || hari == 5) {
            diskon1 = 10000 - (10000 * 0.01);
            diskon2 = 15000 - (15000 * 0.01);
            diskon3 = 20000 - (20000 * 0.01);
            
            hargaTotal = (diskon1 * jumlahBarangA) + (diskon2 * jumlahBarangB) + (diskon3 * jumlahBarangC);
            System.out.println("harga total = " + hargaTotal);
                
        } else if (hari == 6 || hari == 7) {
            diskon1 = 10000 - (10000 * 0.02);
            diskon2 = 15000 - (15000 * 0.02);
            diskon3 = 20000 - (20000 * 0.02);
            
            hargaTotal = (diskon1 * jumlahBarangA) + (diskon2 * jumlahBarangB) + (diskon3 * jumlahBarangC);
            System.out.println("harga total = " + hargaTotal);        
        }        
    }
}
