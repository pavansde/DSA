package ArraysLoveBabbar;
public class Final450_2_MaxAndMin{
    /*
     * array = {3,5,4,1,9}
     * minimum = 1
     * maximum = 9
     * 
     * different ways to achieve
     * -> simple linear search approach [time and space complexity = O(n),O(1)]
     * -> Tournament Approach [time and space complexity = O(n),O(logn)]
     */

     public static int[] minAndMax(int arr[])
     {
        if(arr==null || arr.length==0)
        {
            return new int[]{-1};
        }

        int low = arr[0];
        int high = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>high)
            {
                high=arr[i];
            }
            if(arr[i]<low){low=arr[i];}
        }
        return new int[]{low,high};
     }

     public static int[] tournamentMinAndMax(int arr[],int low, int high)
     {
         if(low == high)
         {
            return new int[]{arr[low],arr[low]};
         }
         if(high==low+1)
         {
            if(arr[high]>arr[low])
            {
                return new int[]{arr[low],arr[high]};
            }
            return new int[]{arr[high],arr[low]};
         }

         int mid = (low+high)/2;

         int[] leftResult = tournamentMinAndMax(arr,low,mid);
         int[] rightResult = tournamentMinAndMax(arr, mid+1, high);

         int min,max;

        //  int max = Math.max(leftResult[1], rightResult[1]);
        //  int min = Math.min(leftResult[0],rightResult[0]);
        
        // Determine the maximum value
        if (leftResult[1] > rightResult[1]) {
            max = leftResult[1];
        } else {
            max = rightResult[1];
        }

        // Determine the minimum value
        if (leftResult[0] < rightResult[0]) {
            min = leftResult[0];
        } else {
            min = rightResult[0];
        }

         return new int[]{min,max};

     }
     public static void main(String[] args) {
        int values[]={4,2,6,1};
        int [] results = minAndMax(values);
        System.out.println("max: "+results[1]);
        System.out.println("Min: "+results[0]);

        int [] results1 = tournamentMinAndMax(values,0,values.length-1);
        System.out.println("max: "+results1[1]);
        System.out.println("Min: "+results1[0]);
        }
}