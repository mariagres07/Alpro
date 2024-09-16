package com.mycompany.latiahan1;

public class soalno1 {

    public static void main(String[] args) {
        
        for (int i = 1 ; i <= 10 ; i = i +2){    
            for (int j = 8 ; j >= i ; j = j -2){    
                System.err.print(" ");
                for (int k = 1 ; k <= i ; k++){     
                    System.out.println("*");
                    System.out.println();
                }
            }
        }
    }
}

