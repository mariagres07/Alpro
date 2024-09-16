package com.mycompany.latihan;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int harga, ukuran, tipe;
        double diskon1, diskon2, diskon3, diskon4;
        
        System.out.print("tipe = ");
        tipe = in.nextInt();
        System.out.print("ukuran = ");
        ukuran = in.nextInt();
        System.out.print("harga = ");
        harga = in.nextInt();
        
        diskon1 = harga - (harga*0.05);
        diskon2 = harga - (harga*0.1);
        diskon3 = harga - (harga*0.12);
        diskon4 = harga - (harga*0.15);
        
        if (ukuran >= 0 && ukuran <= 14) {
            System.out.println("Harga akhir = " + diskon1);
        } else if (ukuran == 14) {
            System.out.println("harga akhir = "+ diskon2);
        } else if (ukuran == 32) {
            System.out.println("harga akhir = "+ diskon3);
        } else if (ukuran >= 40) {
            System.out.println("harga akhir = " + diskon4);
        }
    }
}
