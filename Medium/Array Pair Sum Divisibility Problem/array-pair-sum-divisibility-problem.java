//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends




// User function Template for Java



class Solution {
    public boolean canPair(int[] nums, int k) {
        // Count the frequency of remainders when divided by k
        HashMap<Integer, Integer> remainderCount = new HashMap<>();
        
        for (int num : nums) {
            int remainder = num % k;
            
            // Update the frequency of the current remainder
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }
        
        for (int num : nums) {
            int remainder = num % k;
            
            if (remainder == 0) {
                // If the current number is divisible by k, it should occur even number of times
                if (remainderCount.getOrDefault(0, 0) % 2 != 0) {
                    return false;
                }
            } else if (2 * remainder == k) {
                // If the current remainder is half of k, it should occur even number of times
                if (remainderCount.getOrDefault(remainder, 0) % 2 != 0) {
                    return false;
                }
            } else {
                // Check if the current remainder has a corresponding complementary remainder
                int complement = k - remainder;
                if (remainderCount.getOrDefault(remainder, 0) != remainderCount.getOrDefault(complement, 0)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}