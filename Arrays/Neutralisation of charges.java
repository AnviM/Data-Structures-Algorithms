/*
In a parallel universe, there are not just two charges like positive and negative, but there are  charges represented by english alphabets.Charges have a property of 
killing each other or in other words neutralizing each other if they are of same charge and next to each other.You are given a string  where each  represents a charge,
where .You need to output  of final string followed by string after which no neutralizing is possible.

Sample Input
12
aaacccbbcccd

Sample Output
2
ad

*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        String str = s.next();
        int i,c=0;
        Stack<Character> st = new Stack<Character>();
        for(i=0;i<n;i++)
        {
            char ch=str.charAt(i);
         if(!st.isEmpty() && st.peek()==ch) 
         st.pop();
         else
         st.push(ch); 
        } 
        String s1="";
        while(!st.isEmpty())
        {
            c++;
            s1=st.pop()+s1;
        }
        System.out.println(c);
        System.out.println(s1);
    }
}
