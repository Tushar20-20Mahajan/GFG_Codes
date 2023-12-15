//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine()); 

        while(t > 0){
  
            String x = br.readLine(); 
            
            Solution ob = new Solution();
		
            System.out.println(ob.xmod11(x)); 

            t--;
        }
    } 
} 



// } Driver Code Ends



//User function Template for Java

class Solution 
{ 
    static int xmod11(String x)
	{    
	    // code here
	    java.math.BigInteger a = new java.math.BigInteger(x);
	    return a.mod(java.math.BigInteger.valueOf(11)).intValue();
        
	}
} 