package Hashing;

import java.util.Scanner;

public class HashingChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        //precompute
        int hash[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i) - 'a']++;
        }

        int q = scan.nextInt();
        while(q-- != 0)
        {
            char c;
            c = scan.next().charAt(0);
            //fetch
            System.out.println(hash[c - 'a']);
        }
    }
    
}
