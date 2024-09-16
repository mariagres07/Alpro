package com.mycompany.modulxi;

import java.util.Scanner;

public class soalno4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] skor;
        int total = 0, rataRata = 0, max = 0, min = 0;
        skor = new int[5];
        
        System.out.println("Masukkan 5 data bulat");

        for (int i = 0; i <= 4; i++) {
            System.out.print("Data ke " + (i + 1) + " = ");
            skor[i] = in.nextInt();
            total += skor[i];
            rataRata = total/skor.length;
            
        if (i == 0) {
                max = skor[i];
                min = skor[i];
            } else if (skor[i] > max) {
                max = skor[i];
            } else if (skor[i] < min) {
                min = skor[i];
            }
        }

        System.out.println();
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke " + (i + 1) + " adalah " + skor[4 - i]);
            
        }
        System.out.println();
            System.out.println("Rata-rata = " + rataRata);
            System.out.println("Max       = " + max);
            System.out.println("Min       = " + min);

    }
}
