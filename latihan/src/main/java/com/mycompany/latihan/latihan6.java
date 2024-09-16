package com.mycompany.latihan;


public class latihan6 {
    public static void main(String[] args) {
        for (int bil = 0; bil <= 50; bil++){
            if (bil % 3 == 0) {
                System.out.println("fizz");
            } else if (bil % 5 == 0){
                System.out.println("buzz");
            } else if (bil % 3 == 0 && bil % 5 == 0){
                System.out.println("fizzbuzz");
            } else {
                System.out.println(bil);
        }
    }
    }
}
