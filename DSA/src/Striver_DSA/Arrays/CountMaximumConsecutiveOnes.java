package Striver_DSA.Arrays;

public class CountMaximumConsecutiveOnes {
    static int countMaximumConsecutiveOnes(int arr[])
    {
        /*
        * Time complexity = O(N)
        * Space complexity = O(1)
        */
        int counter=0;
        int prevCounter=0;
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                counter++;
            } else if (arr[i] == 0) {
//                prevCounter = counter;
                counter=0;
            }
            prevCounter = Math.max(prevCounter,counter);
        }
        return prevCounter;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,1,1};
        int output = countMaximumConsecutiveOnes(arr);
        System.out.println(output);
    }
}
