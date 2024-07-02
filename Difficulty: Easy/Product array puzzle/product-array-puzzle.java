//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java

// Using Surfix and Prefix

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // 
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        
        long leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= leftProduct;
            leftProduct *= (long)nums[i];
        }
        
        long rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= (long)nums[i];
        }
        
        return result;
	} 
} 

// Using Division

// class Solution {

//     public int[] productExceptSelf(int[] nums) {
//         int product = 1;
//         boolean isZeroFound = false;
//         int zeroCount = 0;
//         boolean isConstantFound = false;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 0) {
//                 isZeroFound = true;
//                 zeroCount++;
//                 continue;
//             }

//             if (nums[i] != 0) {
//                 isConstantFound = true;
//             }
//             product *= nums[i];
//         }

//         int[] arr = new int[nums.length];

//         if (zeroCount > 1) {
//             Arrays.fill(arr, 0);
//         } else {
//             for (int i = 0; i < nums.length; i++) {
//                 if (isZeroFound) {
//                     if (isConstantFound) {
//                         if (nums[i] == 0) {
//                             arr[i] = product;
//                         } else {
//                             arr[i] = 0;
//                         }
//                     } else {
//                         arr[i] = 0;
//                     }
//                 } else {
//                     arr[i] = product / nums[i];
//                 }
//             }
//         }

//         return arr;
//     }
// }

