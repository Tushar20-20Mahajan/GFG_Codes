//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends




/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
		while(!s.isEmpty()){
		    list.add(s.peek());
		    s.pop();
		}
		
		java.util.Collections.sort(list);
		Stack<Integer> ss = new Stack<>();
		for(int i=0;i<list.size();i++){
		    ss.push(list.get(i));
		}
		return ss;
		
	}
}

