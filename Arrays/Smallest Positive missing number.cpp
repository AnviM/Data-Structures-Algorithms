/*Smallest Positive missing number
Given an array arr[] of size N, find the smallest positive number missing from the array. 

Example:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing
number is 6.*/

#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends


// Function to find missing integer in array
// arr: input array
// n: size of array
int findMissing(int arr[], int n) { 
    
    // Your code here
    sort(arr,arr+n);
    int i;
    if(n==1)
    return 1;
    for(i=0;i<n-1;i++)
    {
        if(arr[i]<0 && arr[i+1]>1)
        return 1;
        if(arr[i]>=0)
        {
         int t=arr[i+1]-arr[i];
         if(t!=1 && t!=0)
         return (arr[i]+1);
        }
    }
    return arr[n-1]+1;
}

// { Driver Code Starts.

int main() { 
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int arr[n];
        
        for(int i=0; i<n; i++)cin>>arr[i];
        
        cout<<findMissing(arr, n)<<endl;
    }
    return 0; 
}   // } Driver Code Ends
