//{ Driver Code Starts
import java.util.*;

class Count
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            
            for(int i = 0; i < m; i++)
              arr1[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              arr2[i] = sc.nextInt();
              
            Solution gfg = new Solution();
            ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
        
    }
}
// } Driver Code Ends




// Complete the function given below
// class Solution
// {
//     public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
//     {
//       // add your code here
       
//       ArrayList<Integer> list = new ArrayList<>();
//       for(int i =0;i<m;i++){
//           int count=0;
//           for(int j=0;j<n;j++){
//               if(arr2[j]<=arr1[i]){
//                   count++;
//               }
               
//           }
//           list.add(count);
//       }
//       return list;
//     }
// }



class Solution {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr2); // Sort arr2 in ascending order for binary search

        for (int i = 0; i < m; i++) {
            int count = binarySearch(arr2, arr1[i]);
            list.add(count);
        }

        return list;
    }

    private static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                index = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index + 1;
    }
}