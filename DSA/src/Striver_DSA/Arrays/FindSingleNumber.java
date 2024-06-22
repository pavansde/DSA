package Striver_DSA.Arrays;

public class FindSingleNumber {
    static int findSingleNumberBruteforce(int arr[])
    {
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            /*
             * Time complexity = O(N^2)
             * Space complexity = O(1)
             */
            int num = arr[i];
            int counter = 0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==num)
                {
                    counter++;
                }
            }
            if(counter==1) return num;
        }
        return -1;
    }
    static int getSingleElement(int arr[])
    {
        /*
         * Time complexity = O(N)
         * Space complexity = O(1)
         */
        int n=arr.length;
        int xor = 0;
        for(int i=0;i<n;i++)
        {
            xor = xor ^ arr[i];
        }
        return xor;
    }


    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("Bruteforce Approach");
        int ans1 = findSingleNumberBruteforce(arr);
        System.out.println(ans1);
        System.out.println("Optimized Approach");
        int ans2 = getSingleElement(arr);
        System.out.println(ans2);
    }
}
