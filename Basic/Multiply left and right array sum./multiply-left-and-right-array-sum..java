//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    
		    Complete obj = new Complete();
		    int ans = obj.multiply(arr, N);
        	System.out.println(ans);
		}
	}
}


// } Driver Code Ends





//User function Template for Java


class Complete{
    
   
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int sum1=0;
        for(int i=0;i<n/2;i++){
            sum1+=arr[i];
            
        }
        
         int sum2=0;
        for(int i=n/2;i<n;i++){
            sum2+=arr[i];
            
        }
        return sum1*sum2;
    }
    
    
}









