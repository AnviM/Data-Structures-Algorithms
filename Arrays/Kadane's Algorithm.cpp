/*
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Example:

Input:
N = 5
arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.

Question asked in : 24*7 Innovation Labs, Accolite ,Amazon, Citrix, D-E-Shaw, FactSet, Flipkart, Hike, Housing.com,MetLife, Microsoft, Morgan Stanley,
Ola Cabs, Oracle, Payu, Samsung, Snapdeal, Teradata, Visa, Walmart, Zoho.
*/



#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends


// Function to find subarray with maximum sum
// arr: input array
// n: size of array
int maxSubarraySum(int arr[], int n){
    
    // Your code here
    int sum=arr[0],max1=arr[0],i;
    for(i=1;i<n;i++)
    {
        sum=max(arr[i],sum+arr[i]);
        max1=max(sum,max1);
        
    }
    return max1;
}

// { Driver Code Starts.

int main()
{
    int t,n;
    
    cin>>t; //input testcases
    while(t--) //while testcases exist
    {
        
        cin>>n; //input size of array
        
        int a[n];
        
        for(int i=0;i<n;i++)
            cin>>a[i]; //inputting elements of array
        
        cout << maxSubarraySum(a, n) << endl;
    }
}
  // } Driver Code Ends
