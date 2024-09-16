package com.mycompany.modulvii;

import java.util.Scanner;

public class soalno3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahMangga, berat;
        int biasa = 0, bagus = 0, unggul = 0;
        int i = 1;
        
        System.out.print("Jumlah Mangga = ");
        jumlahMangga = in.nextInt();
        
        do {
            System.out.print("Berat mangga " + i + " = ");
            berat = in.nextInt();
            
            if (berat < 500) {
                biasa++;
            } 
            
            if (berat >= 500 && berat < 750) {
                bagus++;
            } 
            
            if (berat > 750) {
                unggul++;
            }
            i++;
        }while (i <= jumlahMangga);    
        System.out.println("Mangga biasa  = " + biasa);
        System.out.println("Mangga bagus  = " + bagus);
        System.out.println("Mangga unggul = " + unggul);
    }
}


