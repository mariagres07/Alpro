package Modul10;

import java.util.Scanner;

public class soalno1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r, b;
        int nfaktorial, rfaktorial, nrfaktorial, kombinasi;

        do {
            System.out.print("Masukkan nilai n = ");
            n = in.nextInt();

            System.out.print("Masukkan nilai r = ");
            r = in.nextInt();
        } while (r >= n);

        nfaktorial = faktorial(n);
        System.out.println("n! = " + nfaktorial);

        rfaktorial = faktorial(r);
        System.out.println("r! = " + rfaktorial);

        b = n - r;
        nrfaktorial = faktorial(b);
        System.out.println("n-r! = " + nrfaktorial);

        kombinasi = nfaktorial / (nrfaktorial * rfaktorial);
        System.out.println("Kombinasi = " + kombinasi);
    }

    static int faktorial(int a) {
        int hasil = 1;
        if (a == 0) {
            return 1;
        } else {
            for (int i = 1; i <= a; i++) {
                hasil = hasil * i;
            }
        }
        return hasil;
    }
}
