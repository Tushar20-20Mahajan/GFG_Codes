//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		Geeks obj=new Geeks();
    		obj.evenOdd(a,b);
		}
		
	
		
	}
}


// } Driver Code Ends
//User function Template for Java



//User function Template for Java


// Function to check if number is even or odd
class Geeks {
    // 
	 static void evenOdd (int a,int b) 
	 {
		//Your code here
		 if(a%2==0){
            System.out.print(a+"\n"+b);
        }
        else if(b%2==0){
            System.out.print(b+"\n"+a);
        }
        else{
            System.out.print(a+"\n"+b);
        }
        System.out.println();
	     
	 }
}




//{ Driver Code Starts.




// } Driver Code Ends