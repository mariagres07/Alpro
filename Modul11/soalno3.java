package com.mycompany.modulxi;

import java.util.Scanner;

public class soalno3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] skor;
        int[] cadangan;
        skor = new int[5];
        cadangan = new int[5];
       
        System.out.println("Masukkan 5 data bulat");

        for (int i = 0; i < 5; i++) {
            System.out.print("Data ke-" + (i + 1) + " =  ");
            skor[i] = in.nextInt();
        }
        for (int i = 0; i < skor.length; i++) {
            cadangan[i] = skor[i];
        }
        System.out.println();
        System.out.println("Skor  ");
        for (int i = 0; i < skor.length; i++) {
            System.out.println("Data ke-" + (i + 1) + " adalah " + skor[i]);
        }
        System.out.println();
        System.out.println("Cadangan ");
        for (int i = 0; i < cadangan.length; i++) {
            System.out.println("Data ke-" + (i + 1) + " adalah " + cadangan[i]);
        }
    }
}
