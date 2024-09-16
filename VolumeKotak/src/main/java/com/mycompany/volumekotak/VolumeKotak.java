/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.volumekotak;

/**
 *
 * @author hp
 */
public class VolumeKotak { //Suatu blueprint atau cetakan untuk menciptakan suatu instant dari object. Class juga merupakan grup suatu object dengan kemiripan atributes/properties.

    public static void main(String[] args) { //Tugasnya untuk menyimpan nilai argumen yang diberikan dari CMD atau terminal,sehingga kita bisa mengolahnya dalam program.
        int panjang; //Tipe data yang menggunakan integres
        int lebar; // Tipe data yang menggunakan integres
        int tinggi; // Tipe data yang menggunakan integres
        int volume; // Tipe data yang menggunakan integres 
        
        panjang = 10; // Diketahui panjang volume kotak
        lebar= 15; // Diketahui lebar volume kotak
        tinggi = 5; // Diketahui tinggi volume kotak
        volume = panjang * lebar * tinggi; // Mencari rumus volume kotak
        
        System.out.println("Hasil dari volume kotak: "+volume); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu volume kotak
        
       
    } // Penutup public class
} // Penutup pubic static
