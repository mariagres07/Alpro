package com.mycompany.modulx;

import java.util.Scanner;

public class soalno4 {

    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Masukkan nilai n dalam rentang data 30 - 60");
        System.out.println();
        
        do {
            System.out.print("Nilai n = ");
            n = in.nextInt();
        } while (n < 30 || n > 60);
        for (double x = -4; x <= 4; x = x + 0.5) {
            int jumlahBintang = normal(n, x);
            bintang(jumlahBintang);
        }
        System.out.println();
    }

    static int normal(int n, double x) {
        double e = 2.71828;
        double fungsi = (1.0 / Math.sqrt(2 * 3.14)) * Math.pow(e, -((x * x) / 2.0));
        return (int) Math.round(n * fungsi);
    }

    static void bintang(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print("*");

        }
        System.out.println();
    }
}
