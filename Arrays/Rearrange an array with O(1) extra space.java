/*
Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that arr[i] becomes arr[arr[i]].

Example:

Input:
N = 2
arr[] = {1,0}
Output: 0 1
Explanation: 
arr[arr[0]] = arr[1] = 0.
arr[arr[1]] = arr[0] = 1.

Question asked in AMAZON.
*/



import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            long arr[] = new long[(int)n];
            
            for(int i = 0; i < n; i++)
                arr[(int)i]  =Integer.parseInt(st[(int)i]);
                
           new rearrange().arrange(arr, n);
           for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class rearrange
{
    // Function to rearrange the elements
    // arr: input array
    // n: size of array
    static void arrange(long arr[], int n)
    {
        // your code here
        int i,temp;
        long a[]=new long[n];
    for(i=0;i<n;i++)
    {
        
        a[i]=arr[(int)arr[i]];
    }
    for(i=0;i<n;i++)
    arr[i]=a[i];
    }
}
