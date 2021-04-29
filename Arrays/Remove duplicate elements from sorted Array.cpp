/*
Given a sorted array A of size N, delete all the duplicates elements from A.

Example :

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: 2
Explanation: After removing all the duplicates only one instance of 2 will remain.

Question asked in :  Morgan Stanley, Samsung, Wipro, Xome, Zoho, Microsoft.
*/


#include<bits/stdc++.h>
using namespace std;

/*You are required to complete this function */

int remove_duplicate(int [],int );

int main()
{
    int T;
    cin>>T;
    while(T--)
    {
        int N;
        cin>>N;
        int a[N];
        for(int i=0;i<N;i++)
        {
            cin>>a[i];
        }

    int n = remove_duplicate(a,sizeof(a)/sizeof(a[0]));

    for(int i=0;i<n;i++)
        cout<<a[i]<<" ";
    cout<<endl;
    }
}
// } Driver Code Ends


/*You are required to complete this function */
int remove_duplicate(int A[],int N)
{
//Your code here
int i,j=A[0],c=1;
for(i=1;i<N;i++)
{
    if(j!=A[i])
    {   A[c]=A[i];
        j=A[i];
        c++;
    }
}
return c;
}
