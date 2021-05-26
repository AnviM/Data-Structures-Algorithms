/*
You are given length of n sides, you need to answer whether it is possible to make n sided convex polygon with it.

Sample Input
2
3
4 3 2 
4
1 2 1 4 

Sample Output
Yes
No

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        // Write your code here
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
        int n = s.nextInt();
        int a[]=new int[n];
        int i,sum=0;
        for(i=0;i<n;i++)
        a[i]= s.nextInt();
        Arrays.sort(a);
        for(i=0;i<n-1;i++)
        sum+=a[i];
        if(a[n-1]<sum)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
    }
}
