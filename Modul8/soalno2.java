package Modul8;

import java.util.Scanner;

public class soalno2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double data, sum1 = 0, sum2 = 0, sum3 = 0;
        int banyakData;

        System.out.print("Banyak data = ");
        banyakData = in.nextInt();

        for (int i = 1; i <= banyakData; i++) {

            System.out.print("Masukkan data " + i + " : ");
            data = in.nextDouble();

            sum1 += (data * data);

            sum2 += Math.sqrt(data);

            if (data != 0) {
                sum3 += 1 / data;
            }
        }
        System.out.println("Jumlah kuadrat data = " + sum1);
        System.out.println("Jumlah akar data    = " + sum2);
        System.out.println("Jumlah 1/data       = " + sum3);
    }
}
