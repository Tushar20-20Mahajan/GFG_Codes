//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends



// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        int p = -1;
        int q = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                if (q != -1 && i - q < minDistance) {
                    minDistance = i - q;
                }
                p = i;
            } else if (a[i] == y) {
                if (p != -1 && i - p < minDistance) {
                    minDistance = i - p;
                }
                q = i;
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            return -1; // Elements x and y not found
        }

        return minDistance;
    }
}