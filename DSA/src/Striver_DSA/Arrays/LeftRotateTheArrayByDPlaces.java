package Striver_DSA.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class LeftRotateTheArrayByDPlaces {
    static void leftRotate_Bruteforce(int arr[], int n, int d)
    {
        /*
        * Time complexity = O(D)+O(N-D)+O(D) -> O(N+D) ->O(N)
        * Space complexity = O(D)
        */
        d = d%n;
        int temp[] = new int[d];

        for(int i=0;i<d;i++)
        {
            temp[i] = arr[i];
        }

        for(int i=d;i<n;i++)
        {
            arr[i-d] = arr[i];
        }
        for(int i=n-d;i<n;i++)
        {
            arr[i] = temp[i-(n-d)];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void leftRotate(int[] arr, int n, int d) {
        /*
         * Time complexity = O(D)+O(N-D)+O(N) -> O(2N) ->O(N)
         * Space complexity = O(1)
         */
        d=d%n;
        // Reverse the first 'd' elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining 'n-d' elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Helper method to reverse elements in the given range
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 9;
        int[] arrBruteforce = arr.clone();
        leftRotate_Bruteforce(arrBruteforce,n,d);
        System.out.println("Optimized Approach");
        int[] arrOptimized = arr.clone();
        leftRotate(arrOptimized,n,d);
        for(int i=0;i<n;i++)
        {
            System.out.print(arrOptimized[i]+" ");
        }
        System.out.println();
    }
}
