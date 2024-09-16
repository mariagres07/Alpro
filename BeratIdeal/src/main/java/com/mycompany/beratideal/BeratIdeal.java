package com.mycompany.beratideal;

public class BeratIdeal { // Suatu blueprint  atau cetakan untuk menciptakan suatu instant dari object. Class juga merupakan grup suatu object dengan kemiripan atributes/properties, behaviour dan relasi ke object lain.   

    public static void main(String[] args) { //Tugas nya untuk menyimpan nilai argumen yang diberikan dari CMD atau terminal, sehingga kita bisa mengolahnya dalam program.
        int tinggi; // Tipe data yang menggunakan integres
        int beratIdeal; // Tipe data yang menggunakan integres
        
        tinggi = 170; // Diketahui angka dari tinggi
        beratIdeal = tinggi-110; // Diketahui angka dari berat ideal 
        System.out.println("Berat Ideal dengan tinggi "+tinggi+" adalah:" +beratIdeal); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu berat ideal
    } // Penutup public static
} // Penutup public class
