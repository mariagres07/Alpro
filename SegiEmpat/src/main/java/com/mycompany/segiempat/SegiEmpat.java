package com.mycompany.segiempat;

public class SegiEmpat { // suatu blueprint atau cetakan untuk menciptakan suatu instant dari object. Class juga merupakan grup suatu object dengan kemiripan atributes/properties, behaviour dan relasi ke object lain.

    public static void main(String[] args) { // Tugasnya untuk menyimpan nilai argumen yang diberikan dari CMD atau terminal, sehingga kita bisa mengolahnya dalam program.
        int panjang, lebar; // Tipe data yang menggunakan integres
        double luas; // Tipe data yang menggunakan double
        
        panjang = 4; // Diketahui angka panjang SegiEmpat
        lebar = 5; // Diketahui angka lebar SegiEmpat  
        luas = panjang * lebar; // Mencari rumus luas SegiEmpat
        System.out.println("Hasil dari luas segi empat adalah: "+luas); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu luas SegiEmpat
    } // Penutup public static
} // Penutup public class
