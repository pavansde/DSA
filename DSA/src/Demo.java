// import Arrays.Final450_4_Sorting012;
import ArraysLoveBabbar.*;

public class Demo {
    //  static Final450_4_Sorting012 sorting012 = new Final450_4_Sorting012();
    public static void main(String[] args){
        // int arr[] = {0,1,2,1,0,2,1,0,2,1};
        // sorting012.sorting(arr);
        int arr[] = {1, 2, -3, -1, -2, 3};
        // Final450_5_ALternateNumbers.sortAlternateNumbers(arr);
        int cyclicArr[] = Final450_7_CircularRotate.cyclicRotate(arr);
        for(int i=0;i<cyclicArr.length;i++)
        {
            System.out.print(cyclicArr[i]+" ");
        }
        System.err.println();
    }
}
