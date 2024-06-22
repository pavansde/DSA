package Striver_DSA.Arrays;

import java.util.Arrays;

public class SecondLargestElement {
    static int secondLargest_BruteForce(int arr[],int n) {
        /*
        Time Complexity - O(N logN + N(in case all the values are same ))
        Space Complexity = O(1)
         */
        Arrays.sort(arr);
        int secondLargest = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }
    static int secondLargest_BetterApproach(int arr[],int n)
    {
        /*
        Time Complexity - O(2N)
        Space Complexity = O(1)
         */
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>secondLargest && arr[i]!= largest)
            {
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    static int secondLargest_Optimized(int arr[],int n)
    {
         /*
        Time Complexity - O(N)
        Space Complexity = O(1)
         */
        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>largest)
            {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>sLargest) {
                sLargest = arr[i];
            }
        }
        if(sLargest == Integer.MIN_VALUE)
        {
            return -1;
        }
        else return sLargest;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,12,45,10};
        int n = arr.length;
        System.out.println("Largest Element is: "+secondLargest_BruteForce(arr,n));

        System.out.println("Largest Element is: "+secondLargest_BetterApproach(arr,n));

        System.out.println("Largest Element is: "+secondLargest_Optimized(arr,n));
    }
}
