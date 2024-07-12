//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> list) {
        // Code here
        int low = 0;
        int high = list.size()-1;
        int ans = -1;
        int target = Integer.MAX_VALUE;
        while(low<high){
            int mid = low+(high-low)/2;
            
            if(list.get(mid)>list.get(high)){
               low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
    
}