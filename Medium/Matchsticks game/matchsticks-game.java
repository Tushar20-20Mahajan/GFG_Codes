//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.matchGame(N));
        }
    }
}
// } Driver Code Ends




// //User function Template for Java
// class Solution {
//     static int matchGame(Long N) {
//         if (N == 0) {
//             return -1; // No matchsticks, A cannot win
//         }

//         int remainder = (int) (N % 4);
//         if (remainder == 0) {
//             return 3; // A picks 3 matchsticks
//         } else if (remainder == 3) {
//             return 2; // A picks 2 matchsticks
//         } else if (remainder == 2) {
//             return 1; // A picks 1 matchstick
//         } else {
//             return -1; // A picks 1 matchstick
//         }
//     }
// }


class Solution {
    static int matchGame(Long N) {
        if (N % 5 == 0) {
            return -1;
        }
        
        if ((N - 1) % 5 == 0) {
            return 1;
        }
        
        if ((N - 2) % 5 == 0) {
            return 2;
        }
        
        if ((N - 3) % 5 == 0) {
            return 3;
        }
        
        if ((N - 4) % 5 == 0) {
            return 4;
        }
        
        return -1;
    }
}