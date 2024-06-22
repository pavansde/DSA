package Striver_DSA.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfSortedArray {
    static int[] unionOfSortedArray(int[] a, int[] b)
    {
        Set<Integer> set = new TreeSet<>();
        int n1 = a.length; int n2 = b.length;
        for(int i=0;i<n1;i++)
        {
            set.add(a[i]);
        }
        for(int i=0;i<n2;i++)
        {
            set.add(b[i]);
        }

        int[] union = new int[set.size()];
        int i=0;
        for(int it : set)
        {
            union[i++] = it;
        }
        return union;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,6};
        int arr2[] = {2,3,5};
        int[] result = unionOfSortedArray(arr1,arr2);
        for(int i:result)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
