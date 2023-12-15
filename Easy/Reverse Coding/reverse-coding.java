//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);

            Solution ob = new Solution();
            System.out.println(ob.sumOfNaturals(n));
        }
    }
}
// } Driver Code Ends




//User function Template for Java
class Solution {
    static int sumOfNaturals(int n) {
        // code here
        java.math.BigInteger a = java.math.BigInteger.valueOf(n);
        java.math.BigInteger b = a.add(java.math.BigInteger.ONE);
        java.math.BigInteger c = a.multiply(b);
        java.math.BigInteger d = c.divide(java.math.BigInteger.TWO);
        java.math.BigInteger e = java.math.BigInteger.valueOf(1000000007);
        java.math.BigInteger ans = d.mod(e);
        return ans.intValue();
    }
};