package Striver_DSA.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class LargestElement {
    static int largestElement(int[] arr, int n) {
        /*optimized approach
            Time complexity - O(N)
            Space Complexity - O(1)
        */
        int high = arr[0];

        for(int i=0;i<n; i++)
        {
            if(arr[i]>high)
            {
                high = arr[i];
            }
        }
        return high;
    }

    static int largestElement_BruteForce(int[] arr, int n)
    {
        /*
        Time Complexity - O(N logN)
        Space Complexity - O(1)
         */
        Arrays.sort(arr);
        return arr[n-1];
    }

    public static void main(String[] args) {
        int arr[] = {5,4,12,45,10};
        int n = arr.length;
        System.out.println("Largest Element is: "+largestElement(arr,n));

        System.out.println("Largest Element is: "+largestElement_BruteForce(arr,n));
    }
}
