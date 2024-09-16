package com.mycompany.mariaif;

import java.util.Scanner;

public class MariaIF {

    static Scanner tiket = new Scanner(System.in);
    static String[] rute = {
        "Jogja - Balikpapan", "Jogja - Bali", "Jogja - Jayapura",
        "Jogja - Medan", "Jogja - Bandung", "Jogja - Makassar"
    };

    static String[] maskapai = {
        "Garuda Indonesia", "Sriwijaya Air", "Batik Indonesia", "Lion Air", "Citilink", "Super Air Jet"
    };

    static String[] jadwal
            = {"07.15 WIB – 08.05 WIB", "12.45 WIB – 13.15 WIB", "20.10 WIB – 20.55 WIB", "22.00 WIB - 23.00 WIB",
                "08.15 WIB – 09.05 WIB", "13.45 WIB – 14.15 WIB", "21.10 WIB – 21.55 WIB", "23.00 WIB - 00.00 WIB",
                "09.15 WIB – 10.05 WIB", "14.45 WIB – 15.15 WIB", "22.10 WIB – 22.55 WIB", "00.00 WIB - 01.00 WIB",
                "10.15 WIB – 11.05 WIB", "15.45 WIB – 16.15 WIB", "23.10 WIB – 23.55 WIB", "01.00 WIB - 02.00 WIB",
                "11.15 WIB – 12.05 WIB", "16.45 WIB – 17.15 WIB", "00.10 WIB – 00.55 WIB", "02.00 WIB - 03.00 WIB"};
//        {"12.15 WIB – 13.05 WITA", "17.45 WIB – 18.15 WITA", "01.10 WIB – 01.55 WITA", "03.00 WIB - 04.00 WITA"}

    static String[] seatclass
            = {"Economy class", "Business class"};

    static double[] hargarute = {
        5075000, 6068000, 8407000, 3069000, 1304000, 4527000};

    static String[] Nama = new String[50];
    static String[] Umur = new String[50];
    static String[] Email = new String[50];
    static String[] NoHP = new String[50];

    static String isi() {
        Scanner isi = new Scanner(System.in);
        String m = isi.nextLine();
        return m;
    }

    static double[] hargamaskapai = {
        678000, 508000, 409800, 708000, 389700, 570550
    };

    static void menu() {

        System.out.println("WELCOME");
        System.out.println("1. Rute Pesawat ");
        System.out.println("2. Maskapai");
        System.out.println("3. Seat Class");
        System.out.println("4. Lanjut Transaksi");
        System.out.println("5. Cancel");
        int pilihmenu;
        do {
            System.out.println("Pilih menu : ");
            pilihmenu = tiket.nextInt();
        } while (pilihmenu < 1 || pilihmenu > 5);
        switch (pilihmenu) {
            case 1:
                rutePesawat();
                break;
            case 2:
                maskapai();
                break;
            case 3:
                seatclass();
                break;
            case 4:
                lanjutTransaksi();
                break;
            case 5:
        }
    }

    static void lanjutTransaksi() {
        biodata();
    }

    static void biodata() {
        int jumlahpenumpang = 0;
        do {
            System.out.print("Masukkan jumlah penumpang : ");
            jumlahpenumpang = tiket.nextInt();
        } while (jumlahpenumpang < 0);
        for (int i = 0; i < jumlahpenumpang; i++) {
            System.out.println("Data orang ke-" + (i + 1));
            System.out.print("Nama Anda     : ");
            Nama[i] = isi();
            System.out.print("Umur Anda     : ");
            Umur[i] = isi();
            System.out.print("Email Anda    : ");
            Email[i] = isi();
            System.out.print("Nomor HP Anda : ");
            NoHP[i] = isi();
        }
    }

    static int maskapai() {
        int maskapai2;
        System.out.println();
        System.out.println("Maskapai yang tersedia");
        for (int i = 0; i < maskapai.length; i++) {
            System.out.println((i + 1) + ". " + maskapai[i]);
        }
        do {
            System.out.print("Pilih Maskapai : ");
            maskapai2 = tiket.nextInt();
        } while (maskapai2 < 1 || maskapai2 > 5);
        return maskapai2 - 1;
    }

    static int rutePesawat() {
        int tujuanPilihan1;
        System.out.println("Rute pesawat yang tersedia: ");
        for (int i = 0; i < rute.length; i++) {
            System.out.println((i + 1) + ". " + rute[i]);
        }
        do {
            System.out.print("Tujuan Anda : ");
            tujuanPilihan1 = tiket.nextInt();
            return tujuanPilihan1 - 1;
        } while (tujuanPilihan1 < 1 || tujuanPilihan1 > 5);
    }

    static int seatclass() {
        int seatclass1;
        System.out.println();
        System.out.println("Seat Class yang tersedia : ");
        for (int i = 0; i < seatclass.length; i++) {
            System.out.println((i + 1) + ". " + seatclass[i]);
        }
        do {
            System.out.print("Seat Class : ");
            seatclass1 = tiket.nextInt();
            return seatclass1;
        } while (seatclass1 < 1 || seatclass1 > 2);
    }

    public static void main(String[] args) {
        rutePesawat();
        maskapai();
        seatclass();
        lanjutTransaksi();
        
        System.out.println("Tiket Anda : ");
        
        
    }

}
