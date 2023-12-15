//{ Driver Code Starts
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class count_pairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n1 = sc.nextInt();
            Integer arr1[] = new Integer[n1];

            for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

            int n2 = sc.nextInt();
            Integer arr2[] = new Integer[n2];

            for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

            LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));
            LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));

            int x = sc.nextInt();
            Solution gfg = new Solution();
            System.out.println(gfg.countPairs(head1, head2, x));
        }
    }
}
// } Driver Code Ends




// your task is to complete this function

/*
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
*/

// class Solution {
// public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
    
// ArrayList<Integer> list1 = new ArrayList<>();
// for(int i=0;i<head1.size();i++){
//     list1.add(head1.get(i));
// }
// ArrayList<Integer> list2 = new ArrayList<>();
// for(int i=0;i<head2.size();i++){
//     list2.add(head2.get(i));
// }
//     int k = 0;

//     for (int i = 0; i < list1.size(); i++) {
//         for (int j = 0; j < list2.size(); j++) {
//             if (list1.get(i) + list2.get(j) == x) {
//                 k++;
//                 list2.remove(j); // Remove the used element from list2 to avoid duplicates
//                 break; // Exit the inner loop after finding a match
//             }
//         }
//     }

//     return k;
// }

// }


class Solution {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        // Add elements from head2 to the set
        for (int num : head2) {
            set.add(num);
        }

        // Check for pairs in head1 that sum up to x
        for (int num : head1) {
            if (set.contains(x - num)) {
                count++;
            }
        }

        return count;
    }
}