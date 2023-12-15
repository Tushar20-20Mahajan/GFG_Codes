//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends




class GfG {
    int convertfive(int num) {
        // Your code here
        String str = Integer.toString(num);
        String str1="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                str1+='5';
            }
            else{
                str1+=str.charAt(i);
            }
        }
        
        int a = Integer.parseInt(str1);
        return a;
    }
}