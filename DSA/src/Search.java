public class Search{
    public static int linearSearch(int arr[], int value)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(value==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[],int value)
    {
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==value)
            {
                return mid;
            }
            else if(arr[mid]<value)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int arr[],int value, int low, int high)
    {
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==value)
            {
                return mid;
            }
            else if(arr[mid]<value)
            {
                return binarySearchRecursion(arr, value, mid+1, high);
            }
            else{
                return binarySearchRecursion(arr, value, low, mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int list[]={3,4,5,6,7,8,9};
        int value = 8;
        int low = 0;
        int high = list.length-1;
        System.out.println(linearSearch(list,value));
        System.out.println(binarySearch(list, value));
        System.out.println(binarySearchRecursion(list, value, low, high));
    }
}