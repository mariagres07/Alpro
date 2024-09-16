package com.mycompany.latihan;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double mid1,mid2,uas;
        double nilai1,nilai2,nilaiTotal, nilai3;
        
        System.out.print("Mid 1 = ");
        mid1 = in.nextDouble();
        System.out.print("Mid 2 = ");
        mid2 = in.nextDouble();
        System.out.print("Uas = ");
        uas = in.nextDouble();
        
        nilai1 = mid1 * 0.25;
        nilai3 = mid2 * 0.25;
        nilai2 = uas * 0.5;
        
        nilaiTotal = nilai1 + nilai3 + nilai2;
        System.out.println("Nilai akhir = " + nilaiTotal);
    }
}
