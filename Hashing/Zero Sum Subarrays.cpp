/*
You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.

Example :

Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0].

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

Asked in :  Amazon, Microsoft, OYO Rooms.
*/



#include<bits/stdc++.h>
using namespace std;
#define ll long long


class Solution{
    public:
    //Function to count subarrays with sum equal to 0.
    ll findSubarray(vector<ll> arr, int n ) {
        //code here
        ll sum = 0;
	unordered_map<int, int>mp;
	mp[0] = 1;
	int temp = 0;
	for (int i = 0; i < n; i++) {
		temp += arr[i];
		if (mp.find(temp) != mp.end()) {
			sum += mp[temp];
			mp[temp]++;
		}
		else {
			mp[temp]++;
		}
	}
	return sum;
    }
};

// { Driver Code Starts.
int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n; //input size of array
       
        vector<ll> arr(n,0);
        
        for(int i=0;i<n;i++)
            cin>>arr[i]; //input array elements
        Solution ob;
        cout << ob.findSubarray(arr,n) << "\n";
    }
	return 0;
}  // } Driver Code Ends
