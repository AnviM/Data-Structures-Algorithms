/*
Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list.

Example :

Input:
LinkedList: 1->2->2->4->5->6->7->8
K = 4
Output: 4 2 2 1 8 7 6 5 
Explanation: 
The first 4 elements 1,2,2,4 are reversed first and then the next 4 elements 5,6,7,8. Hence, the resultant linked list is 4->2->2->1->8->7->6->5. 

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Asked in : Accolite, Adobe, Amazon, Goldman Sachs, Hike, MakeMyTrip, Microsoft, Paytm, SAP Labs, Snapdeal, VMWare, Walmart.
*/




import java.util.*;
import java.lang.*;

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

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            GfG gfg = new GfG();
            Node res = gfg.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}

// } Driver Code Ends




class GfG
{
    public static Node reverse(Node node, int k)
    {
        //Your code here  
     Node temp=node;
     Node prev=null;
     Node after=null;
     int c=0;
     while(c<k && temp!=null )
     {
         after=temp.next;
         temp.next=prev;
         prev=temp;
         temp=after;
         c++;
     }
     if(after!=null)
     node.next=reverse(after,k);
     
     return prev;
    }
}

