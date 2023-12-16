//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends



// class Solution {
    
//     // arr: input array
//     // n: size of array
//     // Function to find the trapped water between the blocks.
//     static long trappingWater(int height[], int n) { 
//         // Your code here
        
//         // Left max indexes for the towers
        
//         int[] leftMax = new int[n];
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }
        
//         // Right max indexes for the towers
        
//         int[] rightMax = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }
        
//         // Trapped water
//         int trappedWater = 0;
//         for (int i = 0; i < n; i++) {
//             // Water level
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
            
//             // Trapped water on the tower
//             trappedWater += waterLevel - height[i];
//         }
        
//         return trappedWater;
//     } 
// }


// Java program to find maximum amount of water that can
// be trapped within given set of bars.

class Solution {

	// Method for maximum amount of water
	static long trappingWater(int arr[], int n) {
		// left[i] contains height of tallest bar to the
		// left of i'th bar including itself
		long left[] = new long[n];

		// Right [i] contains height of tallest bar to
		// the right of ith bar including itself
		long right[] = new long[n];

		// Initialize result
		long water = 0;

		// Fill left array
		left[0] = arr[0];
		for (int i = 1; i < n; i++)
			left[i] = Math.max(left[i - 1], arr[i]);

		// Fill right array
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], arr[i]);

		// Calculate the accumulated water element by
		// element consider the amount of water on i'th bar,
		// the amount of water accumulated on this
		// particular bar will be equal to min(left[i],
		// right[i]) - arr[i] .
		for (int i = 0; i < n; i++)
			water += Math.min(left[i], right[i]) - arr[i];

		return water;
	}

}
