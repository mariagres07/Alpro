package com.mycompany.latihanselamalibur;

public class Larik {

    public static void bubbleSort(int[] data) {
        int comparisons = 0;
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                comparisons++;
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.println("Number of comparisons (Bubble Sort): " + comparisons);
    }
}
