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
            HashMap<Node, Integer> mp = new HashMap<Node, Integer>();
            mp.put(head, head.data); 
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
                mp.put(tail, tail.data); 
            }
            
            Node failure = new Node(-1);
            
            Solution g = new Solution();
            head = g.pairwiseSwap(head);
            
            Node temp = head;
            int f = 0;
            while (temp != null) 
    		{ 
    			if(mp.get(temp) != temp.data){
    			    f = 1;
    			}
    			temp = temp.next; 
    		} 
            
            if(f==1){
                printList(failure); 
            }
            else{
                printList(head); 
            }
            t--;
        }
    } 
} 
   

// } Driver Code Ends





/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/


// class Solution {
//     // Function to pairwise swap elements of a linked list.
//     // It should returns head of the modified list
//     public Node pairwiseSwap(Node head)
//     {
//         // code here
//         ArrayList<Integer> list = new ArrayList<>();
//         if(head == null || head.next==null){
//             return null;
//         }
//         Node temp = head;
//         while(temp!=null){
//             list.add(temp.data);
//             temp=temp.next;
//         }
        
//         if(list.size()%2==0){
//             for(int i=0;i<list.size();i+=2){
//                 int dmm = list.get(i);
//                 list.set(i,list.get(i+1));
//                 list.set(i+1,dmm);
//             }
//         }else{
//             for(int i=0;i<list.size()-1;i+=2){
//                 int dmm = list.get(i);
//                 list.set(i,list.get(i+1));
//                 list.set(i+1,dmm);
//             }
//         }
        
//         Node dummy = new Node(0);
//         Node current = dummy;
//         for(int i=0;i<list.size();i++){
//             current.next=new Node(list.get(i));
//             current=current.next;
//         }
//         return dummy.next;
//     }
// }

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should return the head of the modified list.
    public Node pairwiseSwap(Node head) {
        if (head == null || head.next == null) {
            return head; // No need to swap if there are 0 or 1 nodes.
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node current = head;

        while (current != null && current.next != null) {
            // Save the next node for the next iteration.
            Node nextNode = current.next;
            
            // Swap the nodes.
            current.next = nextNode.next;
            nextNode.next = current;
            prev.next = nextNode;

            // Move to the next pair.
            prev = current;
            current = current.next;
        }

        return dummy.next; // The new head of the modified list.
    }
}