package Modul62;

import java.util.Scanner;

public class soalno2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahData, beratMangga;
        int i = 1;
        int kecil = 0, sedang = 0, besar = 0;

        System.out.print("Masukkan jumlah data = ");
        jumlahData = in.nextInt();
        
        while (i <= jumlahData) {
            System.out.print("Berat mangga " + i + " = ");
            beratMangga = in.nextInt();

            if (beratMangga < 200) {
                kecil++;
            } else if (beratMangga >= 200 && beratMangga < 600) {
                sedang++;
            } else if (beratMangga >= 600) {
                besar++;
            }
            i++;
        }
        System.out.println("Jumlah mangga kecil  = " + kecil);
        System.out.println("Jumlah mangga sedang = " + sedang);
        System.out.println("Jumlah mangga besar  = " + besar);
    }
}
