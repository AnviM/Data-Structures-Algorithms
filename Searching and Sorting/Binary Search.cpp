/*
Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

Example :

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Question asked in :  Accenture, Cognizant, Infosys, Linkedin, Oracle, Qualcomm, TCS, Wipro.
*/


#include<bits/stdc++.h>
using namespace std;

int bin_search(int A[],int left,int right,int k);

int main()
{
    int t;
    cin>>t;

    while(t--)
    {
        int N;
        cin>>N;
        int a[N];
        for(int i=0;i<N;i++)
            cin>>a[i];
        int key;
        cin>>key;
        int found = bin_search(a,0,N-1,key);
        cout<<found<<endl;
    }
}
// } Driver Code Ends


/*You need to complete this function */
int bin_search(int A[], int left, int right, int k)
{
    int sk,c=0;
while(left<=right)
{
    int mid = (left+right)/2;
    if(A[mid]==k)
    {
        sk=mid;
        c++;
        break;
    }
    if(k<A[mid])
    right=mid-1;
    if(k>A[mid])
    left=mid+1;
  }
  if(c==0)
  sk=-1;
  return sk;
}
