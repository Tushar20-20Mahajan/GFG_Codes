//{ Driver Code Starts
//

import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        head = tail = new Node(val);
        
        size--;
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Solution obj = new Solution();
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}

// } Driver Code Ends




//User function Template for Java

/* structure of list Node:

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return null;

        HashSet<Integer> set = new HashSet<>();
        Node temp = head2;

        // Store the unique elements of the first linked list in a set
        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }

        Node dummy = new Node(0);
        Node current = dummy;
        temp = head1;

        // Traverse the second linked list
        // If an element exists in the set, add it to the result linked list
        while (temp != null) {
            if (set.contains(temp.data)) {
                current.next = new Node(temp.data);
                current = current.next;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}