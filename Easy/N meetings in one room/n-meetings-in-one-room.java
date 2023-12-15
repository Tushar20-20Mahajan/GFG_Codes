//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




// class Solution 
// {
//     //Function to find the maximum number of meetings that can
//     //be performed in a meeting room.
//     public static int maxMeetings(int start[], int end[], int n)
//     {
//         // add your code here
//         int count =1;
//         for(int i=0;i<n-1;i++){
//             if(i+1<n && i-1>0 && start[i]>end[i-1] && start[i]<end[i]  ){
//                 count++;
//             }
//         }
//         return count;
//     }
// }




class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n) {
        // Create an array of Meeting objects to store start and end times
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
        }

        // Sort the meetings array based on the end times
        Arrays.sort(meetings, Comparator.comparingInt(a -> a.end));

        int count = 1; // First meeting can always be attended
        int lastEnd = meetings[0].end;

        // Check if each meeting can be attended
        for (int i = 1; i < n; i++) {
            if (meetings[i].start > lastEnd) {
                count++;
                lastEnd = meetings[i].end;
            }
        }

        return count;
    }

    // Inner class representing a meeting with start and end times
    static class Meeting {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}