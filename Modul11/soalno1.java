package Modul11;

import java.util.Scanner;

public class soalno1 {

    public static void main(String[] args) {
        int[]nilai;
        nilai = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        nilai[0] = 45;
        nilai[1] = 75;
        nilai[2] = 80;
        nilai[3] = 78;
        nilai[4] = 93;
        
        for (int i = 0; i < 5; i++){
            System.out.println("Data ke " + (i+1) +"adalah "+ nilai[4-i]);
        }
    }
}
