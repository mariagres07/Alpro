package com.mycompany.utsmariagresia235314094;

import java.util.Scanner;

public class soalno1 { //deklarasi class

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama; // variabel yang diperlukan
        int nim, hargatotal, bayar, diskontotal; // variabel yang diperlukan
        int jumlahGalon, jumlahBB, jumlahBk, jumlahGelas;// variabel yang diperlukan
        int hargagalon, hargabb, hargabk, hargagelas;// variabel yang diperlukan
        double diskongalon, diskonbb, diskonbk, diskongelas;// variabel yang diperlukan

        System.out.println("Nota Warung Air Murah"); 
        System.out.print("Nama : ");//menginput nama
        nama = in.nextLine(); // menyimpan inputan user
        System.out.print("NIM  : ");//menginput nim
        nim = in.nextInt();// menyimpan inputan user

        System.out.print("Masukkan Jumlah Galon   = "); //menginput data yang diperlukan
        jumlahGalon = in.nextInt(); //menyimpan data yang diinput user
        System.out.print("Masukkan Jumlah B.Besar = "); //menginput data
        jumlahBB = in.nextInt();//menyimpan data yang diinput user
        System.out.print("Masukkan Jumlah B.Kecil = " );//menginput data
        jumlahBk = in.nextInt();//menyimpan data yang diinput user
        System.out.print("Masukkan Jumlah Gelas   = " );//menginput data
        jumlahGelas = in.nextInt(); //menyimpan data yang diinput user
        
        hargagalon = jumlahGalon*30000; //menghitung harga per benda
        hargabb = jumlahBB * 5000;  //menghitung harga per benda
        hargabk = jumlahBk * 3000; //menghitung harga per benda
        hargagelas = jumlahGelas * 1000; //menghitung harga per benda
        
        diskongalon = hargagalon * 0.15; //menghitung diskon
        diskonbb =  hargabb * 0.12; //menghitung diskon
        diskonbk =  hargabk* 0.01; //menghitung diskon
        diskongelas = hargagelas * 0.02; //menghitung diskon
        
        System.out.println("Jml    Kemasan     @       harga    discount");// nota dari pemebelian
        System.out.println("============================================");
        System.out.println(jumlahGalon + "    "+ "  Galon      " + "30000   " + hargagalon + "      " + diskongalon);
        System.out.println(jumlahBB    + "    "+ "  B.Besar    " + "5000    " + hargabb    + "      " + diskonbb);
        System.out.println(jumlahBk    + "    "+ "  B.Kecil    " + "3000    " + hargabk    + "       " + diskonbk);
        System.out.println(jumlahGelas + "    "+ "  Gelas      " + "1000    " + hargagelas + "       " + diskongelas);
        System.out.println("============================================");       
        hargatotal = hargabb+hargabk+hargagalon+hargagelas; //menghitung harga total
        System.out.println("TOTAL      = " + hargatotal); //mencetak harga total
        diskontotal = (int) (diskonbb + diskonbk + diskongelas + diskongalon);//mencetak diskon total
        bayar = hargatotal - diskontotal; //menghitung yang perlu dibayarkan
        System.out.println("DIBAYARKAN = "+bayar);//mencetak bayar
        

    }
}
