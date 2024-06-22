package ArraysLoveBabbar;

public class Final450_7_CircularRotate {
    public static int[] cyclicRotate(int arr[])
    {
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }        
        arr[0] = temp;

        return arr;
    }
}
