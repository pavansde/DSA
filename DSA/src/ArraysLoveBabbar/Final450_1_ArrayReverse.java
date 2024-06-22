package ArraysLoveBabbar;
public class Final450_1_ArrayReverse {
    /*
     * original array = {1,2,3}
     * reversed array = {3,2,1}
     * 
     * different ways to achieve
     * -> using an extra array [time and space complexity = O(n)]
     * -> using a two pointer [time and space complexity = O(n),O(1)]
     */

     public static void reverseArrayExtraArray(int arr[])
     {
        int revArr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            revArr[i] = arr[arr.length-i-1];
        }

        for(int i: revArr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
     }

     public static void reverseArrayUsingTwoPointer(int arr[])
     {
        int low = 0;
        int high = arr.length-1;
        int temp;
        while(low<high)
        {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
     }
     public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArrayExtraArray(arr);
        reverseArrayUsingTwoPointer(arr);
     }
    
}
