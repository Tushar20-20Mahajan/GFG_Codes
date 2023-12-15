//{ Driver Code Starts
import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}

// } Driver Code Ends




class MyStack 
{
    // Inner class for StackNode
    // class StackNode {
    //     int data;
    //     StackNode next;
        
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    //}
    
    StackNode top;
    
    // Function to push an integer into the stack.
    void push(int a) 
    {
        // Create a new node with the given data.
        StackNode newNode = new StackNode(a);
        
        // If the stack is empty, set the new node as the top.
        if (top == null) {
            top = newNode;
        } else {
            // Otherwise, set the new node's next to the current top and update top.
            newNode.next = top;
            top = newNode;
        }
    }
    
    // Function to remove an item from the top of the stack.
    int pop() 
    {
        // Check if the stack is empty.
        if (top == null) {
            // Return -1 to indicate an empty stack (you can choose a different value if needed).
            return -1;
        }
        
        // Store the data of the current top node.
        int poppedData = top.data;
        
        // Update the top to point to the next node (removing the current top).
        top = top.next;
        
        // Return the popped data.
        return poppedData;
    }
}
