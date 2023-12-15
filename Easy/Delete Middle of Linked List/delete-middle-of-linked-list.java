//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            head = g.deleteMid(head);
            printList(head); 
            t--;
        }
    } 
} 
   

// } Driver Code Ends




/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        ArrayList<Integer> list = new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        
        if(list.size()%2==0){
            list.remove((list.size()+1)/2);
        }else{
            list.remove(list.size()/2);
        }
        
        Node dummy=new Node(0);
        Node current = dummy;
        for(int i=0;i<list.size();i++){
            current.next=new Node(list.get(i));
            current=current.next;
        }
        return dummy.next;
    }
}