//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends




//User function Template for Java

// class Solution
// {
//     public int[] singleNumber(int[] nums)
//     {
//         // Code here
//         ArrayList<Integer> list1 = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             list1.add(nums[i]);
//         }
        
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             if(Collections.frequency(list1,nums[i])==1){
//                 list.add(nums[i]);
//             }
            
//         }
//         Collections.sort(list);
//         int array[]=new int[list.size()];
//         for(int i=0;i<list.size();i++){
//             array[i]=list.get(i);
//         }
//         return array;
//     }
// }



//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        Arrays.sort(nums);
        int arr[] = new int[2];
        int k =0;
        if(nums[0]!=nums[1]){
            arr[k]=nums[0];
            k++;
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                arr[k]=nums[i];
                k++;
            }
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            arr[k]=nums[nums.length-1];
        }
        return arr;
        
        
    }
}

// class Solution
// {
//     public int[] singleNumber(int[] nums)
//     {
//         // Code here
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             list.add(nums[i]);
//         }
//         int arr[] = new int[2];
//         int k =0;
//          for(int i=0;i<nums.length;i++){
//             if(Collections.frequency(list,nums[i])==1){
//                 arr[k]=nums[i];
//                 k++;
//             }
//         }
//         Arrays.sort(arr);
//         return arr;
//     }
// }