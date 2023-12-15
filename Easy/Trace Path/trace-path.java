//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String srgs[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s1[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(n, m, s));
        }
    }
}
// } Driver Code Ends




// User function Template for 



// User function Template for 

class Solution{
    static int isPossible(int n, int m, String s){
        // code here
        int c1=0,c2=0,c3=0,c4=0;
        int l,r,u,d;
        l=r=u=d=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='L')
                c1--;
           else if(c=='R')
                c1++;
              else if(c=='U')
                c2++;
                else if(c=='D')
                c2--;
             l=Math.min(l,c1);
             r=Math.max(r,c1);
               u= Math.max(u,c2);
            d=Math.min(d,c2);
        }
          int colLength = r - l+ 1;
        int rowLength = u - d + 1;
        if(m < colLength || n < rowLength) return 0;
        return 1;
    }
}