package Sorting;

public class SelectionSorting { //time complexity - O(n^2)
    static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int mini = i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[mini])  mini =j;
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }    
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        selectionSort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
