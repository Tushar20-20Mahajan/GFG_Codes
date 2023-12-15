//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends






class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int index=i;
        int smallest = arr[i];
	        for(int j=i+1;j<arr.length;j++){
	            int current = arr[j];
	            
	            if(current<smallest){
	                smallest=current;
	                index=j;
	            }
	        }
	        return index;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n;i++){
	        int smallest = arr[i];
	        int index=select(arr,i);
	        int temp = arr[i];
	        arr[i]=arr[index];
	        arr[index]=temp;
	    }
	}
}

// class Solution {
//     int select(int arr[], int i) {
//         // Returns the index of the minimum element in the remaining unsorted subarray
//         int minIndex = i;
//         for (int j = i + 1; j < arr.length; j++) {
//             if (arr[j] < arr[minIndex]) {
//                 minIndex = j;
//             }
//         }
//         return minIndex;
//     }

//     void selectionSort(int arr[], int n) {
//         // Implementation of selection sort
//         for (int i = 0; i < n - 1; i++) {
//             // Find the minimum element in the unsorted subarray
//             int minIndex = select(arr, i);

//             // Swap the found minimum element with the first element
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;
//         }
//     }
// }