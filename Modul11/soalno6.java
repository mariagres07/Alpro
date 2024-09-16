package com.mycompany.modulxi;

import java.util.Scanner;

public class soalno6 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int [] bil = {2,7,3,9,4,1,34,25,76,80,90,54,21,78};
        int nilaiX;
        
        System.out.print(" Masukkan nilai yang dicari = ");
        nilaiX = in.nextInt();
        
        for (int i = 0; i<bil.length; i++){
            if(bil[i]== nilaiX){
                System.out.println(" Angka ditemukan pada index ke- = " + i);
            }
        }
    }
}
