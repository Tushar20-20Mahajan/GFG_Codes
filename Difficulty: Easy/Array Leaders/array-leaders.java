//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {

            // input size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            // inserting elements in the array
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();

            StringBuffer str = new StringBuffer();
            ArrayList<Integer> res = new ArrayList<Integer>();

            // calling leaders() function
            res = obj.leaders(n, arr);

            for (int i = 0; i < res.size(); i++) {
                ot.print(res.get(i) + " ");
            }

            ot.println();
        }
        ot.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // The rightmost element is always a leader.
        list.add(arr[n - 1]);
        
        // Traverse the array from the second last element to the beginning.
        for (int i = n - 2; i >= 0; i--) {
            // If the current element is greater than or equal to the last leader, add it to the list.
            if (arr[i] >= list.get(list.size() - 1)) {
                list.add(arr[i]);
            }
        }
        
        // Reverse the list to maintain the order of leaders as they appear in the array.
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            // Swap elements at lp and rp.
            int temp = list.get(lp);
            list.set(lp, list.get(rp));
            list.set(rp, temp);

            // Move pointers towards each other.
            lp++;
            rp--;
        }
        
        return list;
    }
}
