package com.mycompany.modul4;

import java.util.Scanner;

public class soalno4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double harga_per_buah = 100000;
        double harga_barang;
        double harga;
        double jumlah_barang;
        double diskon;
        
        System.out.print("jumlah = ");
        jumlah_barang = keyboard.nextDouble();
        
        harga_barang = harga_per_buah * jumlah_barang;
        System.out.println("harga barang = " + harga_barang);
        
        diskon = harga_barang * 0.1;
        
        harga = harga_barang - diskon;
        
        if (harga_barang >= 1000000) {
            System.out.println("harga bersih = " + harga);
            System.out.println("besar diskon = " + diskon);
        } else {
            System.out.println("tidak dapat diskon");
        }
    }
}
