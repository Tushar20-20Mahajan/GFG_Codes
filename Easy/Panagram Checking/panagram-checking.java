//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends

//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        String st = str.toUpperCase();
        
        String s = "";
        for(int i=0;i<str.length();i++){
            if(st.charAt(i)>='A'&&st.charAt(i)<='Z'){
                s+=st.charAt(i);
            }
        }
        HashSet<Character> list = new HashSet<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        for(char i='A';i<='Z';i++){
            if(!list.contains(i)){
                return false;
            }
        }
        return true;
    }
}

// class Solution {
//     // Function to check if a string is Pangram or not.
//     public static boolean checkPangram(String str) {
//         String st = str.toUpperCase();
//         String s = "";
//         for (int i = 0; i < st.length(); i++) {
//             if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
//                 s += st.charAt(i);
//             }
//         }
//         HashSet<Character> list = new HashSet<>();
//         for (int i = 0; i < s.length(); i++) {
//             list.add(s.charAt(i));
//         }
//         for (int i = 'A'; i <= 'Z'; i++) {
//             if (!list.contains((char) i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }




//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends