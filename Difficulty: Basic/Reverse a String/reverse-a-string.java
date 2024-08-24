//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder s = new StringBuilder(str);
        int lp = 0;
        int rp = str.length()-1;
        reverse(s,lp,rp);
        return s.toString();
    }
    public static void reverse(StringBuilder s,int lp,int rp){
        if(lp>=rp){
            return;
        }
        char temp = s.charAt(lp);
        s.setCharAt(lp,s.charAt(rp));
        s.setCharAt(rp,temp);
        reverse(s,lp+1,rp-1);
    }
}