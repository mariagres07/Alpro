package com.mycompany.modul4;

import java.util.Scanner;

public class soalno6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        double sisi1;
        double sisi2;
        double segitiga;
        
        System.out.print("nilai sisi a = ");
        a = keyboard.nextDouble();
        System.out.print("nilai sisi b = ");
        b = keyboard.nextDouble();
        System.out.print("nilai sisi c = ");
        c = keyboard.nextDouble();
        
        segitiga = Math.max(a, Math.max(b, c));
        if (segitiga == a) {
            sisi1 = b;
            sisi2 = c;
        } else if (segitiga == b) {
            sisi1 = a;
            sisi2 = c;
        } else {
            sisi1 = a;
            sisi2 = b;
        }
        
        if ((segitiga * segitiga) == (sisi1 * sisi1) +  (sisi2 * sisi2)){
            System.out.println("segitiga siku siku");
        } else {
            System.out.println("bukan segitiga siku siku");
        }
    }
}
