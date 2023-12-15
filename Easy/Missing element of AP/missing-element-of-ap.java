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

            int ans = new Solution().findMissing(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




//User function Template for Java


class Solution {
    int findMissing(int[] arr, int n) {
        int d = (arr[n-1] - arr[0]) / n; // Calculate the common difference

        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i-1] != d) {
                return arr[i-1] + d; // Found the missing number
            }
        }
        return -1; // No missing number found
    }
}