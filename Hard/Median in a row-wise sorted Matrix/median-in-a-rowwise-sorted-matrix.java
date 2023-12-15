//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




//User function Template for Java

// class Solution {
//     int median(int matrix[][], int R, int C) {
//         // code here 
        
//         ArrayList<Integer> list=new ArrayList<>();
//         for(int i=0;i<R;i++){
//             for(int j=0;j<C;j++){
//                 list.add(matrix[i][j]);
//             }
//         }
//         Collections.sort(list);
//         int med = -1;
//         int n = list.size();
        
//         if(n%2==0){
//             med = (list.get(n/2)+list.get((n-1)/2))/2;
//         }
//         else{
//             med = list.get(n/2);
//         }
//         return med;
//     }
// }

//import java.util.Arrays;

class Solution {
    int median(int matrix[][], int R, int C) {
        // Create a 1D array to store all the matrix elements
        int[] arr = new int[R * C];
        int k = 0;
        
        // Copy all the elements of the matrix into the 1D array
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[k++] = matrix[i][j];
            }
        }
        
        // Sort the 1D array
        Arrays.sort(arr);
        
        // Calculate the median based on the sorted array
        int n = arr.length;
        int med = -1;
        
        if (n % 2 == 0) {
            med = (arr[n / 2] + arr[(n - 1) / 2]) / 2;
        } else {
            med = arr[n / 2];
        }
        
        return med;
    }
}