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
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int k = n;
        int count = 0;
        
        while (k > 0) {
            int digit = k % 10;
            if (digit != 0 && n % digit == 0) {
                count++;
            }
            k = k / 10;
        }
        
        return count;
    }
}
