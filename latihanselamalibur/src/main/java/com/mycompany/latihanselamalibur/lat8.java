package com.mycompany.latihanselamalibur;

class buku {

    String judul;
    String penulis;

    buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampilan() {
        System.out.println("\nJudul\t : " + this.judul);
        System.out.println("Penulis\t : " + this.penulis);
    }
}

public class lat8 {

    public static void main(String[] args) {
        buku buku1 = new buku("Harry Potter", "J.K Rowling");
        buku buku2 = new buku("Harry Potter", "J.K Rowling");

        buku1.judul = "maria cantik";
        buku1.tampilan();
        String addressbuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressbuku1);

        buku2.tampilan();
        
        fungsi(buku2);
        buku1.tampilan();
        buku2.tampilan();
        
    }
    public static void fungsi(buku databuku){
        String addressdatabuku = Integer.toHexString(System.identityHashCode(databuku));
        System.out.println(addressdatabuku);
        databuku.penulis = "siapa ya";
    }
}
