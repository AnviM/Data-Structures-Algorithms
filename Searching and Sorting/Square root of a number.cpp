/*
Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x). 

Example :

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect square, floor of square_root of 5 is 2.

Question asked in : Accolite, Amazon, Flipkart, Microsoft, VMWare.
*/


#include<bits/stdc++.h>
using namespace std;

long long int floorSqrt(long long int x);
  

 // } Driver Code Ends


// Function to find square root
// x: element to find square root
long long int floorSqrt(long long int x) 
{
    // Your code goes here   
    int i;
    if(x==1)
    return 1;
    for(i=2;i*i<=x;i++)
    {
        if(i*i==x)
        return i;
    }
    return floor(sqrt(x));
}

// { Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		cout << floorSqrt(n) << endl;
	}
    return 0;   
}
  // } Driver Code Ends
