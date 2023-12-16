//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
        // code here
        
        // Long a = Long.parseLong(X);
        // Long b = Long.parseLong(Y);
        
        // Long sum = a+b;
        
        // String abc = Long.toString(sum);
        // return abc;
        
        java.math.BigInteger a = new java.math.BigInteger(X);
        java.math.BigInteger b = new java.math.BigInteger(Y);
        java.math.BigInteger result = a.add(b);
        return result.toString();
        
    }
}