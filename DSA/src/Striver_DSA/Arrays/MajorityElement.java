package Striver_DSA.Arrays;

public class MajorityElement {
    public static int findMajorityBruteforce(int[] arr) {
        /*
        * Time complexity = O(N^2)
        * Space complexity = O(1)
        */
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int counter =0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==arr[i])
                {
                    counter++;
                }
            }
            if(counter > (n/2))
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static int findMajority(int[] arr)
    {
        /*
        * Time Complexity: O(N) + O(N), where N = size of the given array.
        Reason: The first O(N) is to calculate the count and find the expected majority element. The second one is to check if the expected element is the majority one or not.

        Note: If the question states that the array must contain a majority element, in that case, we do not need the second check. Then the time complexity will boil down to O(N).

        Space Complexity: O(1) as we are not using any extra space.
        */
        int n= arr.length;
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count=1;
                ele = arr[i];
            }
            else if(arr[i] == ele)  count++;
            else count--;
        }
       return ele;
//        int count1=0;
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]==ele) count1++;
//        }
//        if(count1>(n/2))
//        {
//            return ele;
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = findMajorityBruteforce(arr);
        System.out.println("The majority element is: " + ans);
        int ans1 = findMajority(arr);
        System.out.println("The majority element is: " + ans1);
    }
}
