//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends




//User function Template for Java
// class Solution {
//     static int findMaxLen(String S) {
//         // code here
//     }
// };



//User function Template for Java
//import java.util.Stack;


class Solution {
    static int findMaxLen(String s) {
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
};