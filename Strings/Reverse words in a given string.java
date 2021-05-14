/*
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example :

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole string(not individual words), the input string becomes : much.very.program.this.like.i

Question asked in : Accolite, Adobe, Amazon, Cisco, Goldman Sachs, MakeMyTrip, Microsoft, Paytm, Samsung, SAP Labs.
*/


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends



class Solution {
    String reverseWords(String s) {
        // code here 
        Stack<String>st=new Stack<String>();
        String a="";
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='.')
            a=a+s.charAt(i);
            else
            {
                st.push(a);
                st.push(".");
                a="";
            }
        }
        st.push(a);
        String b="";
        while(!st.isEmpty())
        b=b+st.pop();
        return b;
    }
}
