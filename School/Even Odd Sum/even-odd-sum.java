//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int Arr[] = new int[N];
            String[] inp = read.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                Arr[i] = Integer.parseInt(inp[i]);
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.EvenOddSum(N, Arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}
// } Driver Code Ends





// User function Template for Java

class Solution {
    ArrayList<Integer> EvenOddSum(int n, int arr[]) {
        // code here
        int sum1 =0;
        int sum2 =0;
        for(int i=0;i<n;i+=2){
            sum1=sum1+arr[i];
            if(i+1<n){
            sum2 = sum2+arr[i+1];
            }
        }
        // if(n%2!=0){
        //     sum1=sum1+arr[n-1];
        // }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(sum1);
        list.add(sum2);
        return list;
    }
}