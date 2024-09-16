/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kelilingluaslingkaran;

/**
 *
 * @author hp
 */
public class KelilingLuasLingkaran { // suatu blueprint atau cetakan untuk menciptakan suatu instant dari object. Class juga merupakan grup suatu object dengan kemiripan artibutes/ properties, behaviour dan relasi ke object lain.

    public static void main(String[] args) { // Tugasnya untuk menyimpan nilai argumen yang diberikan dari CMD atau terminsl, sehingga kita bisa mengolahnya dalam program. 
        double phi; // Tipe data yang menggunakan double
        int jariJari; // Tipe data yang menggunakan int
        double luas,keliling; // Tipe data yang menggunakan double 
        
        
        phi=3.14; // Diketahui nilai dari phi 
        jariJari=21; // Diketahui nilai dari jari jari
        luas=phi * jariJari * jariJari; // Rumus yang mencari luas lingkaran
        keliling = 2 * phi * jariJari; // Rumus yang mencari keliling lingkaran
        System.out.println("Luas Lingkaran dengan jari jari "+jariJari+" adalah:" +luas); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu luas lingkaran.
        System.out.println("Keliling Lingkaran dengan jari jari "+jariJari+" adalah:" +keliling); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu Keliling lingkaran
    } // Penutup public static
} // Penutup public class
