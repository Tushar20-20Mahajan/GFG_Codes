//{ Driver Code Starts
import java.util.*;
import java.lang.*;

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

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends




/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution {
    public static void rearrange(Node odd) {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = odd;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i = i + 2) {
            list1.add(list.get(i));
            if(i+1<list.size()){
            list2.add(list.get(i + 1));
            }
        }
        if(list.size()%2!=0){
            list1.add(list.get(list.size()-1));
        }

        Collections.reverse(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list3.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            list3.add(list2.get(i));
        }

        Node dummy = new Node(0);
        Node current = dummy;
        for (int i = 1; i < list3.size(); i++) {
            current.next = new Node(list3.get(i));
            current = current.next;
        }
        odd.next = dummy.next;
    }
}