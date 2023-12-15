//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().hasArrayTwoCandidates(arr, n, x);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}

// } Driver Code Ends



//User function Template for Java


// class Solution {
//     boolean hasArrayTwoCandidates(int arr[], int n, int x) {
//         // code here
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i!=j && arr[i]+arr[j]==x){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }




class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // Create a hashmap to store the elements
        Map<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            int complement = x - arr[i];
            
            // Check if the complement exists in the hashmap
            if (map.containsKey(complement)) {
                return true;
            }
            
            // Store the current element in the hashmap
            map.put(arr[i], i);
        }
        
        return false;
    }
}