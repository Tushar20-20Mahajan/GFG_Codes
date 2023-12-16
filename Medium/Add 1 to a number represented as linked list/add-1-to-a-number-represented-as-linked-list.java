//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends




/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/
class Solution {
    public static Node addOne(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }

        int carry = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            int sum = list.get(i) + carry;
            carry = sum / 10;
            list.set(i, sum % 10);
        }

        if (carry > 0) {
            list.add(0, carry);
        }

        Node dummy = new Node(0);
        Node newCurrent = dummy;
        for (int i = 0; i < list.size(); i++) {
            newCurrent.next = new Node(list.get(i));
            newCurrent = newCurrent.next;
        }
        return dummy.next;
    }
}