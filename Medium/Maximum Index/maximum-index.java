//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends




// class Solution {

//     int maxIndexDiff(int arr[], int n) {
//         // code here
//     }
// }

// class Solution {
//     static int maxIndexDiff(int A[], int n) { 
//         int maxDiff = 0;
        
//         for (int i = 0; i < n; i++) {
//             for (int j = n - 1; j > i + maxDiff; j--) {
//                 if (A[i] <= A[j]) {
//                     maxDiff = Math.max(maxDiff, j - i);
//                     break;
//                 }
//             }
//         }
        
//         return maxDiff;
//     }
// }


class Solution {

    int maxIndexDiff(int arr[], int n) {
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
        }

        rightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
        }

        int maxDiff = 0;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (leftMin[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }
}