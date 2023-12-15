//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String[] element = br.readLine().split(" ");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [] = new int[N];
		    int brr [] = new int[M];
		    String[] elements = br.readLine().split(" ");
		    for(int i=0; i<N; i++)
		        arr[i] = Integer.parseInt(elements[i]);
		        
		    String[] ele = br.readLine().split(" ");
		    for(int i=0; i<M; i++)
		        brr[i] = Integer.parseInt(ele[i]);
		    
		    int X = Integer.parseInt(br.readLine());
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> ans;
		    ans = obj.printClosest(arr, brr, N, M, X);
		    System.out.println(Math.abs(ans.get(0) + ans.get(1) - X));
		}
	}
}


// } Driver Code Ends




//User function Template for Java

// class Solution{
//     // Function for finding maximum and value pair
//     public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
//         // code here
//         ArrayList<Integer> list = new ArrayList<>();
//         int a = Integer.MIN_VALUE;
//         int b = Integer.MIN_VALUE;
//         int minValue=Integer.MAX_VALUE;
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 int k = arr[i]+brr[j];
//                 int Current = Math.abs(x-k);
//                 if(Current<=minValue){
//                     a=arr[i];
//                     b=brr[j];
//                     minValue=Current;
//                 }
//             }
//         }
//         list.add(a);
//         list.add(b);
//         return list;
//     }
// }

//import java.util.ArrayList;

class Solution {
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = -1; // Initialize to an invalid value
        int b = -1; // Initialize to an invalid value
        int minValue = Integer.MAX_VALUE;

        int i = 0; // Pointer for arr
        int j = m - 1; // Pointer for brr

        while (i < n && j >= 0) {
            int k = arr[i] + brr[j];
            int current = Math.abs(x - k);
            if (current < minValue) {
                a = arr[i];
                b = brr[j];
                minValue = current;
            }
            
            if (k < x) {
                i++;
            } else {
                j--;
            }
        }

        list.add(a);
        list.add(b);
        return list;
    }
}