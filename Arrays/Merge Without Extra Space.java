/*
Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.
 
Example:

Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.

Question asked in : Amdocs, Brocade, Goldman Sachs, Juniper Networks, Linkedin, Microsoft, Quikr, Snapdeal, Synopsys, Zoho.
*/


import java.util.*;
import java.io.*;
import java.io.*;

class Sorting
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    int arr1[] = new int[n];
		    int arr2[] = new int[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Integer.parseInt(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    new MergeSort().merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class MergeSort
{
    // Function to merge the two sorted arrays
    // arr1[], arr2[]: two input arrays
    // n, m: size of arr1[] and arr2[] respectively
    public static void merge(int arr1[], int arr2[], int n, int m) 
    {
       // add your code here 
        int a[]=new int[n+m];
    int i,k=0;
    for(i=0;i<n;i++)
    a[i]=arr1[i];
    for(i=n;i<n+m;i++)
    {
    a[i]=arr2[k];
    k++;
    }
    Arrays.sort(a);
    for(i=0;i<n;i++)
    arr1[i]=a[i];
    k=n;
    for(i=0;i<m;i++)
    {
        arr2[i]=a[k];
        k++;
    }
    }
}
