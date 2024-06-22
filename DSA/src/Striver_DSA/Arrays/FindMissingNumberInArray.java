package Striver_DSA.Arrays;

public class FindMissingNumberInArray {
    static int missingNumberBruteforce(int[] arr, int n)
    {
        /*
         * Time complexity = O(N^2)
         * Space complexity = O(1)
         */
        for(int i=1;i<=n;i++)
        {
            int flag=0;
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]==i)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }
    static int missingNumberOptimized(int arr[],int n)
    {
        /*
         * Time complexity = O(N)
         * Space complexity = O(1)
         */
        int sum=0;
        int expectedSum=(n*(n+1))/2;
        for(int i: arr)
        {
            sum+=i;
        }
        return expectedSum-sum;
    }
    public static void main(String[] args) {
        int n=5;
        int arr[] = {1,2,3,5};
        System.out.println("Bruteforce Approach");
        System.out.println(missingNumberBruteforce(arr,n));
        System.out.println("Optimized Approach");
        System.out.println(missingNumberOptimized(arr,n));
    }
}
