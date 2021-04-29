/*
Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
Example :

Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9

 Question asked in : Amazon, Boomerang Commerce, Goldman Sachs, Grofers, Medlife, Microsoft, Oracle, Paytm, Qualcomm, Snapdeal, Target Corporation, Wipro.
 */


import java.util.*;

class Merge_Sort
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void mergeSort(int arr[], int l, int r)
    {
        GfG g = new GfG();
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
            g.merge(arr, l, m, r);
        }
    }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			Merge_Sort ms = new Merge_Sort();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			GfG g = new GfG();
			mergeSort(arr,0,arr.length-1);

			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends


/* The task is to complete merge() which is used
in below mergeSort() */
class GfG
{
   // Merges two subarrays of arr[].  First subarray is arr[l..m]
   // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1=m-l+1;
         int n2=r-m;
         int L[]=new int[n1];
         int R[]=new int[n2];
         int i,j;
         for(i=0;i<n1;i++)
         L[i]=arr[l+i];
         for(j=0;j<n2;j++)
         R[j]=arr[m+1+j];
         i=0;
         j=0;
         int k=l;
         while(i<n1 && j<n2)
         {
             if(L[i]<=R[j])
             {
                 arr[k]=L[i];
                 i++;
             }
             else
             {
                 arr[k]=R[j];
                 j++;
             }
             k++;
         }
         while(i<n1)
         {
             arr[k]=L[i];
             i++;
             k++;
         }
         while(j<n2)
         {
             arr[k]=R[j];
             j++;
             k++;
         }
    }
}
