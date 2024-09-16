package com.mycompany.modul6_ep;

import java.util.Scanner;

public class soalno5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int masaKerja;
        String golongan;

        System.out.print("Masa Kerja = ");
        masaKerja = in.nextInt();
        System.out.print("Golongan = ");
        golongan = in.next();

        switch (masaKerja) {
            case 1:
                if (masaKerja >= 0 && masaKerja <= 10) {
                    System.out.println("Bonus Anda adalah 50%");
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    System.out.println("Bonus Anda adalah 60%");
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    System.out.println("Bonus Anda adalah 70%");
                }
                break;

            case 2:
                if (masaKerja >= 0 && masaKerja <= 10) {
                    System.out.println("Bonus Anda adalah 60%");
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    System.out.println("Bonus Anda adalah 70%");
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    System.out.println("Bonus Anda adalah 80%");
                }
                break;

            case 3:
                if (masaKerja >= 0 && masaKerja <= 10) {
                    System.out.println("Bonus Anda adalah 70%");
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    System.out.println("Bonus Anda adalah 80%");
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    System.out.println("Bonus Anda adalah 90%");
                }
                break;

            case 4:
                if (masaKerja >= 0 && masaKerja <= 10) {
                    System.out.println("Bonus Anda adalah 80%");
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    System.out.println("Bonus Anda adalah 90%");
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    System.out.println("Bonus Anda adalah 100%");
                }
                break;
            default: System.out.println("Invalid");
                break;
        }
    }
}

