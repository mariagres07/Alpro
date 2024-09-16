package com.mycompany.modul6_ep;

import java.util.Scanner;

public class soalno3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int month;
        String monthString;

        System.out.print("Masukkan bulan dalam angka = ");
        month = in.nextInt();

        switch (month) {
            case 1: monthString = "January";
                System.out.println("Jumlah hari = 31 hari");
                break;
            case 2: monthString = "February";
                System.out.println("Jumlah hari = 28/29 hari");
                break;
            case 3: monthString = "March";
                System.out.println("Jumlah hari = 31 hari");
                break;
            case 4: monthString = "April";
                System.out.println("Jumlah hari = 30 hari");
                break;
            case 5: monthString = "May";
                System.out.println("Jumlah hari = 31 hari");
                break;
            case 6: monthString = "June";
                System.out.println("Jumlah hari = 30 hari");
                break;
            case 7: monthString = "July";
                System.out.println("Jumlah hari = 31 hari");
                break;
            case 8: monthString = "August";
                System.out.println("Hari = 31 hari");
                break;
            case 9: monthString = "September";
                System.out.println("Jumlah hari = 30 hari");
                break;
            case 10: monthString = "October";
                System.out.println("Jumlah hari = 31 hari");
                break;
            case 11: monthString = "November";
                System.out.println("Jumlah hari = 30 hari");
                break;
            case 12: monthString = "December";
                System.out.println("Jumlah hari = 31 hari");
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }
}
