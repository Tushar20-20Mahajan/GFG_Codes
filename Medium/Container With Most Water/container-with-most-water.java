//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}

// } Driver Code Ends




//User function Template for Java


// class Solve{
    
//     long maxArea(int A[], int len){
//         // Code Here
//         ArrayList<Integer> array = new ArrayList<>();
//         for(int i=0;i<A.length;i++){
//             array.add(A[i]);
//         }
        
        
//         long current =0;
//         long max =0;
        
//         for(int i=0;i<array.size()-1;i++){
//             for(int j=i+1;j<array.size();j++){
//                 long k= (long)Math.min(array.get(i),array.get(j));
//                 current = k* (j-i);
                
//                 if(current>max){
//                     max= (long) Math.max(current,max);
//                 }
                
//             }
//         }
//         return max;
        
        
//     }
    
// }

class Solve {
    long maxArea(int A[], int len) {
        long max = 0;
        int left = 0;
        int right = len - 1;

        while (left < right) {
            long current = (long) Math.min(A[left], A[right]) * (right - left);
            max = Math.max(max, current);

            if (A[left] < A[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}