//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            Node head = null, tail = null;
            for(int i = 0; i < n; i++)
            {
                int data = Integer.parseInt(str[i]);
                if (head == null) 
                {
                    head = new Node(data);
                    tail = head;
                }
                else
                {
                    tail.next = new Node(data);
                    tail.next.prev=tail;
                    tail = tail.next;
                }
            }
            head=reverseDLL(head);
            if(verify(head))
    	    displayList(head);
    	    else
    	    System.out.print("Your pointers are not correctly connected");
            System.out.println();
                
        }
    }
    
    
    
public static void displayList(Node head)
{
    //Head to Tail
    while(head.next != null)
    {
        System.out.print(head.data+" ");
        head = head.next;
    }
    System.out.print(head.data);
   
}


// } Driver Code Ends

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node head) {
    if (head == null || head.next == null) {
        return head; // Empty or single node DLL, return as is
    }

    ArrayList<Integer> list = new ArrayList<>();
    Node temp = head;

    while (temp != null) {
        list.add(temp.data);
        temp = temp.next;
    }

    Collections.reverse(list);

    Node reversedHead = new Node(list.get(0));
    Node current = reversedHead;

    for (int i = 1; i < list.size(); i++) {
        Node newNode = new Node(list.get(i));
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    return reversedHead;
}



//{ Driver Code Starts.

public static boolean verify(Node head)
{
    int fl=0;
    int bl=0;
    
    Node temp=head;
    
    while(temp.next!=null)
    {
        temp=temp.next;
        fl++;
    }
    
    while(temp.prev!=null)
    {
        temp=temp.prev;
        bl++;
    }
    
    return fl==bl;
}
}


// } Driver Code Ends