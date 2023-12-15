//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends






// class Solution {
//     // Function to check if brackets are balanced or not.
//     static boolean ispar(String x) {
//         // add your code here
//         char c = ' ';
//         for (int i = 0; i < x.length(); i++) {
//             if (x.charAt(i) == '(' || x.charAt(i) == '[' || x.charAt(i) == '{') {
//                 c = x.charAt(i);
//             } else if (x.charAt(i) == ')' || x.charAt(i) == ']' || x.charAt(i) == '}') {
//                 if (c == ' ') {
//                     return false; // Unmatched closing bracket
//                 }
//                 if ((c == '(' && x.charAt(i) != ')') ||
//                     (c == '[' && x.charAt(i) != ']') ||
//                     (c == '{' && x.charAt(i) != '}')) {
//                     return false; // Mismatched opening and closing brackets
//                 }
//                 c = ' '; // Reset c for the next iteration
//             }
//         }
//         return true; // Check if all opening brackets are matched
//     }
// }


class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        
        Stack<Character> list = new Stack<>();
        for(int i=0;i<x.length();i++){
            if(!list.isEmpty()&&list.peek()=='(' && x.charAt(i)==')'){
                list.pop();
            }
            else if(!list.isEmpty()&&list.peek()=='{' && x.charAt(i)=='}'){
                list.pop();
            }
            else  if(!list.isEmpty()&&list.peek()=='[' && x.charAt(i)==']'){
                list.pop();
            }
            else{
                list.push(x.charAt(i));
            }
        }
        
        if(!list.isEmpty()){
            return false;
        }
        return true;
        
    }
    
}