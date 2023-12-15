//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int m =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
          //  long a[] = new long[n];
           // for (int i = 0; i < n; i++) {
           //     a[i] = Long.parseLong(a1[i]);
           // }
    //        int k = Integer.parseInt(br.readLine());
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[m];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
     //       int k = Integer.parseInt(br.readLine());
            Solution ob = new Solution();
            String ans=ob.MaxZero(a1,n);
//            for(int i=0;i<n;i++)
//                System.out.print(ans.get(i)+" ");
            System.out.println(ans);
        }
    }
}







// } Driver Code Ends




//User function Template for Java


class Solution
{
    String MaxZero(String arr[], int N)
    {
        if(N==1){
            for(int i=0;i<arr[0].length();i++){
                if(arr[0].charAt(i)=='0'){
                    return arr[0];
                }
            }
            return "-1";
        }
        Long maxCount = Long.MIN_VALUE;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            Long count =(long)0;
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)=='0'){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                
                list.add(arr[i]);
            }else if(count==maxCount){
                java.math.BigInteger a = new java.math.BigInteger(list.get(list.size()-1));
                java.math.BigInteger b = new java.math.BigInteger(arr[i]);
                java.math.BigInteger max= a.max(b);
                String str = max.toString();
                list.add(str);
            }
            
        }
        if(list.isEmpty()){
            return "-1";
        }
        return list.get(list.size()-1);

    }
}