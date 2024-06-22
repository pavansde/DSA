package ArraysLoveBabbar;

import java.util.Arrays;

public class Final450_3_KthSmallest {
    /*
     * Input:
        n = 6
        arr[] = 7 10 4 3 20 15
        k = 3
        l=0 r=5

        Output : 
        7

        Explanation :
        3rd smallest element in the given 
        array is 7.

        different ways to achieve
        -> sorting method [time and space complexity = O(n logn),O(1)]
        -> Binary Search approach [time and space complexity = O(n + klogn),O(1)]
     */
    public static int kthSmallest(int arr[],int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static int kthSmallestBinarySearch(int[] arr, int k)
    {
        int low = Arrays.stream(arr).min().getAsInt();
        int high = Arrays.stream(arr).max().getAsInt();

        while(low<high)
        {
            int mid = low + (high-low)/2;
            int count = 0;
            for(int num : arr)
            {
                if(num<=mid)
                {
                    count++;
                }
            }
            if(count<k)
            {
                low=mid+1;
            }
            else
                high=mid;
        }
        return low;
    }

     public static void main(String[] args) {
        int arr[] = {7,10,4,3,20,15};
        int k=3;

        System.out.println(kthSmallestBinarySearch(arr, k));
        
     }
}
