//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends



/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/

  class Solution {
    Node compute(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        
        Stack<Integer> list2 = new Stack<>();
        list2.push(list.get(list.size()-1));
        for(int i=list.size()-2;i>=0;i--){
            if(list.get(i)>=list2.peek()){
                list2.push(list.get(i));
            }
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        while(!list2.isEmpty()){
            list1.add(list2.pop());
        }
        

        Node dummy = new Node(0);
        Node current = dummy;
        for (int i = 0; i < list1.size(); i++) {
            current.next = new Node(list1.get(i));
            current = current.next;
        }
        return dummy.next;
    }
}

  