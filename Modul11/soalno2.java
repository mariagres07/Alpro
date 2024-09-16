package com.mycompany.modulxi;

import java.util.Scanner;

public class soalno2 {

    public static void main(String[] args) {
        int[] skor;
        skor = new int[5];

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");

        for (int i = 0; i < 5; i++) {
            System.out.print("data ke " + (i + 1) + ":");
            skor[i] = in.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println("data ke " + (i + 1) + " adalah " + skor[4 - i]);
        }
    }

}
