//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends




//User function Template for Java

// class Solution {
//     static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
//         // code here
//         StringBuilder str= new StringBuilder();
//         for(int i=0;i<arr.size();i++){
//             str.append(String.valueOf(arr.get(i)));
//         }
//         int n = Integer.parseInt(str.toString())+1;
//         ArrayList<Integer> list = new ArrayList<>();
//         while(n>0){
//             int digit=n%10;
//             list.add(digit);
//             n=n/10;
//         }
//         Collections.reverse(list);
//         return list;
//     }
// };

// import java.math.BigInteger;
// import java.util.ArrayList;
// import java.util.Collections;

// class Solution {
//     static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
//         StringBuilder str = new StringBuilder();
//         for (int i = 0; i < arr.size(); i++) {
//             str.append(String.valueOf(arr.get(i)));
//         }
//         java.math.BigInteger num = new java.math.BigInteger(str.toString());
//         num = num.add(java.math.BigInteger.ONE);
//         String incrementedStr = num.toString();
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < incrementedStr.length(); i++) {
//             int digit = Character.getNumericValue(incrementedStr.charAt(i));
//             list.add(digit);
//         }
//         return list;
//     }
// }




class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        int carry = 1;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = arr.size() - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry = carry / 10;
        }

        Collections.reverse(result);
        return result;
    }
}