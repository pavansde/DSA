package Hashing;
import java.util.HashMap;
import java.util.Scanner;

public class HashingExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }

        //pre computing
        // int hash[] = new int[13];
        // for(int i=0;i<n;i++)
        // {
        //     hash[arr[i]] += 1;
        // }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key = arr[i];
            int freq = 0;
            if(mp.containsKey(key)) freq = mp.get(key);
            freq++;
            mp.put(key, freq);
        }


        int q = scan.nextInt();
        while(q-- != 0)
        {
            int number;
            number = scan.nextInt();
            //fetching
            // System.out.println(hash[number]);
            if(mp.containsKey(number)) System.out.println(mp.get(number));
            else System.out.println(0);

        }
    }
    
}
