//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends







/*

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int arr[]=new int[n];
        arr[0] = 1;
        for(int i=1;i<n;i++){
            if(price[i]<=price[i-1]){
                arr[i]=1;
            }
            else{
                int t = i;
                int minInteger=Integer.MAX_VALUE;
                Stack<Integer> list = new Stack<>();
                for(int j=0;j<t;j++){
                    if(price[j]>price[i] && price[j]<minInteger){
                        minInteger=price[j];
                        list.push(j);
                    }
                }
                if(!list.isEmpty()){
                     arr[i]=i-list.peek();
                }
               
                
            }
        }
        return arr;
    }
    
}

*/

//import java.util.Stack;

// class Solution
// {
//     // Function to calculate the span of stock's price for all n days.
//     public static int[] calculateSpan(int price[], int n)
//     {
//         int[] arr = new int[n];
//         arr[0] = 1;
//         for (int i = 1; i < n; i++) {
//             int span = 1;
//             int j = i - 1;
            
//             // Count the number of consecutive days with prices less than or equal to price[i].
//             while (j >= 0 && price[i] >= price[j]) {
//                 span += arr[j];
//                 j -= arr[j];
//             }
            
//             arr[i] = span;
//         }
//         return arr;
//     }
    
   
// }




class Solution {
    public static int[] calculateSpan(int price[], int n) {
        int arr[] = new int[n];
        arr[0] = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // Push the index of the first day onto the stack.

        for (int i = 1; i < n; i++) {
            // Pop elements from the stack while the price at the top of the stack is less than or equal to the current price.
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            // If the stack is empty, it means there are no elements on the left with prices greater than the current day.
            if (stack.isEmpty()) {
                arr[i] = i + 1;
            } else {
                // Otherwise, calculate the difference between the current day and the top of the stack (the most recent day with a price greater than today).
                arr[i] = i - stack.peek();
            }

            // Push the current day's index onto the stack for future calculations.
            stack.push(i);
        }
        return arr;
    }

   
}
