package com.mycompany.utsmariagresia235314094;

import java.util.Scanner;

public class soalno2 {//deklarasi class

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double reamur, fahrenheit, celcius;//variabel yang digunakan
        int menu;//variabel yang digunakan

        System.out.println("Program Konversi Suhu Oleh :");//mencetak
        System.out.print("Nama     : ");//menginput
        in.nextLine();//menyimpan
        System.out.print("NIM      : ");//menginput
        in.nextInt();//menyimpan

        System.out.print("Masukkan pilihan : ");//menginput data
        menu = in.nextInt();//menyimpan data

        if (menu == 1) {
            System.out.println("1. Celcius");//mencetak
            System.out.println("2. Fahrenheit");//mencetak
            System.out.println("3. Reamur");//mencetak
            System.out.println("Pilih ? 1");//mencetak pilihan
            System.out.print("Masukkan suhu Celcius   : ");//menginput suhu
            celcius = in.nextInt();//menyimpan data celcius
            reamur = (4.0 / 5.0) * celcius;//menghitung reamur
            System.out.println("Suhu Reamur             : " + reamur);//mencetak suhu
            fahrenheit = (9.0 / 5.0) * celcius + 32;//menghitung fahrenheit
            System.out.println("Suhu Fahrenheit         : " + fahrenheit);//mencetak suhu
        } else if (menu == 2) {
            System.out.println("1. Celcius");//mencetak
            System.out.println("2. Fahrenheit");//mencetak
            System.out.println("3. Reamur");//mencetak
            System.out.println("Pilih ? 2");//mencetak pilihan
            System.out.print("Masukkan suhu Fahrenheit   : ");//menginput suhu
            fahrenheit = in.nextInt();//menyimpan data fajrenheit
            reamur = (4.0 / 9.0) * (fahrenheit - 32);//menghitung reamur
            System.out.println("Suhu Reamur          : " + reamur);
            celcius = (5.0 / 9.0) * (fahrenheit - 32);//menghitung celcius
            System.out.println("Suhu Celcius         : " + celcius);
        } else if (menu == 3) {
            System.out.println("1. Celcius");//mencetak
            System.out.println("2. Fahrenheit");//mencetak
            System.out.println("3. Reamur");//mencetak
            System.out.println("Pilih ? 3"); //mencetak pilihan
            System.out.print("Masukkan suhu Reamur   : ");//menginput suhu
            reamur = in.nextInt();//menyimpan data reamur
            System.out.println("Suhu Fahrenheit             : " + reamur); //mencetak suhu
            celcius = (5.0 / 4.0) * reamur;//menghitung celcius
            System.out.println("Suhu Celcius                : " + celcius);//mencetak suhu
        } else {
            System.out.println("1. Celcius");//mencetak
            System.out.println("2. Fahrenheit");//mencetak
            System.out.println("3. Reamur");//mencetak
            System.out.println("Pilih ? 4");//mencetak pilihan
            System.out.println("Masukan Salah");//mencetak
        }
    }
}
