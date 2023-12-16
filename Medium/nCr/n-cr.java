//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends



// User function Template for Java
//import java.math.BigInteger;

class Solution {
    static java.math.BigInteger fact(int n) {
        if (n == 0 || n == 1) {
            return java.math.BigInteger.ONE;
        }
        return java.math.BigInteger.valueOf(n).multiply(fact(n - 1));
    }

    static int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }
        java.math.BigInteger n_fact = fact(n);
        java.math.BigInteger r_fact = fact(r);
        java.math.BigInteger n_r_fact = fact(n - r);

        java.math.BigInteger ans = n_fact.divide(r_fact.multiply(n_r_fact));
        java.math.BigInteger a = ans.mod(java.math.BigInteger.valueOf(1000000007));
        return a.intValue();
    }
}