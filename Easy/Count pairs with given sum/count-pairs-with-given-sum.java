//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



//User function Template for Java
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        int lp = 0;
        int rp = n - 1;
        Arrays.sort(arr);

        while (lp < rp) {
            if (arr[lp] + arr[rp] == k) {
                count++;

                // Handle duplicate elements on the left side
                int left = lp + 1;
                while (left < rp && arr[left] == arr[lp]) {
                    count++;
                    left++;
                }

                // Handle duplicate elements on the right side
                int right = rp - 1;
                while (right > lp && arr[right] == arr[rp]) {
                    count++;
                    right--;
                }

                lp++;
                rp--;
            } else if (arr[lp] + arr[rp] > k) {
                rp--;
            } else {
                lp++;
            }
        }

        return count;
    }
}
