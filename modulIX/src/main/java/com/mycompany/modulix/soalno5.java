package com.mycompany.modulix;

import java.util.Scanner;

public class soalno5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Masukkan nilai n = ");
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            int a = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a = a * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
