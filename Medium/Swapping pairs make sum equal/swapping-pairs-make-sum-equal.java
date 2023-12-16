//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends


//User function Template for Java


// class Solution
// {
//     long findSwapValues(long A[], int n, long  B[], int m)
//     {
//         // Your code goes here
//         long sum1 = 0;
//         for(int i=0;i<n;i++){
//             sum1+=A[i];
//         }
//         long sum2 = 0;
//         for(int i=0;i<m;i++){
//             sum2+=B[i];
//         }
        
        
//         Arrays.sort(A);
//         Arrays.sort(B);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 long k = sum1-A[i]+B[j];
//                 long z = sum2 -B[j]+A[i];
//                 if(k==z){
//                     return 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }

//import java.util.Arrays;

// class Solution {
//     long findSwapValues(long A[], int n, long B[], int m) {
//         long sum1 = 0;
//         for (int i = 0; i < n; i++) {
//             sum1 += A[i];
//         }
//         long sum2 = 0;
//         for (int i = 0; i < m; i++) {
//             sum2 += B[i];
//         }

//         Arrays.sort(A);
//         Arrays.sort(B);

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 long k = sum1 - A[i] + B[j];
//                 long z = sum2 - B[j] + A[i];
//                 if (k == z) {
//                     return 1;
//                 }
//             }
//         }

//         return -1;
//     }
// }




class Solution {
    long findSwapValues(long A[], int n, long B[], int m) {
        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += A[i];
        }
        long sum2 = 0;
        for (int i = 0; i < m; i++) {
            sum2 += B[i];
        }

        if ((sum1 - sum2) % 2 != 0) {
            return -1; // If the difference of sums is odd, no swap can make them equal
        }

        long diff = (sum1 - sum2) / 2; // Calculate the required difference between elements to make the sums equal

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0, j = 0;
        while (i < n && j < m) {
            long currentDiff = A[i] - B[j];
            if (currentDiff == diff) {
                return 1; // Found a pair of elements that can be swapped to make the sums equal
            } else if (currentDiff < diff) {
                i++; // A[i] is smaller, so we move to the next element in A
            } else {
                j++; // B[j] is smaller, so we move to the next element in B
            }
        }
        return -1; // No pair of elements found that can be swapped
    }
}






//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int m =Integer.parseInt(q[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            long b[] = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = Long.parseLong(a2[i]);
            }
            Solution ob = new Solution();
            long ans = ob.findSwapValues(a,n,b,m);
            System.out.println(ans);
        }
    }
}





// } Driver Code Ends