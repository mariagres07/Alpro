package com.mycompany.modulx;

import java.util.Scanner;

public class soalno2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n = ");
            n = in.nextInt();

        } while (n <= 0);

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

    static int faktorial (int a) {
        int hasil = 1;
        if (a == 0) {
            return 1;
        } else {
            for (int i = 1; i <= a; i++) {
                hasil = hasil * i;
            }
        }
        return hasil;
    }

}
