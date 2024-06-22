package Striver_DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting012 {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        /*
         * Bruteforce - using sort method
         * better approach - using counters [time and space complexity = O(2n), O(1)]
         * optimal approach - DNF Algorithm [time and space complexity = O(N), O(1)]
         */
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                Collections.swap(arr, low, mid);
                mid++;
                low++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                Collections.swap(arr, mid, high);
                high--;
            }
        }
    }
        public static void main(String args[]) {
            int n = 6;
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
            sortArray(arr, n);
            System.out.println("After sorting:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();

        }
}
