package com.mycompany.modul4;

import java.util.Scanner;

public class soalno5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double uts1;
        double uts2;
        double uas;
        double nilai_total;
        
        System.out.print("uts 1 = ");
        uts1 = keyboard.nextDouble();
        System.out.print("uts 2 = ");
        uts2 = keyboard.nextDouble();
        System.out.print("ujian akhir semester = ");
        uas = keyboard.nextDouble();
        
        nilai_total = ((30*uts1)/100) + ((30*uts2)/100) + ((40*uas)/100);
        System.out.println("nilai total = " + nilai_total);
        
        if (nilai_total >= 80) {
            System.out.println("nilai final A");
        } else if ((65 <= nilai_total) && (nilai_total < 80)) {
            System.out.println("nilai final B");
        } else if ((55 <= nilai_total) && (nilai_total < 65)) {
            System.out.println("nilai final C");
        } else if ((50 <= nilai_total) && (nilai_total < 55)) {
            System.out.println("nilai final D");
        } else {
            System.out.println("nilai final E");
        }
    }
}

