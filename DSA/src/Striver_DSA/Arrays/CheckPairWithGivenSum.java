package Striver_DSA.Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckPairWithGivenSum {
    static int[] checkPairWithGivenSum(int n,int arr[],int target)
    {
        /*
        * Time complexity = O(N^2)
        * Space complexity = O(1)*/
        int[] ans= new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if((arr[i]+arr[j])==target)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int[] twoSumOptimized( int n,int[] arr,int target)
    {
        /*
        * Time complexity = O(N)
        * Space complexity = O(N)*/
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int complement = target - arr[i];
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int n=5;
        int arr[]= {2,6,5,8,11};
        int target = 15;
        int[]ans=checkPairWithGivenSum(n,arr,target);
        System.out.println("Indices: " + ans[0] + ", " + ans[1]);
        int[] result = twoSumOptimized(n, arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
