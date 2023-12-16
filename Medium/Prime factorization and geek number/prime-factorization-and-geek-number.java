//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            if(ob.geekNumber(N) == 1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
// } Driver Code Ends



// User function Template for Java

class Solution{
    static int geekNumber(int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i=2;
        while(i * i <= N){
             while(N%i==0){
                list.add(i);
                N=N/i;
            }
            i++;
        }
         
         HashSet<Integer> updatedList = new HashSet<>(list);
         if(updatedList.size()==list.size()){
             return 1;
         }
        return 0;
        
        
    }
}

//import java.util.ArrayList;

// class Solution {
//     static int geekNumber(int N) {
//         ArrayList<Integer> primeFactors = new ArrayList<>();
//         int i = 2;

//         while (i * i <= N) {
//             int count = 0;
//             while (N % i == 0) {
//                 N = N / i;
//                 count++;
//             }
//             if (count > 0) {
//                 primeFactors.add(count);
//             }
//             i++;
//         }

//         if (N > 1) {
//             primeFactors.add(1); // If there is a remaining prime factor
//         }

//         // Check if all prime factors have powers equal to 1
//         for (int factor : primeFactors) {
//             if (factor > 1) {
//                 return 0; // Not a geek number
//             }
//         }

//         return 1; // Geek number
//     }
// }
