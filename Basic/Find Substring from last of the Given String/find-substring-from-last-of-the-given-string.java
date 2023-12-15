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
            
            String input[] = read.readLine().split(" ");
            String x = input[0];
            String y = input[1];
            Solution ob = new Solution();
            System.out.println(ob.search(x, y));
        }
    }
}
// } Driver Code Ends



//User function Template for Java

class Solution {
    int search(String S, String pat) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int index = S.indexOf(pat);
        while (index != -1) {
            list.add(index + 1);
            index = S.indexOf(pat, index + 1);
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list.get(list.size()-1);
    }
}