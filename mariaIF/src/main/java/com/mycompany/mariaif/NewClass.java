package com.mycompany.mariaif;

import java.util.Scanner;

public class NewClass {

    static double n, x1, y1, x2, y2, x3, y3, luas, keliling, sisiA, sisiB, sisiC;

    public static void main(String[] args) {
        // TODO code application logic here
        bacaTitik();
        hitungJarak();
        hitungKeliling();
        hitungLuas();
    }

    static void bacaTitik() {
        Scanner input = new Scanner(System.in);
        System.out.println("Absis dan Ordinat titik pertama");
        System.out.print("Masukkan absis (x) ke-1  : ");
        x1 = input.nextDouble();
        System.out.print("Masukkan ordinat (y) ke-1 : ");
        y1 = input.nextDouble();
        System.out.println();
        System.out.println("Absis dan Ordinat titik kedua");
        System.out.print("Masukkan absis (x) ke-2  : ");
        x2 = input.nextDouble();
        System.out.print("Masukkan ordinat (y) ke-2 : ");
        y2 = input.nextDouble();
        System.out.print("Masukkan absis (x) ke-3  : ");
        x3 = input.nextDouble();
        System.out.print("Masukkan ordinat (y) ke-3 : ");
        y3 = input.nextDouble();
        System.out.println();
    }

    static void hitungJarak() {
        sisiA = jarak(x1, x2, y1, y2);
        System.out.println("Jarak antara titik 1 dan 2 adalah " + sisiA);
        sisiB = jarak(x2, x3, y2, y3);
        System.out.println("Jarak antara titik 2 dan 3 adalah " + sisiB);
        sisiC = jarak(x3, x1, y3, y1);
        System.out.println("Jarak antara titik 1 dan 3 adalah " + sisiC);
        System.out.println();
    }

    static double jarak(double x1, double x2, double y1, double y2) {
        double sisi = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return sisi;
    }

    static void hitungKeliling() {
        keliling = (sisiA + sisiB + sisiC);
        System.out.println("keliling segitiga sembarang adalah : " + keliling);
    }

    static void hitungLuas() {
        double s = (keliling / 2);
        double L = Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
        System.out.println("Jadi,luas segitiga sembarang adalah : " + luas);
    }
}


    
