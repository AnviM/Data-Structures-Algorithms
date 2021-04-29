/*
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

Example :

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12.

Question asked in : Amazon, Facebook, Google, Visa.
*/

#include <bits/stdc++.h>
using namespace std;


// Function to find the subarray with given sum k
// arr: input array
// n: size of array
void subarraySum(int arr[], int n, int s){
    
    // Your code here
    
    int sum = arr[0], j = 0, i,flag=0; 
        for (i = 1; i <= n; i++)
        { 
            while (sum > s && j < i - 1) 
            { 
                sum = sum - arr[j]; 
                j++; 
            } 
            
            if (sum == s) 
            { 
                int p = i - 1; 
                cout<<j+1<<" "<< p+1; 
                flag++;
                break;
            }
            if (i < n) 
                sum = sum + arr[i]; 
        } 
        if(flag==0)
        cout<<-1; 
         
}

// { Driver Code Starts.

int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        long long s;
        cin>>n>>s;
        int arr[n];
        
        for(int i=0;i<n;i++)
            cin>>arr[i];
        
        subarraySum(arr, n, s);
        cout<<endl;
        
    }
	return 0;
}  // } Driver Code Ends
