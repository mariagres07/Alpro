package com.mycompany.latihanselamalibur;

import java.util.Scanner;
import Modul_3.InterpolationSearch;
import java.util.Arrays;

public class data {

    public static void main(String[] args) {
        int n = 1000;
        int[] dataRandom = new int[n];
        for (int i = 0; i < n; i++) {
            dataRandom[i] = (int) (Math.random() * 10000);
        }
        int[] dataBubleSort = Arrays.copyOf(dataRandom, n);

        long startTime = System.nanoTime();
        InterpolationSearch.BubleSortDescending(dataBubleSort);
        long endTime = System.nanoTime();
        for (int i = 0; i < dataBubleSort.length; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        long time = endTime - startTime;
        System.out.println("");

        System.out.println("Waktu yang dibutuhkan = " + time + "nanosekon");
    }
}

