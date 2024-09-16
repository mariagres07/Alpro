package com.mycompany.modulvii;

import java.util.Scanner;

public class soalno1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        double x1, x2;

        do {
            System.out.print("a        = ");
            a = in.nextInt();
        } while (a == 0);
        
        System.out.print("b        = ");
        b = in.nextInt();
        
        System.out.print("c        = ");
        c = in.nextInt();
        
        d = (b*b)-(4*a*c);
        System.out.println(d);

       if (d < 0) {
            System.out.println("Tidak mempunyai akar akar riil");
        } else if (d == 0) {
            x1 = -b  / (2*a);
            System.out.println("Memiliki akar tunggal");
        } else if (d > 0){
            System.out.println("Memiliki dua akar riil yang berbeda");
        }
    }
}

