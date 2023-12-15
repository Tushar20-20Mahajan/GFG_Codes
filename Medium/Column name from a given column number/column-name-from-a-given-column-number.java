//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends




//User function Template for Java

class Solution {
    String colName(long n) {
        StringBuilder result = new StringBuilder();
        
        while (n > 0) {
            n--; // Subtract 1 because Excel columns start with 'A' at 1, not 0.
            char currentChar = (char) ('A' + (n % 26));
            result.append(currentChar);
            n /= 26;
        }
        result.reverse();
        return result.toString();
    }
}