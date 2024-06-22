public class Final450_5_ALternateNumbers {

    public static int[] sortAlternateNumbers(int arr[])
    {
        int n = arr.length;
        int res[] = new int[n];
        int posIndex=0;int negativeIndex=1;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                res[negativeIndex] = arr[i];
                negativeIndex+=2;
            }
            else{
                res[posIndex] = arr[i];
                posIndex+=2;
            }
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();
        return res;
    }
}