package com.mycompany.modul3_ep;

public class soalno5 {
    public static void main(String[] args) {
        
        double botol1, botol2, botol3;
        double diameter1 = 5;
        double diameter2 = 10;
        double tinggi1 = 15;
        double tinggi2 = 20;
        double tinggi3 = 25;
        double cairan1;
        double cairan2;
        double cairan3;
        
        botol1 = 3.14 * Math.pow(diameter1 / 2, 2) * tinggi1;
        botol2 = 3.14 * Math.pow(diameter2 / 2, 2) * tinggi2; 
        botol3 = 3.14 * Math.pow(diameter2 / 2, 2) * tinggi3;
        
        cairan1 = botol1 * 50;
        System.out.println("cairan 1 = " + cairan1 + "liter");
        cairan2 = botol2 * 25;
        System.out.println("cairan 2 = " + cairan2 + "liter");
        cairan3 = botol3 * 25;
        System.out.println("cairan 3 = " + cairan3 + "liter");
    }
}
