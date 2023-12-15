//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends




//User function Template for Java

class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        ArrayList<Long> list = new ArrayList<>();
        String str1 = "Yes";
        String str2 = "No";

        // Convert a1[] to an ArrayList
        for (int i = 0; i < n; i++) {
            list.add(a1[i]);
        }

        // Check if elements of a2[] are present in a1[] using ArrayList
        for (int i = 0; i < m; i++) {
            if (list.contains(a2[i])) {
                list.remove(Long.valueOf(a2[i]));
            } else {
                return str2;
            }
        }

        return str1;
    }
}