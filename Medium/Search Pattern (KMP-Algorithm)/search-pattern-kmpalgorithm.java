//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            if(res.size()==0)
                System.out.print(-1);
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String S) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = S.indexOf(pat);
        while (index != -1) {
            list.add(index + 1);
            index = S.indexOf(pat, index + 1);
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
}