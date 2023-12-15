//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends




// class GfG
//  {
// 	String encode(String str)
// 	{
//           //Your code here
//           String str1="";
//           for(int i=0;i<str.length();i++){
//               int count=0;
              
//               if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
//                   count++;
//               }
//               count++;
//               String ss = Integer.toString(count);
//               if(i+1<str.length() && str.charAt(i)!=str.charAt(i+1)){
//                   str1+=str.charAt(i);
//                   str1+=ss;
                  
//               }
//           }
//           return str1;
// 	}
	
//  }


class GfG {
    String encode(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return empty string if input is null or empty
        }

        StringBuilder encodedStr = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                encodedStr.append(str.charAt(i));
                encodedStr.append(count);
                count = 1;
            }
        }

        return encodedStr.toString();
    }
}