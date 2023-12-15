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
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends




//User function Template for Java



//User function Template for Java
//import java.util.Stack;


class Solution {
    static int maxLength(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Add a dummy index to handle the edge case
        
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else { // Closing parenthesis encountered
                stack.pop();
                
                if (stack.isEmpty()) {
                    stack.push(i); // Add the index of the current closing parenthesis
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}