//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.minRow(N, M, A));
        }
    }
}

// } Driver Code Ends



// User function Template for Java

// class Solution {
//     int minRow(int n, int m,int Mat[][]) {
//         // code here
//         int k=-1;
//         int maxCount = 0;
        
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=0;j<m;j++){
//                 if(Mat[i][j]==1){
//                     count++;
//                 }
                
//             }
//             if(count < maxCount){
//                 maxCount=count;
//                 k=i;
//             }
//         }
//         return k;
//     }
// };

class Solution {
    int minRow(int n, int m, int Mat[][]) {
        int k = -1; // Initialize with -1 to indicate no row found yet
        int maxCount = m; // Initialize with a value greater than the maximum possible count
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (Mat[i][j] == 1) {
                    count++;
                }
            }
            
            if (count < maxCount) {
                maxCount = count;
                k = i;
            }
        }
        
        return k+1;
    }
}