package com.mycompany.modulxi;

public class soalno8 {

    public static void main(String[] args) {
        int[] nilai = {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};
        int[] genap = new int[nilai.length];
        int[] ganjil = new int[nilai.length];
        int bilanganGanjil = 0, bilanganGenap = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] % 2 == 0) {
                genap[bilanganGenap] = nilai[i];
                bilanganGenap++;
            }
            if (nilai[i] % 2 != 0) {
                ganjil[bilanganGanjil] = nilai[i];
                bilanganGanjil++;
            }
        }
        System.out.print("Genap = ");
        for (int i = 0; i < bilanganGenap; i++) {
            System.out.print(genap[i] + ", ");
        }
        System.out.println();
        System.out.print("Ganjil = ");
        for (int i = 0 ; i < bilanganGanjil; i++) {
            System.out.print(ganjil[i] + ", ");
        }
        System.out.println();
    }
}


