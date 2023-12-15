//{ Driver Code Starts
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
            String str = br.readLine().trim();
            String patt = br.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.printMinIndexChar(str, patt));
        }
    }
}
// } Driver Code Ends




class Solution{
    
    // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String S, String patt){
        
        // Your code here
        
        // you don't need to print anything
        LinkedHashSet<Character> list = new LinkedHashSet<>();
        for(int i=0;i<patt.length();i++){
            list.add(patt.charAt(i));
        }
        for(int i=0;i<S.length();i++){
            if(list.contains(S.charAt(i))){
                return String.valueOf(S.charAt(i));
            }
        }
        return "$";
    
    }
    
}