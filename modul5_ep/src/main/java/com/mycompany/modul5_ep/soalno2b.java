package com.mycompany.modul5_ep;

import java.util.Scanner;

public class soalno2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String golongan;
        int masaKerja;
        
        System.out.print("Masa Kerja = ");
        masaKerja = in.nextInt();
        System.out.print("Golongan = ");
        golongan = in.next();
        
        if(golongan.equalsIgnoreCase( "I")){
            if (masaKerja >= 0 && masaKerja <= 10) {
                System.out.println("Bonus Anda adalah 50%");
            } else if (masaKerja >= 11 && masaKerja <= 20) {
                System.out.println("Bonus Anda adalah 60%");
            } else if (masaKerja >= 21 && masaKerja <= 30) {
                System.out.println("Bonus Anda adalah 70%");
            }
        }
        
        if (golongan.equalsIgnoreCase("II")) {
            if (masaKerja >= 0 && masaKerja <= 10) {
                System.out.println("Bonus Anda adalah 60%");
            }else if (masaKerja >= 11 && masaKerja <= 20) {
                System.out.println("Bonus Anda adalah 70%");
            } else if (masaKerja >= 21 && masaKerja <= 30) {
                System.out.println("Bonus Anda adalah 80%");
            }
        }
        
        if (golongan.equalsIgnoreCase("III")) {
            if (masaKerja >= 0 && masaKerja <= 10) {
                System.out.println("Bonus Anda adalah 70%");
            }else if (masaKerja >= 11 && masaKerja <= 20) {
                System.out.println("Bonus Anda adalah 80%");
            } else if (masaKerja >= 21 && masaKerja <= 30) {
                System.out.println("Bonus Anda adalah 90%");
            }
        }
        
        if (golongan.equalsIgnoreCase("IV")) {
            if (masaKerja >= 0 && masaKerja <= 10) {
                System.out.println("Bonus Anda adalah 80%");
            }else if (masaKerja >= 11 && masaKerja <= 20) {
                System.out.println("Bonus Anda adalah 90%");
            } else if (masaKerja >= 21 && masaKerja <= 30) {
                System.out.println("Bonus Anda adalah 100%");
            }
        }
    }   
}
            
