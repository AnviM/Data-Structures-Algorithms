/*
Sherlock Holmes loves mind palaces! We all know that. A mind palace, according to Mr. Holmes is something that lets him retrieve a given memory in the least time 
posible. For this, he structures his mind palace in a very special way. Let a NxM Matrix denote the mind palace of Mr. Holmes. For fast retrieval he keeps each row
and each column sorted. Now given a memory X, you have to tell the position of the memory in Sherlock's mind palace.

Input
Input begins with a line containing space separated N and M.
The next N lines each contain M numbers, each referring to a memory Y.
The next line contains Q, the number of queries.
The next Q lines contain a single element X, the memory you have to search in Sherlock's mind palace.

Output
If Y is present in Mr. Holmes memory, output its position (0-based indexing).
Else output "-1 -1" (quotes for clarity only).

Constraints
2 ≤ N,M ≤ 1000
2 ≤ Q ≤ 1000
-10^9 ≤ X,Y ≤ 10^9

Note : Large Input Files. Use faster I/O methods.

Sample Input
5 5
-10 -5 -3 4 9
-6 -2 0 5 10
-4 -1 1 6 12
2 3 7 8 13
100 120 130 140 150
3
0
-2
170

Sample Output
1 2
1 1
-1 -1

*/




#include <bits/stdc++.h>
 
using namespace std;
 
int main()
 
{
 
int n,m;
 
scanf("%d %d",&n,&m);
 
map<int,pair<int,int>> my_map;
 
for(int i=0;i<n;i++)
 
{
 
    int val;
 
    for(int j=0;j<m;j++)
 
    {
 
        scanf("%d",&val);
 
        my_map[val]=make_pair(i,j);
 
        
 
    }
 
}
 
int q;
 
scanf("%d",&q);
 
while(q--)
 
{
 
int x;
 
    scanf("%d",&x);
 
    
 
    if(my_map.find(x)!=my_map.end())
 
    {
 
         cout<<my_map[x].first<<" "<<my_map[x].second<<endl;
 
    }
 
    else
 
    {
 
        printf("-1 -1\n");
 
    }
}
}
