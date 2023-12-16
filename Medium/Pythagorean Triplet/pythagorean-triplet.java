//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends




//User function Template for Java




// class Solution {
//     boolean checkTriplet(int[] arr, int n) {
//         // code here
//         // Sorting the Array
//         Arrays.sort(arr);
        
//         for(int k = n-1 ; k >= 2; k--){
//             int i=0;
//             int j=k-1;
//             while(i<j){
//                 int sum = arr[i]*arr[i]+arr[j]*arr[j];
//                 if(sum==arr[k]*arr[k]){
//                     return true;
//                 }else if(sum<arr[k]*arr[k]){
//                     i++;
//                 }
//                 else if(sum>arr[k]*arr[k]){
//                     j--;
//                 }
//             }
//         }
//         return false;
//     }
// }



// //import java.util.Arrays;

// class Solution {
//     boolean checkTriplet(int[] arr, int n) {
//         // Sorting the Array
//         Arrays.sort(arr);

//         for (int k = n - 1; k >= 2; k--) {
//             int aSquarePlusBSquare = arr[k] * arr[k];

//             int i = 0;
//             int j = k - 1;

//             while (i < j) {
//                 int sum = arr[i] * arr[i] + arr[j] * arr[j];

//                 if (sum == aSquarePlusBSquare) {
//                     return true;
//                 } else if (sum < aSquarePlusBSquare) {
//                     i++;
//                 } else {
//                     j--;
//                 }
//             }
//         }
//         return false;
//     }
// }





class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // Create a HashMap to store the square of each element as keys
        // and the corresponding original element as values.
        HashMap<Integer, Integer> squareMap = new HashMap<>();

        // Populate the squareMap with the squares of elements.
        for (int i = 0; i < n; i++) {
            int square = arr[i] * arr[i];
            squareMap.put(square, arr[i]);
        }

        // Iterate through the squareMap to find triplets with the sum of squares.
        for (int square1 : squareMap.keySet()) {
            for (int square2 : squareMap.keySet()) {
                // Calculate the sum of two squared values.
                int sumOfSquares = square1 + square2;

                // Check if the sum exists in the squareMap, indicating the presence of a triplet.
                if (squareMap.containsKey(sumOfSquares)) {
                    return true;
                }
            }
        }

        // If no triplet is found, return false.
        return false;
    }
}