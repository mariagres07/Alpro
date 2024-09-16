/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.panjangsisimiring;

/**
 *
 * @author hp
 */
public class PanjangSisiMiring { // suatu blueprint atau cetakan untuk menciptakan suatu instant dari object. Class juga merupakan grup suatu object dengan kemiripan atributes/properties, behaviour dan relasik ke object lain

    public static void main(String[] args) { // Tugasnya untuk menyimpan nilai argumen yang diberikan dari CMD atau terminal sehingga, kita bisa mengolahnya dalam program
        int alas,tinggi; // Tipe yang menggunakan int
        double panjangsisimiring; // Tipe yang menggunakan double
        double hasilkuadrat; // Tipe yang menggunakan double
        
        alas=8; // Diketahui nilai alas sisi miring
        tinggi=8; // Diketahuii nilai tinggi sisi miring
        panjangsisimiring= alas*alas+tinggi*tinggi; //Rumus panjangsisimiring 
        hasilkuadrat= Math.sqrt(panjangsisimiring);//untuk mengakarkan perhitungan panjangsisimiring
        
        System.out.println("Panjang sisi miring kuadrat adalah "+panjangsisimiring+" lalu diakarkan maka"); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu mencetak atau menampilkan nilai variabel
        System.out.println("Maka panjang sisi miring dengan alas "+alas+" dan tinggi "+tinggi+" adalah" +hasilkuadrat); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu panjang sisi miring dengan alas dan tinggi yang telah diberikan dan hasil nya disimpan dalam variabel hasil kuadrat
    } // Penutup public class
} // Penutup public static
