//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    static String findLargest(int N, int S){
        // code here
        if(S==0 && N==1){
            return "0";
            
        }
        if(S<1 || S > 9*N){
            return "-1"; // Impossible to find the largest number according to the given condistions.
            
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<N;i++){
            for(int digit = 9 ; digit >= 0 ;digit--){
                if(S>=digit){
                    str.append(digit);
                    S-=digit;
                    break;
                }
            }
        }
        return str.toString();
    }
}