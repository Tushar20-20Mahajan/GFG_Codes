//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}

// } Driver Code Ends




//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            //code here.
            if(s.length()==1){
                return s;
            }
            int sum =0;
            ArrayList<Character> list = new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='0' && s.charAt(i)<='9' ){
                    int a = Integer.parseInt(String.valueOf(s.charAt(i)));
                    sum+=a;
                }
                else{
                    list.add(s.charAt(i));
                }
            }
            Collections.sort(list);
            String str = "";
            for(int i=0;i<list.size();i++){
                str+=String.valueOf(list.get(i));
            }
            String abc = Integer.toString(sum);
            str+=abc;
            return str;
        }
}