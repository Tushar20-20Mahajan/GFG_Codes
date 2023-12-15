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
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends



//User function Template for Java

class Solution {
    static Long reversedBits(Long x) {
        // code here
        String s1 = Long.toBinaryString(x);
        int k =32-s1.length();
        String s2 ="";
        
        for(int i=0;i<k;i++){
            s2+='0';
        }
        String st = s2+s1;
        
        StringBuilder str=new StringBuilder(st);
        str.reverse();
        java.math.BigInteger ans = new java.math.BigInteger(str.toString(),2);
        return ans.longValue();
    }
};