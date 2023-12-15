//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends



//User function Template for Java
class Solution 
{ 
//     String firstRepChar(String s) 
//     { 
        // code here
        // HashSet<Character> list = new HashSet<>();
        // int n = s.length();
        // for(int i=0;i<n;i++){
        //     list.add(s.charAt(i));
        // }
        
        // for(int i=0;i<n;i++){
        //     if(list.contains(s.charAt(i))){
        //         list.remove(s.charAt(i));
        //     }
        //     else{
        //          StringBuilder a = new StringBuilder(s.charAt(i));
        //          return a.toString();
        //     }
        // }
        // return "-1";
        
        String firstRepChar(String s) {
    HashSet<Character> set = new HashSet<>();
    int n = s.length();
    for (int i = 0; i < n; i++) {
        if (set.contains(s.charAt(i))) {
            return String.valueOf(s.charAt(i));
        }
        set.add(s.charAt(i));
    }
    return "-1";
}

    
} 