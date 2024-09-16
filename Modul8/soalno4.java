package Modul8;

import java.util.Scanner;

public class soalno4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        double x1 = 0, x2 = 0, d, y, x = 0;

        System.out.print("Masukkan koefisien a   = ");
        a = in.nextInt();
        System.out.print("Masukkan koefisien b   = ");
        b = in.nextInt();
        System.out.print("Masukkan konstanta (c) = ");
        c = in.nextInt();
        
        d = b * b - 4 * a * c;
        System.out.println("d = " + d);

        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);

            System.out.println("Dari persaman y = " + a + "x2 + " + b + "x + " + c);
            System.out.println("Akar-akarnya adalah " + x1 + " dan " + x2);
            System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("       x                  y = " + a + "x2 + " + b + "x + " + c);
            System.out.println("--------------------------------------------------------------");
            for (x = x1; x <= x2; x+=0.25) {
                y = (a * Math.pow(x, 2)) + (b * x) + c;
                System.out.println("   " + x + "                " + "y = " + y);
            }
        } else {
            System.out.println("Tidak dijalankan");
        }
    }
}
