package com.mycompany.modulvii;

import java.util.Scanner;

public class soalno4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int banyakData, data;
        int i = 1;
        int sum1 = 0, sum2 = 0;
        double deviasiStandard = 0;
        double variansi = 0, rataRata = 0;
        int max = 0, min = 0;

        System.out.print("Masukkan banyak data yang akan diolah = ");
        banyakData = in.nextInt();
        
        do {
            System.out.print("Masukkan data ke " + i + " = ");
            data = in.nextInt();

            sum1 += data;
            sum2 += (data * data);
            rataRata = sum1 / banyakData;
            variansi = (sum2 - (banyakData * (rataRata * rataRata))) / banyakData;
            deviasiStandard = Math.sqrt(variansi);
        
            if (i == 1) {
                max = data;
            } else if (data > max) {
                max = data;
            }

            if (i == 1) {
                min = data;
            } else if (data < min) {
                min = data;
            }
            
            i++;
        } while (i <= banyakData);
        System.out.println("Data terbesar      = " + max);
        System.out.println("Data terkecil      = " + min);
        System.out.println("Rentang data       = " + (max - min));
        System.out.println("Rata-rata          = " + (int) rataRata);
        System.out.println("Variansi           = " + variansi);
        System.out.println("Deviasi standard   = " + deviasiStandard);
    }
}

