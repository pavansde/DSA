package Striver_DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static int getLongestSubarrayBruteforce(int []a, long k) {
        /*
        * Time complexity = O(N^3)
        * Space complexity = O(1)*/
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            long s=0;
            for (int j = i; j < n; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
//                long s = 0;
//                for (int K = i; K <= j; K++) { we can remove K loop to achieve O(N^2) time complexity
//                    s += a[K];
//                }
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    static int getLongestSSubarrayOptimized(int arr[], int k)
    {
        /*
         * Time complexity = O(2N)
         * Space complexity = O(1)*/
        int n= arr.length;

        int left=0, right =0;
        int sum = arr[0]; int maxLen=0;
        while(right<n)
        {
            while(left<=right && sum>k)
            {
                sum -= arr[left];
                left++;
            }
            if(sum==k)
            {
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n) sum+=arr[right];
        }
        return maxLen;
    }
    static int getLongestSubarrayPosAndNegValues(int arr[],int k)
    {
        /*
         * Time complexity = O(N)
         * Space complexity = O(N)
         */
        int n = arr.length;
        Map<Long, Integer> prefixSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (prefixSumMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - prefixSumMap.get(sum - k));
            }

            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {1,1,-1};
        int k = 1;

        System.out.println("Bruteforce Approach");
        int len = getLongestSubarrayBruteforce(a, k);
        System.out.println("The length of the longest subarray is: " +len);
        System.out.println("Optimized Approach");
        int len1 = getLongestSSubarrayOptimized(a,k);
        System.out.println("The length of the longest subarray is: " +len1);
        System.out.println("Optimized Approach for Positive and Negative Values");
        int len2 = getLongestSubarrayPosAndNegValues(a,k);
        System.out.println("The length of the longest subarray is: " +len2);
    }
}
