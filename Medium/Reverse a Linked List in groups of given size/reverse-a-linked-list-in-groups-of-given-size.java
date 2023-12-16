//{ Driver Code Starts
import java.util.*;
import java.io.*;
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

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res,out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node node,PrintWriter out)
    {
        while(node != null)
        {
            out.print(node.data + " ");
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
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        if(node==null || node.next==null ){
            return node;
        }
        ArrayList<Integer> elements = new ArrayList<>();
        Node temp = node;
        while(temp!=null){
            elements.add(temp.data);
            temp=temp.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(elements.size()%k==0){
            for(int i=0;i<elements.size();i=i+k){
                for(int j =i+k-1;j>=i;j--){
                    list.add(elements.get(j));
                    
                }
            }
        }
        else{
            int s = elements.size()%k;
             for(int i=0;i<elements.size()-s;i=i+k){
                for(int j =i+k-1;j>=i;j--){
                    list.add(elements.get(j));
                    
                }
            }
            
            for(int i=elements.size()-1;i>=elements.size()-s;i--){
                list.add(elements.get(i));
            }
            
        }
        
        Node dummy = new Node(0);
        Node current = dummy;
        for(int i=0;i<list.size();i++){
            current.next=new Node(list.get(i));
            current = current.next;
        }
        
        return dummy.next;
        
        
    }
}