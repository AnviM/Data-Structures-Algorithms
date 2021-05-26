/*
You are given 10^6 boxes that are numbered from 1 to 10^6. The value of each box is equal to its number. There are N ranges and every range consists of two integers L and
R denoting that the value of box in the range  will turn out to be zero. Find the sum of values of all boxes from  to  .
Note: The ranges may overlap.

Input format
First line: Integer 
Next N lines: Two space-separated integers  and   
Output format
Print a single integer denoting the answer.

Sample Input
5
2 20
23 200
21 21
101 2000
2002 999998

Sample Output
2002023

Explanation
Boxes having number 1, 22, 2001, 999999,1000000 does not belong to any range.
So the sum of these numbers is 2002023 which is our answer.

*/


import java.io.*;
 
import java.util.*;
 
 
 
 
 
public class TestClass {
 
public static void main(String[] args) throws IOException {
 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
PrintWriter wr = new PrintWriter(System.out);
 
int n = Integer.parseInt(br.readLine().trim());
 
int[] L = new int[n];
 
int[] R = new int[n];
 
for(int i_L=0; i_L<n; i_L++)
 
{
 
   String[] tmp = br.readLine().split(" ");
 
L[i_L] = Integer.parseInt(tmp[0]);
 
   R[i_L] = Integer.parseInt(tmp[1]);
 
   
 
}
 
 
 
 
long out_ = NotinRange(R, L, n);
 
System.out.println(out_);
 
 
 
 
wr.close();
 
br.close();
 
}
 
static long NotinRange(int[] R, int[] L, int n){
 
// Write your code here
 
long sum = getSum(1,1000000);
 
sort(L,R);
 
for(int i=0;i<n;i++){
 
if(i<n-1 && R[i]>=L[i+1]){
 
L[i+1] = R[i]+1;
 
}
 
if(L[i]>R[i]){
 
L[i]=0;
 
}
 
if(L[i]!=0){
 
sum-=getSum(L[i],R[i]);
 
}
 
}
 
return sum;
 
}
 
 
 
 
static long getSum(int start,int end){
 
long s = (long)start;
 
long e = (long)end;
 
long sum = (e - s + 1)*(e + s)/2;
 
return sum;
 
}
 
 
 
 
static void sort(int L[],int R[])
 
{
 
int n = L.length;
 
for (int i = 1; i < n; ++i) {
 
int keyL = L[i];
 
int keyR = R[i];
 
int j = i - 1;
 
while (j >= 0 && L[j] > keyL) {
 
L[j + 1] = L[j];
 
R[j + 1] = R[j];
 
j = j - 1;
 
}
 
L[j + 1] = keyL;
 
R[j + 1] = keyR;
 
}
 
}
 
}
