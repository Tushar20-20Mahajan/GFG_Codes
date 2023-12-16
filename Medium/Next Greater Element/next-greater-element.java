//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends




// class Solution {
//     public static long[] nextLargerElement(long[] arr, int n) {
//       Stack<Long> list = new Stack<>();
//       long array[]= new long[n];
//       for(int i=0;i<n;i++){
//           for(int j=i+1;j<n;j++){
//               if(arr[j]>arr[i]){
//                   array[i]=arr[j];
//                   break;
//               }
//               else if(j==n-1){
//                   array[i]=-1;
//               }
//           }
//       }
//       array[n-1]=-1;
//       return array;
//     }
// }

class Solution {
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] result = new long[n];
        Stack<Integer> stack = new Stack<>();

        // Iterate through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove elements from the stack that are smaller than the current element
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }

            // If there are no larger elements to the right, set the result as -1
            if (stack.isEmpty()) {
                result[i] = -1;
            }
            // Otherwise, set the result as the next larger element from the stack
            else {
                result[i] = arr[stack.peek()];
            }

            // Push the current element's index into the stack
            stack.push(i);
        }

        return result;
    }
}