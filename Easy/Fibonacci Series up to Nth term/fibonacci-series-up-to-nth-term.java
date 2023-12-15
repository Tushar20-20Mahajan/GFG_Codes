//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans[] = obj.Series(n);
            for (long i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends



class Solution {
    
    

    long[] Series(int N) {
        // code here
        long arr[]=new long[N+1];
        if(N==0){
            arr[0]=0;
            return arr; 
        }else if(N==1){
            arr[0]=0;
            arr[1]=1;
            return arr;
        }
        else if(N==2){
            arr[0]=0;
            arr[1]=1;
            arr[2]=1;
            return arr;
        }
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        long t1 = 1;
        long t2 = 1;
        for(int i=3;i<=N;i++){
            long t3=t1+t2;
            arr[i]=t3;
            t1=t2;
            t2=t3;
        }
        return arr;
    }
}