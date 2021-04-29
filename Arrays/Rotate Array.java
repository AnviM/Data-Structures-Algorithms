/*
Given an unsorted array arr[] of size N, rotate it by D elements in the counter-clockwise direction. 

Example:

Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.

Question asked in :  Amazon, MAQ Software, Microsoft
*/


import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		String[] starr=str.split(" ");
    	    int n=Integer.parseInt(starr[0]);
    		int d= Integer.parseInt(starr[1]);
    		
            int[] arr=new int[n];
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		for(int j=0;j<n;j++)
    		{
    		  arr[j]= Integer.parseInt(starr1[j]);
    		}
    		
            new Solution().rotateArr(arr, d, n);
    		StringBuffer sb=new StringBuffer();
            for(int t1=0;t1<n;t1++)
                sb.append(arr[t1]+" ");
            System.out.println(sb);
         }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int a[]=new int[n];
        int i,j,k=0;
        for(i=d;i<n;i++)
        {
            a[k]=arr[i];
            k++;
        }
        for(i=0;i<d;i++)
        {
            a[k]=arr[i];
            k++;
        }
        for(i=0;i<n;i++)
        arr[i]=a[i];
    }
}
