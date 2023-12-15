//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends



//User function Template for Java


class Solution {
    String printLargest(String[] arr) {
        // code here
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        
        // Implement a custom comparator
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String s1 = a + b;
                String s2 = b + a;
                return s2.compareTo(s1); // Compare in reverse order
            }
        });

        // Handle the case where the input contains only zeros
        if (list.get(0).equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String num : list) {
            result.append(num);
        }
        return result.toString();
    }
}