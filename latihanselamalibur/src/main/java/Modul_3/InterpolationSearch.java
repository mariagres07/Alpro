package Modul_3;

public class InterpolationSearch {

    public static int SequentialSearch(int[] marklee, int toFind) {
        for (int i = 0; i < (marklee.length); i++) {
            if (toFind == marklee[i]);
            return i;
        }
        return -1;

    }

    public static int BinarySearch(int[] marklee, int toFind) {
        int dataAwal = 0;
        int dataAkhir = marklee.length - 1;
        int mid = (dataAwal + dataAkhir) / 2;

        while (dataAwal <= dataAkhir) {
            if (toFind == marklee[mid]) {
                return mid;
            }
            if (toFind < marklee[mid]) {
                return dataAkhir = mid - 1;
            } else if (toFind > marklee[mid]) {
                return dataAwal = mid + 1;
            }

        }
        return -1;
    }

    public static int interpolationSearch(int[] marklee, int toFind) {
        int low = 0;
        int high = marklee.length - 1;
        int mid = low + ((toFind - marklee[low]) * (high - low)) / (marklee[high] - marklee[low]);

        while (low <= high) {
            if (toFind == marklee[mid]) {
                return mid;
            }
            if (toFind < marklee[mid]) {
                return high = mid - 1;
            } else if (toFind > marklee[mid]) {
                return low = mid + 1;
            }

        }
        return -1;
    }

    public static void BubleSortAscending(int[] marklee) {
        for (int i = 0; i < marklee.length - 1; i++) {
            for (int m = 0; m < marklee.length - 1 - i; m++) {
                if (marklee[m] < marklee[m + 1]) {
                    int lala = marklee[m];
                    marklee[m] = marklee[m + 1];
                    marklee[m + 1] = lala;
                }
            }
        }
        for (int i = 0; i < marklee.length; i++) {
            System.out.printf("%4d", marklee[i]);
        }
        System.out.println("");

    }

    public static void BubleSortDescending(int[] marklee) {
        for (int i = 0; i < marklee.length - 1; i++) {
            for (int m = 0; m < marklee.length - 1 - i; m++) {
                if (marklee[m] > marklee[m + 1]) {
                    int lala = marklee[m];
                    marklee[m] = marklee[m + 1];
                    marklee[m + 1] = lala;
                }
            }
        }
        for (int i = 0; i < marklee.length; i++) {
            System.out.printf("%4d", marklee[i]);
        }
        System.out.println("");
    }

    public static void SelectionSortDescending(int[] marklee) {
        int low;
        int change;

        for (int i = 0; i < marklee.length; i++) {
            low = 1;
            for (int m = 1; m < marklee.length; m++) {
                if (marklee[low] < marklee[m]) {
                    low = m;
                }
            }
            change = marklee[i];
            marklee[i] = marklee[low];
            marklee[low] = change;
        }
        for (int i = 0; i < marklee.length; i++) {
            System.out.printf("%4d", marklee[i]);
        }
        System.out.println("");

    }
    
    public static void SelectionSortAscending(int[] marklee) {
        int low;
        int change;

        for (int i = 0; i < marklee.length; i++) {
            low = 1;
            for (int m = 1; m < marklee.length; m++) {
                if (marklee[low] > marklee[m]) {
                    low = m;
                }
            }
            change = marklee[i];
            marklee[i] = marklee[low];
            marklee[low] = change;
        }
        for (int i = 0; i < marklee.length; i++) {
            System.out.printf("%4d", marklee[i]);
        }
        System.out.println("");

    }
}
    

