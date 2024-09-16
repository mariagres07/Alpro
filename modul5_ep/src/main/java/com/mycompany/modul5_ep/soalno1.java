package com.mycompany.modul5_ep;

import java.util.Scanner;

public class soalno1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b, c, d=0;
        double x1, x2;
        
        System.out.print("koefisien x1 = ");
        a = input.nextDouble();
        System.out.print("koefisien x2 = ");
        b = input.nextDouble();
        System.out.print("konstanta = ");
        c = input.nextDouble();
        
        d = (b * b) - (4 *a*c);
        System.out.println("diskriminan = " + d);
        
        if (d < 0 && a==0) {
            System.out.println("tidak mempunyai akar akar riil");
        } else if (d == 0) {
            x2 = -b + Math.sqrt((b * b) - (4 *a*c)) / (2*a);
            System.out.println("x = "+x2);
        } else if(d >= 0 ){
            x1 = -b - Math.sqrt((b * b) - (4 *a*c)) / (2*a);
            x2 = -b + Math.sqrt((b * b) - (4 *a*c)) / (2*a);
            System.out.println("akar 1 = " + x1);
            System.out.println("akar 2 = " + x2);
        }
    }
}