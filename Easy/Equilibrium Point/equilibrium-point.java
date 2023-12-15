//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends



class Solution {
    public static int equilibriumPoint(long arr[], int n) {
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