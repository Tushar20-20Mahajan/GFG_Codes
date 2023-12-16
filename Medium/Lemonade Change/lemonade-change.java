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
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends



// User function Template for Java

// class Solution {
//     static boolean lemonadeChange(int N, int bills[]) {
//         // code here
//         //Arrays.sort(bills);
//         boolean isOk=true;
//         int sum =0;
//         for(int i=0;i<N;i++){
//             if(sum<bills[i]-1){
//                 isOk=false;
//                 break;
//             }
//             sum=sum+5;
//             if(bills[i]==5){
//                 continue;
//             }else if(bills[i]==10){
//                 sum=sum-5;
//             }
//             else if(bills[i]==20){
//                 sum=sum-15;
//             }
            
            
           
//         }
//         if(isOk){
//             return true;
//         }
//         return false;
//     }
// }


class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        int sum = 0;
        int[] change = new int[2]; // to keep track of $5 and $10 bills
        
        for (int i = 0; i < N; i++) {
            if (bills[i] == 5) {
                change[0]++; // increase the count of $5 bills
            } else if (bills[i] == 10) {
                if (change[0] < 1) {
                    return false; // cannot provide change
                }
                change[0]--; // use one $5 bill
                change[1]++; // increase the count of $10 bills
            } else if (bills[i] == 20) {
                if (change[1] >= 1 && change[0] >= 1) {
                    change[1]--; // use one $10 bill
                    change[0]--; // use one $5 bill
                } else if (change[0] >= 3) {
                    change[0] -= 3; // use three $5 bills
                } else {
                    return false; // cannot provide change
                }
            }
        }
        
        return true;
    }
}
