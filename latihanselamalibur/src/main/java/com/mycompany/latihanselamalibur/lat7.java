package com.mycompany.latihanselamalibur;

class siswa {

    String nama;

    siswa(String namasiswa) {
        this.nama = namasiswa;
    }

    void data() {
        System.out.println("untuk = " + this.nama);

    }

    void masukandata(String nama) {
        this.nama = "kamu yang di sana";
    }

    String ulangnama() {
        return this.nama;
    }

    String pesan(String pesanku) {
        return pesanku + ", kamu keren pake banget";
    }
}

public class lat7 {

    public static void main(String[] args) {
        siswa lala = new siswa("maria");

        lala.masukandata("hehehe");
        lala.data();
        String kukaka = lala.pesan("hai hai hai");
        System.out.println(kukaka);

    }
}
