package com.mycompany.modulvii;

import java.util.Scanner;

public class soalno2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double uts1, uts2, uas, nilai_total;

        do {
            System.out.print("UTS 1 = ");
            uts1 = in.nextDouble();
        } while (uts1 < 0 || uts1 > 100);
        do {
            System.out.print("UTS 2 = ");
            uts2 = in.nextDouble();
        } while (uts2 < 0 || uts2 > 100);
        do {
            System.out.print("UAS = ");
            uas = in.nextDouble();
        } while (uas < 0 || uas > 100);
       
        nilai_total = ((30*uts1)/100) + ((30*uts2)/100) + ((40*uas)/100);
        System.out.println("nilai total = " + nilai_total);
        
        if (nilai_total >= 80) {
            System.out.println("Nilai final A");
        } else if ((65 <= nilai_total) && (nilai_total < 80)) {
            System.out.println("Nilai final B");
        } else if ((55 <= nilai_total) && (nilai_total < 65)) {
            System.out.println("Nilai final C");
        } else if ((50 <= nilai_total) && (nilai_total < 55)) {
            System.out.println("Nilai final D");
        } else {
            System.out.println("Nilai final E");
        }   
    }
}

