package com.mycompany.luassegitiga;

public class LuasSegitiga { // suatu blueprint atau cetakan untuk menciptakan suatu instant dari object. Class juga merupakan grup suatu object dengan kemiripan atributes/properties, behaviour dan relasi ke object lain
   
     

    public static void main(String[] args) { // Tugasnya untuk menyimpan nilai argumen yang diberikan dari CMD atau terminal, sehingga kita bisa mengolahnya dalam program
        int alas, tinggi; //  Tipe data yang menggunakan integres
        double luasSeg; // Tipe data yang menggunakan double
        
        
        alas = 35; // Diketahui angka alas dari segitiga
        tinggi =3; // Diketahui angka tinggi dari segitiga 
        luasSeg= 0.5 * alas * tinggi; // Mencari Rumus luas segitiga
        System.out.println("Hasil dari luas segitiga adalah: "+luasSeg); // Pernyataan Java yang mencetak argumen yang dikirimkan ke System.out yaitu luas segitiga
    } // Penutup public static
} // Penutup public class
