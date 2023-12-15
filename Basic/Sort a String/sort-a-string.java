//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        }
    }
}
// } Driver Code Ends



//User function Template for Java
class Solution 
{ 
    String sort(String s) 
    {
        // code here
        char [] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        Arrays.sort(arr);
        String str ="";
         for(int i=0;i<s.length();i++){
            str+=arr[i];
        }
        return str;
    }
} 