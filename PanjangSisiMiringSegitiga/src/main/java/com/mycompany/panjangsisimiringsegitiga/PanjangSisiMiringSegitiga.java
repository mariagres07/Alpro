package com.mycompany.panjangsisimiringsegitiga;

public class PanjangSisiMiringSegitiga { //suatu blueprint atau cetakan untuk menciptakan suatu instant dari object. Class juga merupakan grup suatu object dengan kemiripan atributes/properties, behaviour dan relasi ke object lain 

    public static void main(String[] args) { //Tugas untuk menyimpan nilai argumen yang diberikan dari CMD atau terminal, sehingga kita bisa mebgolahnya dalam program
        int alas, tinggi; // Tipe data yang  menggunakan integres
        double panjangSisiMiring; // Tipe data yang  menggunakan double
        double hasil; // Tipe data yang menggunakan double
        
        alas=8; // Diketahui nilai alas luas segitiga
        tinggi=10; // Diketahui nilai tinggi segitiga 
        panjangSisiMiring= (alas*alas)+(tinggi*tinggi); // Rumus Panjang sisi miring Segitiga
        hasil= Math.sqrt(panjangSisiMiring); //
        System.out.println("Panjang Sisi Miring dengan alas "+alas+" dan tinggi "+tinggi+":" +hasil); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu Panjang Sisi Miring Segitiga
    } // Penutup public class
} // Penutup public static
