//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends





class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        
        if(arr.length==1){
            list.add(-1);
            return list;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] == arr[i - 1] && arr[i] != arr[i + 1]) {
                list.add(arr[i]);
            }
        }

        if (arr[n - 1] == arr[n - 2]) {
            list.add(arr[n - 1]);
        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        return list;
    }
}