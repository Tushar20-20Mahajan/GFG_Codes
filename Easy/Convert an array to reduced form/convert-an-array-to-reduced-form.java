//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().convert(arr, n);
            for (int i = 0; i < n; i++) {
                out.print(arr[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends




//User function Template for Java

// class Solution {
//     void convert(int[] arr, int n) {
//         //Code here
//         ArrayList<Integer>list = new ArrayList<>();
//         for(int i=0;i<n;i++){
//             list.add(arr[i]);
//         }
//         Collections.sort(list);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(arr[i]==list.get(j)){
//                     arr[i]=j;
//                     break;
//                 }
//             }
//         }
        
//     }
// }   Test Cases run 160 /166     Time Limit Exceeded


// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashMap;

class Solution {
    void convert(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        
        Collections.sort(list);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            map.put(list.get(j), j);
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }
    }
}