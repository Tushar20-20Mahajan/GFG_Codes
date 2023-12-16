//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends




//User function Template for Java

// class Solution
// {
//     //Function to find the minimum number of platforms required at the
//     //railway station such that no train waits.
//     static int findPlatform(int arr[], int dep[], int n)
//     {
//         // add your code here
//         int count =0;
//         for(int i=1;i<n;i++){
//             if(arr[i]<dep[i-1]){
//                 count++;
//             }
//         }
//         if(count == 0){
//             count++;
//         }
//         return count;
//     }
    
// }

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n) {
        // Sorting the arrival and departure arrays in ascending order.
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 1; // Minimum number of platforms required
        int currentPlatforms = 1; // Number of platforms in use at the current time

        int i = 1; // Pointer for arrival array
        int j = 0; // Pointer for departure array

        // Traverse the arrival and departure arrays
        while (i < n && j < n) {
            // If a train arrives before the previous train departs,
            // increment the currentPlatforms count and move to the next arrival.
            if (arr[i] <= dep[j]) {
                currentPlatforms++;
                i++;
            }
            // If a train departs, decrement the currentPlatforms count
            // and move to the next departure.
            else if (arr[i] > dep[j]) {
                currentPlatforms--;
                j++;
            }

            // Update the minimum number of platforms required
            platforms = Math.max(platforms, currentPlatforms);
        }

        return platforms;
    }
}
