package Sorting;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

    static void qs(List<Integer> arr, int low, int high)
    {
        if(low<high)
        {
            int pIndex = partition(arr,low,high);
            qs(arr,low,pIndex-1);
            qs(arr,pIndex+1,high);
        }
    }

    private static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while(i<j)
        {
            while(arr.get(i)<=pivot && i<=high-1)
            {
                i++;
            }
            while(arr.get(j)>pivot && j>=low+1)
            {
                j--;
            }
            if(i<j) Collections.swap(arr, i, j);
        }
        Collections.swap(arr, low, j);
        return j;
    }
    public static List<Integer> quickSort(List<Integer> arr){
        // Write your code here.
        qs(arr, 0, arr.size()-1);
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4,6,2,5,7,9,1,3);

        System.out.println("Before Sorting: ");
        for(int num : arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        arr = quickSort(arr);
        System.out.println("After Quick Sort: ");
        for(int num : arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

    }
    
}
