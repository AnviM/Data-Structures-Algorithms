/*
Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element K. The task is to find the index of the given element K in the array A.

Example 1:

Input:
N = 9
A[] = {5 6,7,8,9,10,1,2,3}
K = 10
Output: 5
Explanation: 10 is found at index 5.

Question asked in :  Adobe, Amazon, BankBazaar, D-E-Shaw, FactSet, Flipkart, Hike, Intuit, MakeMyTrip, Microsoft, Paytm, Snapdeal, Times Internet.
*/



import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int Search(int array[], int target)
	{
	    // code here
	    int i;
	    for(i=0;i<array.length;i++)
	    {
	        if(array[i]==target)
	        return i;
	    }
	    return -1;
	}
} 

