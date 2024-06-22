package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Highest_LowestFrequencyHashmap {
    public static void main(String[] args) {
        int input[] = {10,5,10,15,10,5};
        int n = input.length;
        
        //pre-computing
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            // int key = input[i];
            // if(mp.containsKey(key))
            // {
            //      mp.put(key, mp.get(key)+1);
            // }
            // else
            // mp.put(key, 1);
            int key = input[i];
            int freq = 0;
            if(mp.containsKey(key)) freq = mp.get(key);
            freq++;
            mp.put(key, freq);
        }

        System.out.println("frequencies are:");
        int maxFreq = 0, minFreq = n;
        int maxELe = 0, minEle = 0;

        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            int count = entry.getValue();
            int element = entry.getKey();

            if(count>maxFreq)
            {
                maxELe = element;
                maxFreq = count;
            }

            if(count<minFreq)
            {
                minEle = element;
                minFreq = count;
            }
        }
        System.err.println("Highest Frequency: "+maxELe);
        System.out.println("Lowest Frequency: "+minEle);
    }   
}
