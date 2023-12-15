//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String N = sc.next ();

            if (new Sol().balancedNumber (N))
    		    System.out.println (1);
    		else
    		    System.out.println (0);
        }
        
    }
}
// } Driver Code Ends




//User function Template for Java

class Sol
{
    Boolean balancedNumber(String N)
    {
        // your code here 
        int sum1 =0;
        for(int i=0;i<N.length()/2;i++){
            int digit = Integer.parseInt(String.valueOf(N.charAt(i)));
            sum1+=digit;
        }
        
        int sum2 =0;
        for(int i=(N.length()/2)+1;i<N.length();i++){
            int digit = Integer.parseInt(String.valueOf(N.charAt(i)));
            sum2+=digit;
        }
        if(sum1==sum2){
            return true;
        }
        return false;
    }
}