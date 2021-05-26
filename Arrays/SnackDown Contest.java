/*
You and your roommate are teammates in SNACKDOWN competition. There are N questions in SNACKDOWN round numbered from 1 to N.  You can do some particular P questions while 
your roommate can do some particular Q questions.Now the question is will your team be able to solve all the N questions if you work together? 

Input Format- 
First line of input contains number of test cases, T.
First line of each test case contains the integer N.
Second line of each test case contains the integer P then followed by P distinct space seperated integers integers a1, a2,..,ap (1<=ai<=N) which denote the questions you
can solve.
Second line of each test case contains the integer Q followed by Q distinct integers which denote the questions your roommate can solve in the same format as above line.
It's assumed that levels are numbered from 1 to N.

Output Format - 
For every test case print "YES" (without quotes) if your team will be able to solve all the N questions, otherwise print "NO" (without quotes) in a new line.

Sample Input
2
4
3 1 2 3
2 2 4
4
3 1 2 3
2 2 3

Sample Output
YES
NO

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); 
        while(t-->0)
        {
            int n= s.nextInt(); 
            int p=s.nextInt(); 
            int i,d=0;
            int a[]=new int[p];
            for(i=0;i<p;i++)
            {
                a[i]=s.nextInt(); 
            }
            int q=s.nextInt();
            int b[]=new int[q];
             for(i=0;i<q;i++)
            {
                b[i]=s.nextInt(); 
            }
            int c[]=new int[p+q];
            int k=0;
            for(i=0;i<p+q;i++)
            {
                if(i<p)
                c[i]=a[i];
                else
                {
                c[i]=b[k];
                k++;
                }
            }
            int flag=0;
            for(i=1;i<=n;i++)
            {
                d=0;
                for(int j=0;j<p+q;j++)
                {
                    if(c[j]==i)
                    {
                        d++;
                        break;
                    }
                }
                    if(d==0)
                    {
                    flag=1;
                    break;
                    }
            }
            if(flag==1)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
    }
}
