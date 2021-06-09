/*
You are given a linked list that contains  integers. You have performed the following reverse operation on the list:
Select all the subparts of the list that contain only even integers. Now, you are required to retrieve the original list.

Sample Input
9
2 18 24 3 5 7 9 6 12

Sample Output
24 18 2 3 5 7 9 12 6
*/




import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();    
        LinkedList<Integer> ll=new LinkedList<Integer>();
        Stack<Integer> st=new Stack<Integer>();
        int i;
        for(i=0;i<t;i++)
        {
            int x=s.nextInt();
            if(x%2==0)
            st.push(x);
            else
            {
                if(!st.isEmpty())
                {
                    while(!st.isEmpty())
                    ll.add(st.pop());
                }
                ll.add(x);
            }
        }
        if(!st.isEmpty())
                {
                    while(!st.isEmpty())
                    ll.add(st.pop());
                }
        for(i=0;i<t;i++)
        System.out.print(ll.get(i)+" ");
    }
}
