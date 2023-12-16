//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            obj.sieve();
            List<Integer> ans = obj.findPrimeFactors(n);
            for (int e : ans) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends




// User function Template for Java

// class Solution {
//     // You must implement this function
//     static void sieve() {}

//     static List<Integer> findPrimeFactors(int N) {
//         // code here
//         ArrayList <Integer> list = new ArrayList<>();
//         java.math.BigInteger num =  java.math.BigInteger.valueOf(N);
//         while(!num.equals(java.math.BigInteger.ONE)){
//             int div = 2;
//             if(num.mod(java.math.BigInteger.valueOf(div)).equals(java.math.BigInteger.ZERO)){
//                 list.add(div);
//                 java.math.BigInteger nextOne = java.math.BigInteger.valueOf(div).add(java.math.BigInteger.ONE);
//                 num=num.divide(java.math.BigInteger.valueOf(div));
//                 div=nextOne.nextProbablePrime().intValue();
                
//             }
//         }
//         return list;
//     }
// }

// import java.math.BigInteger;
// import java.util.ArrayList;
// import java.util.List;

class Solution {
    // You must implement this function
    static void sieve() {}

    static List<Integer> findPrimeFactors(int N) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        java.math.BigInteger num = java.math.BigInteger.valueOf(N);
        int div = 2;

        while (!num.equals(java.math.BigInteger.ONE)) {
            if (num.mod(java.math.BigInteger.valueOf(div)).equals(java.math.BigInteger.ZERO)) {
                list.add(div);
                num = num.divide(java.math.BigInteger.valueOf(div));
            } else {
                div = div + 1;
            }
        }
        return list;
    }
}