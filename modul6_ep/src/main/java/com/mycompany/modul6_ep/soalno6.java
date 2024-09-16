package com.mycompany.modul6_ep;

enum Agama {
    HINDU,
    BUDDHA,
    YAHUDI,
    KATOLIK,
    KRISTEN,
    ISLAM,
}

public class soalno6 {
    public static void main(String[] args) {
        Agama a = Agama.HINDU;
        
        switch (a) {
            case HINDU:
                System.out.println("Kitab Suci = Veda");
                System.out.println("Nabi = --");
                break;
            case BUDDHA:
                System.out.println("Kitab Suci = Tripitaka");
                System.out.println("Nabi = Sidarta Gautama");
                break;
            case YAHUDI:
                System.out.println("Kitab Suci = Taurat");
                System.out.println("Nabi = Musa");
                break;
            case KATOLIK:
                System.out.println("Kitab Suci = Injil");
                System.out.println("Nabi = Yesus");
                break;
            case KRISTEN:
                System.out.println("Kitab Suci = Injil");
                System.out.println("Nabi = Yesus");
                break;
            case ISLAM:
                System.out.println("Kitab Suci = Alquran");
                System.out.println("Nabi = Muhammad");
                break;
            default:
                System.out.println("Tidak ada");
        }
    }
}
