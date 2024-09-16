package com.mycompany.modul3_ep;

import java.util.Scanner;

public class soalno2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double kenaikan;
        int tahun;
        int penduduk2021;
        double penduduk;
        
        penduduk2021 = 271349889;
        kenaikan = 0.011;
        
        System.out.print("tahun = ");
        tahun = keyboard.nextInt();
        
        penduduk = penduduk2021 * Math.pow(1 + kenaikan, tahun - 2021);
        System.out.println("penduduk = " + (int) penduduk);
    }
}
