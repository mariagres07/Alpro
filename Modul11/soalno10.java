package com.mycompany.modulxi;

import java.util.Scanner;

public class soalno10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nim = new String[2];
        String[] nama = new String[2];
        double[] us1 = new double[2];
        double[] us2 = new double[2];
        double[] uas = new double[2];
        double[] totalnilai = new double[2];
        char[] finalnilai = new char[2];

        String nimBaru, namaBaru;
        double nilaiMax, us1Baru, us2Baru, uasBaru;
        char finalnilaiBaru;

        for (int i = 0; i < nim.length; i++) {
            System.out.println();
            System.out.print("Masukkan NIM = ");
            nim[i] = in.next();
            System.out.print("Masukkan nama = ");
            nama[i] = in.next();
            do {
                System.out.print("Masukkan nilai us 1 = ");
                us1[i] = in.nextDouble();
            } while (us1[i] > 100 || us1[i] < 0);

            do {
                System.out.print("Masukkan nilai us 2 = ");
                us2[i] = in.nextDouble();
            } while (us2[i] > 100 || us2[i] < 0);
            do {
                System.out.print("Masukkan nilai uas = ");
                uas[i] = in.nextDouble();
            } while (uas[i] > 100 || uas[i] < 0);

            totalnilai[i] = (0.3 * us1[i]) + (0.3 * us2[i]) + (0.4 * uas[i]);
        }
        for (int i = 0; i < finalnilai.length; i++) {
            if (totalnilai[i] >= 80 && totalnilai[i] <= 100) {
                finalnilai[i] = 'A';
            } else if (totalnilai[i] >= 65 && totalnilai[i] < 80) {
                finalnilai[i] = 'B';
            } else if (totalnilai[i] >= 55 && totalnilai[i] < 65) {
                finalnilai[i] = 'C';
            } else if (totalnilai[i] >= 45 && totalnilai[i] < 55) {
                finalnilai[i] = 'D';
            } else {
                finalnilai[i] = 'E';
            }
            System.out.println();
        }
        System.out.println("Daftar Nilai "
                + "Mahasiswa TI USD");
        System.out.println();
        System.out.println("No\t\tNIM\t\tNama"
                + "\t\tUS1\t\tUS2\t\tUAS\t\tTotal\t\tFinal");
        for (int i = 0; i < nim.length; i++) {
            System.out.println((i + 1) + "\t\t" + nim[i] + "\t"
                    + nama[i] + "\t\t" + us1[i] + "\t\t"
                    + us2[i] + "\t\t" + uas[i] + "\t\t"
                    + totalnilai[i] + "\t\t" + finalnilai[i]);
            System.out.println();
        }
        for (int i = 0; i < nim.length; i++) {
            for (int j = 0; j < nim.length; j++) {
                if (totalnilai[i] > totalnilai[j]) {
                    nilaiMax = totalnilai[i];
                    totalnilai[i] = totalnilai[j];
                    totalnilai[j] = nilaiMax;

                    namaBaru = nama[i];
                    nama[i] = nama[j];
                    nama[j] = namaBaru;

                    nimBaru = nim[i];
                    nim[i] = nim[j];
                    nim[j] = nimBaru;

                    us1Baru = us1[i];
                    us1[i] = us1[j];
                    us1[j] = us1Baru;

                    us2Baru = us2[i];
                    us2[i] = us2[j];
                    us2[j] = us2Baru;

                    uasBaru = uas[i];
                    uas[i] = uas[j];
                    uas[j] = uasBaru;

                    finalnilaiBaru = finalnilai[i];
                    finalnilai[i] = finalnilai[j];
                    finalnilai[j] = finalnilaiBaru;
                }
            }
        }
        System.out.println();
        System.out.println("Daftar Nilai Mahasiswa "
                + "TI USD Urut Terbaik");
        System.out.println("No\t\tNIM\t\t\t"
                + "Nama\t\tUS1"
                + "\t\tUS2\t\tUAS\t\t"
                + "Total\t\tFinal");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + "\t\t" + nim[i]
                    + "\t\t" + nama[i] + "\t\t" + us1[i]
                    + "\t\t" + us2[i] + "\t\t" + uas[i]
                    + "\t\t" + totalnilai[i] + "\t\t" + finalnilai[i]);
            System.out.println();
        }
    }
}
