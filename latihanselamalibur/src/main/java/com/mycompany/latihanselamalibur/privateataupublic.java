package com.mycompany.latihanselamalibur;

class jisung {

    int umur; //default = bisa dibaca dan ditulis
    public int exp; //public == default
    //default dan public dapat diakses di luar class

    private String crush; //di dalam class saja

    jisung(int umur, int exp, String crush) {
        this.umur = umur;
        this.exp = exp;
        this.crush = crush;
    }

    //default modifier access
    void dia() {
        tambahexp();
        System.out.println("\nUmur\t= " + this.umur);
        System.out.println("exp\t= " + this.exp);
        System.out.println("crush\t= " + this.crush);//membaca tetapi di dalam class
    }

    public void ubahumur(int umurbaru) {
        this.umur = umurbaru;
    }

    private void tambahexp() {
        this.exp += 10;
    }
}

public class privateataupublic {

    public static void main(String[] args) {

        jisung pacar = new jisung(21, 0, "dia");

        //default
        System.out.println(pacar.umur);//membaca data
        pacar.umur = 18; //menulis data
        System.out.println(pacar.umur);//membaca data

        //public
        System.out.println(pacar.exp);//membaca data
        pacar.exp = 70; //menulis data
        System.out.println(pacar.exp);//membaca data

        //private(tidak bisa diakses)
//        System.out.println(pacar.crush);//membaca data
//        pacar.crush = "pacarku"; //menulis data
//        System.out.println(pacar.crush);//membaca data
        //method
        //default
        pacar.dia();

        //public
        pacar.ubahumur(19);
        pacar.dia();

        //private nggak bisa diakses
//        pacar.ganticrush();
    }
}
