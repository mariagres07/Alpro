package Modul62;

public class soalno1 {

    public static void main(String[] args) {
        int liter = 1;
        double harga = 0;
        
        System.out.println("Jumlah liter   Harga(Rp)");
        System.out.println("============================");
        while (liter < 21) {
            liter = liter + 1;
            harga = 6500 * liter;
            System.out.println("    "+liter +"          "+ (int)harga);
        }
        System.out.println("=========================");
    }
}
