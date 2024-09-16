package com.mycompany.modulix;

import java.util.Scanner;

public class soalno4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        int usia = 0, sum1 = 0, sum = 0, sum2 = 0;
        double jumlah = 0, rataRata = 0;
        double variansi, deviasiStandar;
        double a = 0, b = 0, c = 0, d = 0, e = 0;

        do {
            System.out.println();
            System.out.println("Menu :");
            System.out.println("""
                           1. Masukkan data usia
                           2. Rata-rata
                           3. Deviasi standar
                           4. Diagram batang
                           5. Keluar""");

            System.out.print("Pilih menu = ");
            pilih = in.nextInt();

            if (pilih == 1) {
                System.out.print("Masukkan banyak data usia = ");
                jumlah = in.nextInt();

                for (int i = 1; i <= jumlah; i++) {
                    do {
                        System.out.print("Usia ke-" + i + " : ");
                        usia = in.nextInt();

                        if (usia >= 0 && usia <= 20) {
                            a++;
                        } else if (usia >= 21 && usia <= 40) {
                            b++;
                        } else if (usia >= 41 && usia <= 60) {
                            c++;
                        } else if (usia >= 61 && usia <= 80) {
                            d++;
                        } else if (usia >= 81 && usia <= 100) {
                            e++;

                        }

                        if (usia > 100) {
                            System.out.println("Usia tidak boleh lebih dari 100");
                        }
                        if (usia < 0) {
                            System.out.println("Usia tidak boleh kurang dari 0");
                        }
                    } while (usia < 0 || usia > 100);
                    sum1 += usia;
                }

            }
            if (pilih == 2) {
                sum += sum1;
                rataRata = sum / jumlah;
                System.out.println("Rata - rata = " + rataRata);
            }
            if (pilih == 3) {
                sum2 += (sum1 * sum1);
                variansi = (int) ((sum2 - (jumlah * (rataRata * rataRata))) / jumlah);

                deviasiStandar = Math.sqrt(variansi);
                System.out.println("Deviasi Standar = " + deviasiStandar);
            }
            if (pilih == 4) {
                System.out.print("0 - 20   = ");
                for (int i = 1; i <= a; i++) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.print("21 - 40  = ");
                for (int i = 1; i <= b; i++) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.print("41 - 60  = ");
                for (int i = 1; i <= c; i++) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.print("61 - 80  = ");
                for (int i = 1; i <= d; i++) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.print("81 - 100 = ");
                for (int i = 1; i <= e; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } while (pilih != 5);
    }
}
