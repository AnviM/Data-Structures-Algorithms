/*
Given an array of positive integers and an integer. Determine whether or not there exist two elements in A whose sum is exactly equal to that integer.

Example :

Input:
N = 6, X = 16
A[] = {1,4,45,6,10,8}
Output: Yes
Explanation: 10 and 6 are numbers making a pair whose sum is equal to 16.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Asked in : Accolite, Amazon, CarWale, FactSet, Flipkart, Google, Hike, Microsoft, Morgan Stanley, SAP Labs, Wipro, Zoho.
*/



import java.io.*;
import java.util.*;

class GFG 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0)
        {
            String[] nx = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nx[0]);
            int x = Integer.parseInt(nx[1]);
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            
            Solution sln = new Solution();
            if (sln.keypair(a, n, x) == true) 
                System.out.println("Yes");
            else 
                System.out.println("No");
        }
    }
}// } Driver Code Ends


class Solution
{
    // A[] : the input array of positive integers
    // N : size of the array arr[]
    // X : the required sum
    public boolean keypair(int[] A, int N, int X)
    {
        // code here
        int i;
        HashSet<Integer>set=new HashSet<Integer>();
       
        for(i=0;i<N;i++)
        {
            if(set.contains(X-A[i]) )
            return true;
            set.add(A[i]);
        }
        return false;
    }
}
