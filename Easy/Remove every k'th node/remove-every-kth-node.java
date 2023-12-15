//{ Driver Code Starts
import java.util.*;
class Node
{
	Node next;
	int data;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class Delete_Kth_Node
{
	Node head;	
	
	void addToTheLast(Node node)
	{
		if(head == null)
		head = node;
		else
		{
			Node temp = head;
			while(temp.next != null)
			temp = temp.next;
			
			temp.next = node;
		} }	
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();		 
		 while(t>0)
         {
			int n = sc.nextInt();
			Delete_Kth_Node list = new Delete_Kth_Node();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            list.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				list.addToTheLast(new Node(a));
			}
			int k = sc.nextInt();					  
			//System.out.println(list.head.data+" "+ k);
			list.head = new GfG().delete(list.head,k); 
			Node temp = list.head;
			while(temp!=null)
			{
				System.out.print(temp.data+ " ");
			    temp = temp.next;
			}
			System.out.println();
			t--;
		}
	}
}
// } Driver Code Ends



/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	// Your code here
	
// 	 if (head==null || k <= 1) {
//             return null; // No need to process the list if k <= 1
//         }
// 	ArrayList<Integer> list=new ArrayList<>();
// 	Node temp = head;
// 	while(temp!=null){
// 	    list.add(temp.data);
// 	    temp=temp.next;
// 	}
	
	
// for(int i=k-1;i<list.size();i=i+k-1){
//     list.remove(i);
// }
	
// 	Node dummy= new Node(0);
// 	Node current = dummy;
// 	for(int i=0;i<list.size();i++){
// 	    current.next=new Node(list.get(i));
// 	    current=current.next;
	    
// 	}
// 	return dummy.next;



Node head1 = new Node(0), tail = head1;
	Node curr = head;
	int counter = 0;
	
	while(curr!=null){
	    if(counter!=k-1){
	        Node temp = new Node(curr.data);
	        tail.next = temp;
	        tail=temp;
	        counter++;
	    }else{
	        counter=0;
	    }
	    curr = curr.next;
	}
	return head1.next;
    }
}
