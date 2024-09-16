package Modul62;

import java.util.Scanner;

public class soalno4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int banyakData;
        int data, i = 1;
        int sum1 = 0, sum2 = 0;
        double deviasiStandard;
        double variansi = 0;
        double rataRata = 0;
        int max = 0, min = 0;

        System.out.print("Masukkan banyak data yang akan diolah = ");
        banyakData = in.nextInt();

        while (i <= banyakData) {
            System.out.print("Masukkan data ke " + i + " = ");
            data = in.nextInt();

            sum1 += data;
            sum2 += (data * data);
            rataRata = sum1 / banyakData;
            variansi = (sum2 - (banyakData * (rataRata * rataRata))) / banyakData;

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
        }

        System.out.println("Data terbesar      = " + max);
        System.out.println("Data terkecil      = " + min);
        System.out.println("Rentang data       = " + (max - min));
        System.out.println("Rata-rata          = " + (int) rataRata);
        System.out.println("Variansi           = " + variansi);

        deviasiStandard = Math.sqrt(variansi);
        System.out.println("Deviasi standard   = " + deviasiStandard);
    }
}
