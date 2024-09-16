package com.mycompany.modulix;

import java.util.Scanner;

public class soalno1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kolom, baris;

        System.out.print("Kolom = ");
        kolom = in.nextInt();
        
        System.out.print("Baris = ");
        baris = in.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                if (i == j) {
                    System.out.print("1"); 
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
