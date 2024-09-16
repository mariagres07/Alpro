package Modul8;

import java.util.Scanner;

public class soalno1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pilihan, hambatan, data = 0;
        double sum1 = 0, sum2 = 0;

        do {
            System.out.println("Jenis resistor ");
            System.out.println("Seri    = 1");
            System.out.println("Paralel = 2");
            System.out.print("Resistor yang ingin diproses = ");
            pilihan = in.nextInt();

        } while (pilihan <= 0 && pilihan >= 3);

        if (pilihan == 1) {
            System.out.print("Masukkan banyak resistor = ");
            data = in.nextInt();
            for (int i = 1; i <= data; i++) {
                System.out.print("Masukkan hambatan " + i + " = ");
                hambatan = in.nextInt();
                sum1 += hambatan;
            }
            System.out.println("Hambatan total seri = " + sum1);

        } else if (pilihan == 2) {
            System.out.print("Masukkan banyak resistor = ");
            data = in.nextInt();
            for (int i = 1; i <= data; i++) {
                System.out.print("Masukkan hambatan " + i + " = ");
                hambatan = in.nextInt();
                sum2 += 1.0 / hambatan;
            }
            sum2 = 1.0/sum2;
            System.out.println("Hambatan total paralel = " + sum2);
        }
    }
}
