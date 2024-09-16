package com.mycompany.modulxi;

public class soalno7 {

    public static void main(String[] args) {
        int[] usia1 = {18, 39, 45, 50, 65, 70, 90};
        int[] usia2 = {20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96};
        int usiaBaru = usia1.length + usia2.length;
        int[] akhir = new int[usiaBaru];

        for (int i = 0; i < usia1.length; i++) {
            akhir[i] = usia1[i];
        }

        for (int i = usia1.length; i < akhir.length; i++) {
            akhir[i] = usia2[i - usia1.length];
        }

        for (int i = 0; i < akhir.length; i++) {
            for (int j = i; j < akhir.length; j++) {
                if (akhir[i] > akhir[j]) {
                    usiaBaru = akhir[j];
                    akhir[j] = akhir[i];
                    akhir[i] = usiaBaru;
                }
            }
        }
        System.out.println();
        System.out.print("Usia gabungan yang telah diurutkan= ");
        for (int a : akhir) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
