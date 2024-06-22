package Striver_DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZerosToTheEndOfTheArray {
    static void moveAllTheZeros_Bruteforce(int arr[])
    {
        /*
        * Time complexity = O(N)
        * Space complexity = O(N)
        */
        int n = arr.length;

        List<Integer> temp = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp.add(arr[i]);
            }
        }
        int nz= temp.size();
        for(int i=0;i<nz;i++)
        {
            arr[i] = temp.get(i);
        }

        for(int i=nz;i<n;i++)
        {
            arr[i] = 0;
        }
//        Printing all the elements
        for(int num :arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    static void moveAllTheZeros(int arr[])
    {
        /*
        * Time complexity = O(N)
        * Space complexity = O(1)*/
        int n= arr.length;
        int nzIndex=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[nzIndex++] = arr[i];
            }
        }
        while(nzIndex<n)
        {
            arr[nzIndex++] = 0;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
        int[] arrBruteforce = arr.clone();
        moveAllTheZeros_Bruteforce(arrBruteforce);
        System.out.println("Optimized Approach");
        int[] arrOptimized = arr.clone();
        moveAllTheZeros(arrOptimized);
    }
}
