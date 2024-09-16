package com.mycompany.modul4;

import java.util.Scanner;

public class soalno7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("bilangan 1 = ");
        a = keyboard.nextInt();
        System.out.print("bilangan 2 = ");
        b = keyboard.nextInt();
        System.out.print("bilangan 3 = ");
        c = keyboard.nextInt();
        
        if (a<b && b<c){
            System.out.println("urutannya adalah " + a + ", " + b + ", " + c);
        } else if (a<c && c<b){
            System.out.println("urutannya adalah " + a + ", " + c + ", " + b);
        } else if (b<a && a<c){
            System.out.println("urutannya adalah " + b + ", " + a + ", " + c);
        } else if (b<c && c<a) {
            System.out.println("urutannya adalah " + b + ", " + c + ", " + a);
        } else if (c<a && a<b) {
            System.out.println("urutannya adalah " + c + ", " + a + ", " + b);
        } else{
            System.out.println("urutannya tidak ada hasil");
}
    }
}
