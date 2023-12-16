//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends




// Brute Force
// class Solution {
//     // Function to find maximum product subarray
//     long maxProduct(int[] arr, int n) {
//         // code here
//          ArrayList<Integer> list = new ArrayList<>();
//          long maxPro = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int start = i;
//             for(int j=i;j<n;j++){
//                 long currentProduct  =1;
//                 int end = j;
//                 for(int k=start;k<=end;k++){
//                     currentProduct*= arr[k];
//                 }
//                 if(currentProduct>maxPro){
//                     maxPro=currentProduct;
//                 }
                
//             }
//         }
//         return maxPro;
       
//     }
// }

// Using Dynamic Programming which i not Know now
class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long maxProduct = arr[0];
        long minProduct = arr[0];
        long overallMax = arr[0];

        for (int i = 1; i < n; i++) {
            // If the current element is negative, swap the maximum and minimum products
            if (arr[i] < 0) {
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update the maximum and minimum products
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            // Update the overall maximum product
            overallMax = Math.max(overallMax, maxProduct);
        }

        return overallMax;
    }
}