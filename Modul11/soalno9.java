package com.mycompany.modulxi;

import java.util.Scanner;

public class soalno9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int elemen, b, i;

        System.out.print("Banyak elemen =  ");
        elemen = in.nextInt();
        System.out.println();

        int[] nilai = new int[elemen];

        for (i = 0; i < elemen; i++) {
            System.out.print("Elemen ke-" + (i + 1) + " = ");
            nilai[i] = in.nextInt();
        }
        for (i = 0; i < (elemen - 1); i++) {
            for (int j = 0; j < elemen - i - 1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    b = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = b;
                }
            }
        }
        System.out.println();
        System.out.print("Hasil pengurutan =  ");
        for (i = 0; i < elemen; i++) {
            System.out.print(nilai[i] + " ");
        }
    }
}


