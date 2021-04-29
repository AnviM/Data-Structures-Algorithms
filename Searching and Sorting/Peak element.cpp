/*
A peak element in an array is the one that is not smaller than its neighbours.
Given an array of size N, find the index of any one of its peak elements.
 
Example :

Input:
N = 3
arr[] = {1,2,3}
Output: 2 
Explanation: index 2 is 3. It is the peak element as it is greater than its neighbour 2.

Question asked in :  Adobe, Amazon, Google, Visa.
*/


#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends


/* The function should return the index of any
   peak element present in the array */

// arr: input array
// n: size of array
int peakElement(int arr[], int n)
{
   // Your code here
   int start = 0;
        int end = n - 1;
 
        while (start <= end) {
            int mid = (start + end) / 2;
 
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return mid; // array[mid] is peak element
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
   
}

// { Driver Code Starts.

int main() {
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		bool f=0;
		int A = peakElement(a,n);
		
		if(n==1)
		f=1;
		else
		if(A==0 and a[0]>=a[1])
		f=1;
		else if(A==n-1 and a[n-1]>=a[n-2])
		f=1;
		else if(a[A] >=a[A+1] and a[A]>= a[A-1])
		f=1;
		else
		f=0;
		
		cout<<f<<endl;
		
	}

	return 0;
}  // } Driver Code Ends
