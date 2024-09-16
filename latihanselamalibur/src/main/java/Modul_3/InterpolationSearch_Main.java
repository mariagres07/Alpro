package Modul_3;

import Modul_3.InterpolationSearch;
import java.util.Arrays;

public class InterpolationSearch_Main {

    public static void main(String[] args) {
        int[] marklee = {5, 8, 26, 15, 11, 31};

        System.out.println("Sequential = " + InterpolationSearch.SequentialSearch(marklee, 11));
        Arrays.sort(marklee);//mengurutkan array
        for (int nilai : marklee) {
            System.out.print(nilai + " ");
        }
        System.out.println("");
        System.out.println("Binary = " + InterpolationSearch.BinarySearch(marklee, 11));
        
        System.out.println("");
        System.out.println("Interpolation Search = " + InterpolationSearch.interpolationSearch(marklee, 11));
        
        System.out.println("");
        System.out.print("Buble Sort = ");
        InterpolationSearch.BubleSortAscending(marklee);
        
        System.out.println("");
        System.out.print("Buble Sort = ");
        InterpolationSearch.BubleSortDescending(marklee);
        
        System.out.println("");
        System.out.print("Selection sort = ");
        InterpolationSearch.SelectionSortAscending(marklee);
        
        System.out.println("");
        System.out.print("Selection sort = ");
        InterpolationSearch.SelectionSortDescending(marklee);
        
    }
}


