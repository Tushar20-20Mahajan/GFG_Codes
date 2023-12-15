//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends





class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String S) {
        StringBuilder sb = new StringBuilder(S);
        sb.reverse();

        String[] reverse = sb.toString().split("\\.");
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < reverse.length; i++) {
            StringBuilder word = new StringBuilder(reverse[i]);
            word.reverse();
            finalString.append(word);
            if (i != reverse.length - 1) {
                finalString.append(".");
            }
        }

        return finalString.toString();
    }
}