//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends




//User function Template for Java
class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        // code here
        long window = 0;
        
        for(int i=0;i<k;i++){
            window+=arr.get(i);
        }
        long max=window;
        for(int i=0;i<n-k;i++){
            window=window+arr.get(i+k)-arr.get(i);
            if(window>max){
                max=window;
            }
        }
        return max;
    }
}

