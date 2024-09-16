package com.mycompany.latihan;

import java.util.Scanner;

public class latihan5 {
    public static void main(String[] args) { 
        double deposito, bunga;
        
        Scanner dataBank = new Scanner(System.in);
        
        System.out.print("masukkan jumlah data = ");
        deposito = dataBank.nextDouble();
        
        if (deposito >= 50000000) {
            bunga = 0.01 * deposito;
        }
        else {
            bunga = 0.0075 * deposito;
        }
        System.out.println("bunga deposito anda per bulan adalah Rp" + bunga);
    }
}
