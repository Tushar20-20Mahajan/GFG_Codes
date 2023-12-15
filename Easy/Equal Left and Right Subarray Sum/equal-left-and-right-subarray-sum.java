//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] A = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			System.out.println(ob.equalSum(A, N));
		}
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
	int equalSum(int [] arr, int n) {
		//Write your code here
		
		int start = 0;
        int end = 0;

        // Calculate the sum of all elements in the array
        for (int i = 0; i < n; i++) {
            end += arr[i];
        }

        for (int i = 0; i < n; i++) {
            end -= arr[i]; // Subtract the current element from the right sum
            if (start == end) {
                return i + 1; // Return the index of the equilibrium point
            }
            start += arr[i]; // Add the current element to the left sum
        }

        return -1; // No equilibrium point found
	}
}


// class Solution {
//     public static int equilibriumPoint(long arr[], int n) {
//         int start = 0;
//         int end = 0;

//         // Calculate the sum of all elements in the array
//         for (int i = 0; i < n; i++) {
//             end += arr[i];
//         }

//         for (int i = 0; i < n; i++) {
//             end -= arr[i]; // Subtract the current element from the right sum
//             if (start == end) {
//                 return i + 1; // Return the index of the equilibrium point
//             }
//             start += arr[i]; // Add the current element to the left sum
//         }

//         return -1; // No equilibrium point found
//     }
// }