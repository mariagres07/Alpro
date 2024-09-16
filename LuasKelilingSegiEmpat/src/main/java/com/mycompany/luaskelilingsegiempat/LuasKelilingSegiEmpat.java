package com.mycompany.luaskelilingsegiempat;

public class LuasKelilingSegiEmpat { // suatu blueprint atau cetakan untuk menciptakan suatu instant dari object. Class juga merupakan grup suatu object dengan kemiripan atributes/ properties, behaviour dan relasi ke object lain.

    public static void main(String[] args) { // Tugasnya untuk menyimpan nilai argumen yang diberikan dari CMD atau terminal, sehingga kita bisa mengolahnya dalam program.
        int panjang, lebar; // Tipe data yang menggunakan integres
        double luas; // Tipe data yang menggunakan double
        double keliling; // Tipe data yang menggunakan double 
        
        panjang =35; // Diketahui angka panjang Keliling segi empat
        lebar =10; // Diketahui angka lebar Keliling segi empat
        luas= panjang * lebar; // Mencari rumus segi empat 
        keliling = 2 * panjang + lebar;  // Mencari rumus keliling segi empat
        
        System.out.println("Hasil dari luas segi empat adalah: "+luas); //  Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu luas segi empat.
        System.out.println("Hasil dari keliling segi empat adalah: "+keliling); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu Keliling segi empat
     
 
    } // Penutup public static
} // Penutup public class
