//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}

// } Driver Code Ends




class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        char[] array=new char[arr.length()];
        for(int i=0;i<arr.length();i++){
            array[i]=arr.charAt(i);
        }
        Arrays.sort(array);
        String str="";
        for(int i=0;i<arr.length();i++){
            str+=String.valueOf(array[i]);
        }
        return str;
    }
}