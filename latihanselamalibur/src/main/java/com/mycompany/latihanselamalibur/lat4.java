package com.mycompany.latihanselamalibur;

import java.util.Scanner;

public class lat4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pilih = 0;
        do {

            System.out.println("-----Daftar jajanan---");
            System.out.println("1. Cheetos  Rp2.000,00");
            System.out.println("2. Piatos   Rp4.000,00");
            System.out.println("3. Ale-ale  Rp1.000,00");
            System.out.print("Masukkan pilihan (dalam angka) = ");
            pilih = in.nextInt();
        } while (pilih < 1 && pilih > 3);

        if (pilih == 1) {
            System.out.println();
            System.out.print("Jumlah = ");
            int jumlah = in.nextInt();
            int harga = 2000;
            double hargatot = jumlah * harga;

        }
        if (pilih == 2) {
            System.out.println();
            System.out.print("Jumlah = ");
            int jumlah = in.nextInt();
            int harga = 4000;
            double hargatot = jumlah * harga;

        }
        if (pilih == 3) {
            System.out.println();
            System.out.print("Jumlah = ");
            int jumlah = in.nextInt();
            int harga = 1000;
            double hargatot = jumlah * harga;

        }
        System.out.println();
        System.out.println("Apakah Anda ingin membeli lagi?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan pilihan = ");
        if (pilih == 1) {
            do {

                System.out.println("-----Daftar jajanan---");
                System.out.println("1. Cheetos  Rp2.000,00");
                System.out.println("2. Piatos   Rp4.000,00");
                System.out.println("3. Ale-ale  Rp1.000,00");
                System.out.print("jajanan yang ingin dibeli (dalam angka) = ");
                pilih = in.nextInt();
            } while (pilih < 1 && pilih > 3);

            if (pilih == 1) {
                System.out.print("Jumlah = ");
                int jumlah = in.nextInt();
                int harga = 2000;
                double hargatot = jumlah * harga;

            }
            if (pilih == 2) {
                System.out.print("Jumlah = ");
                int jumlah = in.nextInt();
                int harga = 4000;
                double hargatot = jumlah * harga;

            }
            if (pilih == 3) {
                System.out.print("Jumlah = ");
                int jumlah = in.nextInt();
                int harga = 1000;
                double hargatot = jumlah * harga;

            } else {
                System.out.println("Biaya keseluruhan = ");
            }
        }
    }
}
