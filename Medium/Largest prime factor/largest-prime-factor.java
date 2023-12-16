//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution {
    static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    static long largestPrimeFactor(int n) {
        ArrayList<Long> list = new ArrayList<>();
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime((int) i) == 1) {
                while (n % i == 0) {
                    list.add(i);
                    n /= i;
                }
            }
        }
        if (n > 1) {
            list.add((long) n);
        }
        return list.get(list.size() - 1);
    }
}