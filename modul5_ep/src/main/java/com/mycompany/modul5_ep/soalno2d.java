package com.mycompany.modul5_ep;

import java.util.Scanner;

public class soalno2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double sisiA;
        double sisiB;
        double sisiC;
        
        System.out.print("sisi a = ");
        sisiA = in.nextInt();
        System.out.print("sisi b = ");
        sisiB = in.nextInt();
        System.out.print("sisi c = ");
        sisiC = in.nextInt();
        
        if ((Math.pow(sisiC, 2)) == (Math.pow(sisiB, 2))+ (Math.pow(sisiA, 2))){
            System.out.println("segitiga siku siku");
        } else if ((Math.pow(sisiB, 2)) == (Math.pow(sisiC, 2))+ (Math.pow(sisiA, 2))) {
            System.out.println("segitiga siku siku");
        } else if ((Math.pow(sisiA, 2)) == (Math.pow(sisiC, 2)) + (Math.pow(sisiB, 2))){
            System.out.println("segitiga siku siku");
        } else if (sisiA == sisiB && sisiB == sisiC && sisiA == sisiC){
            System.out.println("segitiga sama sisi");
        }  else if (sisiA == sisiB || sisiA == sisiC || sisiB == sisiC) {
            System.out.println("segitiga sama kaki");
        } else {
            System.out.println("segitiga sembarang");
        }
    }
}
