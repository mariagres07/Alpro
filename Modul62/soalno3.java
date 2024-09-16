package Modul62;

public class soalno3 {
    public static void main(String[] args) {
        
        int sukuFibonacci = 0;
        int sukuFibonacci1 = 1;
        int sukuFibonacci2 = 1;
        
        for (int i = 0; i <= 20; i++) {
            System.out.print(sukuFibonacci1 + ", ");
            sukuFibonacci = sukuFibonacci1 + sukuFibonacci2;
            sukuFibonacci1 = sukuFibonacci2;
            sukuFibonacci2 = sukuFibonacci;

        }
    }
}
