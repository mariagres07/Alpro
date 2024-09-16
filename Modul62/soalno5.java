package Modul62;

public class soalno5 {
    public static void main(String[] args) {
        double x1 = 1.5, x2 = 2.75;
        double fungsi1, fungsi2;
        int i = 1;
        double a = 0;
        double sum1 = a, sum2 = a;
        
        while (i < 20) {            
            if (i % 2 == 1) {
                sum1 += ((a / i) + Math.sin((i * x1)));
                sum2 += ((a / i) + Math.sin((i * x2)));
            }
            i++;
        }
        
        fungsi1 = 1/2 - 2/3.14 * sum1;
        fungsi2 = 1/2 - 2/3.14 * sum2;
        
        System.out.println("Fungsi dari x1 = " + fungsi1);
        System.out.println("Fungsi dari x2 = " + fungsi2);
        
    }
}
