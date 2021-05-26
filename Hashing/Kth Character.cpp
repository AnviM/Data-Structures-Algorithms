/*
Given a string  of length N, you have to answer Q queries. Each query includes a range ( L and R ) and a number K. For every query to have to print the lexicographically 
kth smallest alphabet in the given range.

The output should contain q lines, each line representing the th character in the given range of the query.

The string consists of small english alphabets
Sample Input
10 5
ababcdabcd
1 4 2
1 4 3
1 5 5
1 10 8
7 10 3

Sample Output
a
b
c
c
c

*/



#include<bits/stdc++.h>
 
 
 
using namespace std;
 
 
 
const int N=1e6+10;
 
int arr[N][26];
 
int main()
 
{
 
    ios_base::sync_with_stdio(false);
 
    cin.tie(NULL);
 
    cout.tie(NULL);
 
 
 
    long long int n,q;
 
    cin>>n>>q;
 
 
 
    string str;
 
    cin>>str;
 
 
 
    for(int i=1;i<=n;i++)
 
    {
 
        arr[i][str[i-1]-'a']++;
 
        for(int j=0;j<26;j++)
 
        {
 
            arr[i][j]+=arr[i-1][j];
 
        }
 
    }
 
 
 
    while(q--)
 
    {
 
        long long int l,r,idx,ans=0;
 
        cin>>l>>r>>idx;
 
        
 
        for (int i=0;i<26;i++)
 
            {
 
                ans+=arr[r][i]-arr[l-1][i];
 
                if(ans>=idx)
 
                    {
 
                        cout<<(char)('a'+i)<<"\n";
 
                        break;
 
                    }
 
            }
 
    }
 
}
