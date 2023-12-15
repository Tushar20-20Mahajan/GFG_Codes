//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

    
            long ans = new Solution().maxProduct(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends




//User function Template for Java



class Solution {
    long maxProduct(int[] arr, int n) {
        if (n < 3) {
            return -1; // Handle the case when the array has less than three elements
        }

        Arrays.sort(arr);

        // Consider two cases: either the product of the three largest elements
        // or the product of two smallest (negative) elements and the largest element.
        long product1 = (long) arr[n - 1] * arr[n - 2] * arr[n - 3];
        long product2 = (long) arr[0] * arr[1] * arr[n - 1];

        return Math.max(product1, product2);
    }
}