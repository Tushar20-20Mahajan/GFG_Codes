//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(a[i]);

            Solution ob = new Solution();
            System.out.println(ob.isPossible(N, arr));
        }
    }
}
// } Driver Code Ends




// // User function Template for Java

// class Solution {
//     static int isPossible(int N, int arr[]) {
//         // code here
//         String str = "";
//         for(int i=0;i<N;i++){
//             String a = Integer.toString(arr[i]);
//             str+=a;
            
//         }
//         int sum =0;
//         for(int i=0;i<str.length();i++){
//             int a = Integer.parseInt(String.valueOf(str.charAt(i)));
//             sum+=a;
//         }
//         if(sum%3==0){
//             return 1;
//         }
//         return 0;
//     }
// }

class Solution {
    static int isPossible(int N, int arr[]) {
        // code here
        int[] digitCount = new int[10];

        // Count the frequency of each digit
        for (int i = 0; i < N; i++) {
            int num = arr[i];
            while (num > 0) {
                digitCount[num % 10]++;
                num /= 10;
            }
        }

        // Check for divisibility by 3
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i * digitCount[i];
        }

        return (sum % 3 == 0) ? 1 : 0;
    }
}
