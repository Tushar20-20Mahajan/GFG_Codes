//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends




//User function template for JAVA

/*You are required to complete this method */
class Solution {
    int atoi(String str) {
        // Your code here
        if (str.charAt(0) != '-' && (str.charAt(0) < '0' || str.charAt(0) > '9')) {
            return -1;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return -1;
            }
        }
        int a = Integer.parseInt(str);
        return a;
    }
}