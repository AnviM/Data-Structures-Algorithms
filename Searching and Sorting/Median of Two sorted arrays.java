/*
Given two sorted arrays of sizes N and M respectively. The task is to find the median of the two arrays when they get merged.

Example :

Input:
N = 5, M = 6 
arr[] = {1,2,3,4,5}
brr[] = {3,4,5,6,7,8}
Output: 4
Explanation: After merging two arrays, elements will be as 1 2 3 3 4 4 5 5 6 7 8 . So, median is 4.

Question asked in : D-E-Shaw, Linkedin, Ola Cabs, Samsung.
*/


import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n,m;
		    n=sc.nextInt();
		    m=sc.nextInt();
		    
		    int arr[]=new int[n];
		    int brr[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<m;i++)
		    {
		        brr[i]=sc.nextInt();
		    }
		    
		     if(n < m)
	        System.out.println(findMedian(arr, n, brr, m));
	         else
	        System.out.println(findMedian(brr, m, arr, n));
		}
	}
	    
 // } Driver Code Ends


//User function Template for Java


public static int findMedian(int arr[], int n, int brr[], int m){
    //Your code here
    int a[]=new int[m+n];
    int i,j;
    for(i=0;i<n;i++)
    a[i]=arr[i];
    for(i=n;i<n+m;i++)
    {
        a[i]=brr[i-n];
    }
    Arrays.sort(a);
    if((n+m) % 2!=0)
    return a[(n+m+1)/2 - 1];
    return ((a[(n+m)/2]+a[(n+m)/2 - 1])/2);

 }


}  
