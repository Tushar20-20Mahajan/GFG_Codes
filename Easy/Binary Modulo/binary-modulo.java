//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			String s = str[0];
			int m = Integer.parseInt(str[1]);
			Solution obj = new Solution();
			System.out.println(obj.modulo(s,m));
		}
	}
}

// } Driver Code Ends




//User function Template for Java

// class Solution{
// 	int modulo(String s, int m) {
// 		//Write your code here
// 		int a = Integer.parseInt(s,2);
// 		return a%m;
// 	}
// }


//import java.math.BigInteger;

class Solution {
    int modulo(String s, int m) {
        java.math.BigInteger a = new java.math.BigInteger(s, 2);
        return a.mod(java.math.BigInteger.valueOf(m)).intValue();
    }
}