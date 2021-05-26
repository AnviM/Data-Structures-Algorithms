/*
Micro purchased an array A having N integer values. After playing it for a while, he got bored of it and decided to update value of its element. In one second he can 
increase value of each array element by 1. He wants each array element's value to become greater than or equal to K. Please help Micro to find out the minimum amount of 
time it will take, for him to do so.

Input:
First line consists of a single integer, T, denoting the number of test cases.
First line of each test case consists of two space separated integers denoting N and K.
Second line of each test case consists of N space separated integers denoting the array A.

Output:
For each test case, print the minimum time in which all array elements will become greater than or equal to K. Print a new line after each test case.

Sample Input
2
3 4
1 2 5
3 2
2 5 5

Sample Output
3
0

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      
        // Write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0)
        {
            t--;
            int n,m,i;
            n=s.nextInt();
            m=s.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            a[i]=s.nextInt();
            Arrays.sort(a);
            int x=a[0];
            if(x>=m)
            x=0;
            else
            x=m-x;
            System.out.println(x);
        } 
    }
}
