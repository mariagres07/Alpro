//package com.mycompany.latihanselamalibur;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] data = {5, 8, 26, 15, 11, 31};
//
//        System.out.println("Original array: " + Arrays.toString(data));
//
//        Larik.bubbleSort(data.clone());
//        Larik.selectionSort(data.clone());
//
//        System.out.println("Sorted array (Bubble Sort): " + Arrays.toString(data));
//        System.out.println("Sorted array (Selection Sort): " + Arrays.toString(data));
//
//        int[] dataRandom = generateRandomArray(1000);
//
//        long startTime = System.nanoTime();
//        Larik.bubbleSort(dataRandom.clone());
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//
//        System.out.println("Time taken by Bubble Sort: " + duration + " nanoseconds");
//    
//private static int[] generateRandomArray(int n) {
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = (int) (Math.random() * 1000); 
//        }
//        return arr;
//    }
//}
