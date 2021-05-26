/*
Chetan and Fauji are playing a game. They were having a rectangular matrix in the form of xy-plane. They have N points (xi,yi) on which one can go at any instant of time, 
1  i  N. There is one condition to call a pair safe that is one has to maintain some distance from other such that (xi - xj) + (yi - yj) = S where . You have to find such
total number of safe pairs on the rectangular matrix.

INPUT FORMAT:
First line contain an integer N, number of points.
Next N lines contain two space saperated integers (xi,yi).
Next line contain an integer S.

OUTPUT FORMAT:
Print the count of total number of safe pairs which satisfy the above mentioned criteria.

Sample Input
4
1 2
2 -2
2 1
0 3
0


Sample Output
10
*/




import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            b[i]=s.nextInt();
            if(!map.containsKey(a[i]+b[i]))
                map.put(a[i]+b[i],1);
            else
                map.put(a[i]+b[i],map.get(a[i]+b[i])+1);
        }              
        int sum=s.nextInt();
        int count=0;
        for(i=0;i<n;i++)
        {
            int r=a[i]+b[i];
            if(map.containsKey(sum+r))
            {
                count=count+map.get(sum+r);
            }
        }
        System.out.println(count);    
    }
}
