/*
You are given Q querries and in each query you are given a  number N, Print its factorial under modulo 1000000007.
Constraints:
 1 <= Q <= 10^5
10 points:  1<= N <= 12
40 points: 1<= N <= 100
100 points: 1<= N <= 10^5
Input -> 
First Line of Input contains an integer Q which denotes the number of query.
Each query contains a single integer N.
Output ->For each query, output a single integer M which is your answer.

Sample Input
3
5
2
6

Sample Output
120
2
720

*/



#include <bits/stdc++.h> 
using namespace std; 
 
int main() {
	int n;
	cin >> n;
	vector<long long int> v;
	long long int i;
	v.push_back(1);
	v.push_back(1);
	for(i=2;i<1000005;i++)
	{
		v.push_back((v[i-1]*i)%1000000007);
	}
	while(n-->0)
	{
		long long int x;
		cin>>x;
		cout<<v[x]<<endl;
	}
	return 0;
}	
