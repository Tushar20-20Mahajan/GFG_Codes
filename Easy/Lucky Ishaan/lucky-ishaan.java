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
		    long arr [] = new long[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Long.parseLong(elements[i]);    
	        }
		    
		    Complete obj = new Complete();
		    int ans = obj.lucky(arr, N);
        	System.out.println(ans);
		}
	}
}








// } Driver Code Ends




//User function Template for Java

class Complete{
    public static long sumOfDigits(long n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
    
   
    // Function for finding maximum and value pair
    public static int lucky (long arr[], int n) {
        //Complete the function
        HashSet<Long> list = new HashSet<>();
        for(int i=0;i<n;i++){
            long number = arr[i];
            long digitSum = sumOfDigits(number);
            list.add(digitSum);
             
        }
        return list.size();
    }
    
    
}