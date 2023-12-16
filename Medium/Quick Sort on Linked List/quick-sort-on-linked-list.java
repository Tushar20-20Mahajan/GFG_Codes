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

class SortLL
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) 
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);
            
            printList(node);
            System.out.println();
        }
    }
    public static void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    public static void addToTheLast(Node node) 
{
  if (head == null) 
  {
    head = node;
  } else 
  {
   Node temp = head;
   while (temp.next != null)
          temp = temp.next;
         temp.next = node;
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
// you have to complete this function
class GfG
{
    public static Node quickSort(Node node)
    {
        //Your code here
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = node;
        while(temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }
        int array [] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
        quickSort(array,0,list.size()-1);
        Node dummy = new Node(0);
        Node current = dummy;
        for(int i=0;i<list.size();i++){
            current.next = new Node(array[i]);
            current = current.next;
        }
        return dummy.next;
    }
    
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
            
        }
        
        
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[high];
        int i = low -1;
        for(int j = low ;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp ;
            }
        }
        
        int temp = arr[i+1];
        arr[i+1]= pivot;
        arr[high] = temp;
        
        return i+1;
    } 
    
    
}