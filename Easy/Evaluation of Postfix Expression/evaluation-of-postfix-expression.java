//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends



// class Solution
// {
//     //Function to evaluate a postfix expression.
//     public static int evaluatePostFix(String S)
//     {
//         // Your code here
//         Stack<Integer> list = new Stack<>();
//         for(int i=0;i<S.length();i++){
//             if(S.charAt(i)=='+'){
//                 int a = list.peek();
//                 list.pop();
//                 int b = list.peek();
//                 list.pop();
//                 int sum = a+b;
//                 list.push(sum);
//             }
//             else if(S.charAt(i)=='-'){
//                 int a = list.peek();
//                 list.pop();
//                 int b = list.peek();
//                 list.pop();
//                 int sub = a-b;
//                 list.push(sub);
//             }
//             else if(S.charAt(i)=='*'){
//                 int a = list.peek();
//                 list.pop();
//                 int b = list.peek();
//                 list.pop();
//                 int mul = a*b;
//                 list.push(mul);
//             }
//             else if(S.charAt(i)=='/'){
//                 int a = list.peek();
//                 list.pop();
//                 int b = list.peek();
//                 list.pop();
//                 int div = a/b;
//                 list.push(div);
//             }
//             else{
//                 list.push(Integer.parseInteger(String.valueOf(S.charAt(i))));
//             }
//         }
        
//         return list.peek();
//     }
// }



class Solution {
    // Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(Integer.parseInt(String.valueOf(ch)));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }
}