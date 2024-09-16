package com.mycompany.modulix;

import java.util.Scanner;

public class soalno2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int usia, warga;
        double a = 0, b = 0, c = 0, d = 0, e = 0;

        do {
            System.out.print("Banyak warga = ");
            warga = in.nextInt();
        } while (warga < 1);

        for (int i = 1; i <= warga; i++) {
            System.out.print("Usia warga ke-" + i + " : ");
            usia = in.nextInt();
            if (usia >= 0 && usia <= 20) {
                a++;
            } else if (usia >= 21 && usia <= 40) {
                b++;
            } else if (usia >= 41 && usia <= 60) {
                c++;
            } else if (usia >= 61 && usia <= 80) {
                d++;
            } else if (usia >= 81 && usia <= 100) {
                e++;
            }

        }
        System.out.println();
        
        System.out.print("0 - 20   = ");
        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("21 - 40  = ");
        for (int i = 1; i <= b; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("41 - 60  = ");
        for (int i = 1; i <= c; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("61 - 80  = ");
        for (int i = 1; i <= d; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("81 - 100 = ");
        for (int i = 1; i <= e; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
