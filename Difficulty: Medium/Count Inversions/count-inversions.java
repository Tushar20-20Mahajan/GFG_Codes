//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for (long i = 0; i < n; i++) arr[(int)i] = sc.nextLong();

            System.out.println(new Solution().inversionCount(arr, (int)n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to count inversions in the array.
    public static long countPairs(long arr[], int low, int mid, int high) {
        int right = mid + 1;
        long cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > arr[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public static void merge(long arr[], int low, int mid, int high) {
        long[] merged = new long[high - low + 1];
        int idx1 = low;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= high) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= high) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }

        for (int i = 0, j = low; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static long mergeSort(long arr[], int low, int high) {
        long count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += countPairs(arr, low, mid, high);
            merge(arr, low, mid, high);
        }
        return count;
    }

    static long inversionCount(long arr[], int n) {
        // Your Code Here
        return mergeSort(arr, 0, n - 1);
    }
}
