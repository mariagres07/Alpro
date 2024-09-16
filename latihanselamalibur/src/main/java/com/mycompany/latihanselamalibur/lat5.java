package com.mycompany.latihanselamalibur;

import java.util.Scanner;

public class lat5 {

    public static void main(String[] args) {
        int pilih = 0;
        int a = 5;
        int b = 7;
        int c = 3;
        int harga;
        int ulang = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Nama  = ");
        String nama = in.next();
        System.out.print("email = ");
        String email = in.next();
        System.out.print("no hp = ");
        String hp = in.next();
        int d = 0;

        do {

            do {
                System.out.println("--- Daftar produk ---");
                System.out.println("1. Cheetos  Rp2.000,00");
                System.out.println("2. Piattos  Rp4.000,00");
                System.out.println("3. Ale-ale  Rp1.000,00");

                System.out.print("Masukkan pilihan (dalam angka) = ");
                pilih = in.nextInt();

                switch (pilih) {
                    case 1:
                        ulang = 0;
                        harga = 2000;
                        break;
                    case 2:
                        ulang = 0;
                        harga = 4000;
                        break;
                    case 3:
                        ulang = 0;
                        harga = 1000;
                        break;
                    default:
                        throw new AssertionError();
                }
            } while (ulang == 1);
            d = 0;
            System.out.print("Jumlah = ");
            int jumlah = in.nextInt();
            switch (pilih) {
                case 1:
                    if (a > 0) {
                        a -= jumlah;
                    } else {
                        System.out.println("Habis");
                        jumlah = 0;
                    }
                    break;
                case 2:
                    if (b > 0) {
                        b -= jumlah;
                    } else {
                        System.out.println("Habis");
                        jumlah = 0;
                    }
                    break;
                case 3:
                    if (c > 0) {
                        c -= jumlah;
                    } else {
                        System.out.println("Habis");
                        jumlah = 0;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println();
            System.out.println("Apakah Anda ingin membeli lagi? ");
            System.out.println("0. Tidak");
            System.out.println("1. Ya");
            System.out.print("Masukkan pilihan = ");
            pilih = in.nextInt();
            double hargatot = jumlah * harga;
            System.out.println("Harga total = " + hargatot);
        } while (d == 1);
        
    }
    
}
