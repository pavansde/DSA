package Striver_DSA.Arrays;

public class LeftRotateTheArrayByOne {
    static int[] leftRotateTheArrayByOne(int arr[],int n)
    {
        /*
        * Time complexity - O(N)
        * Space complexity = O(1)
        */
        int temp = arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        leftRotateTheArrayByOne(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
