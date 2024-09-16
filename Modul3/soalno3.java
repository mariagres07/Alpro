package com.mycompany.modul3_ep;

import java.util.Scanner;

public class soalno3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double luas_tembok;
        double harga_cat_per_kaleng;
        double jumlah_cat;

        System.out.print("luas = ");
        luas_tembok = keyboard.nextDouble();

        System.out.print("harga cat per kaleng = ");
        harga_cat_per_kaleng = keyboard.nextDouble();

        jumlah_cat = Math.ceil(luas_tembok / 5);
        System.out.println("jumlah cat = " + jumlah_cat);
    }
}
