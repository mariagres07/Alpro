package com.mycompany.modulx;

import java.util.Scanner;

public class soalno3 {

    static double x1, x2, x3, y1, y2, y3;
    static double jarak12, jarak13, jarak23;
    static double keliling, luas, s;

    public static void main(String[] args) {
        bacaTitik();
        
        System.out.println();
        
        jarak12 = hitungJarak(x1, y1, x2, y2);
        jarak13 = hitungJarak(x1, y1, x3, y3);
        jarak23 = hitungJarak(x2, y2, x3, y3);

        System.out.println("Sisi A = " + jarak12);
        System.out.println("Sisi B = " + jarak13);
        System.out.println("Sisi C = " + jarak23);
        System.out.println();
        
        hitungKeliling();
        
        System.out.println();
        
        hitungLuas();
    }

    static void bacaTitik() {
        Scanner in = new Scanner(System.in);

        System.out.print("x1 = ");
        x1 = in.nextInt();
        System.out.print("y1 = ");
        y1 = in.nextInt();
        System.out.print("x2 = ");
        x2 = in.nextInt();
        System.out.print("y2 = ");
        y2 = in.nextInt();
        System.out.print("x3 = ");
        x3 = in.nextInt();
        System.out.print("y3 = ");
        y3 = in.nextInt();
    }

    static double hitungJarak(double x1, double y1, double x2, double y2) {
        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
    }

    static void hitungKeliling() {
        keliling = jarak12 + jarak13 + jarak23;
        System.out.println("Keliling = " + keliling);
    }

    static void hitungLuas() {
        s = keliling / 2;

        luas = Math.sqrt(s - (jarak12) * (s - jarak13) * (s - jarak23));
        System.out.println("Luas = " + luas);
    }
}
