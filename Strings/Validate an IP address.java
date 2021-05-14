/*
Write a program to Validate an IPv4 Address. According to Wikipedia, IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal
numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1 . The generalized form of an IPv4 address is (0-255).(0-255).(0-255).(0-255).
Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

Your task is  to complete the function isValid which returns 1 if the ip address is valid else returns 0. The function takes a string s as its only argument .

Example :

Input:
ip = 222.111.111.111
Output: 1

Expected Time Complexity: O(N), N = length of string.
Expected Auxiliary Space: O(1)

Asked in :  Amazon, Microsoft, Qualcomm, Zoho.
*/


import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        int d=0,c=0;
        int i;
        int l=s.length();
        char ch;
        String str="";
        int n=0;
        int z=0;
        for(i=0;i<l;i++)
        {
            if(s.equals("0.0.0.0"))
            return true;
            ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            break;
            if(ch!='.')
            str=str+ch;
            else if(ch=='.')
            {
                if(str.equals(""))
                break;
                if(str.charAt(0)=='0' && str.length()>1)
                return false;
                 n=Integer.valueOf(str);
                 if(n==0)
                 z++;
                if(n>=0 && n<=255)
                c++;
                str="";
                d++;
            }
        }
        if(n>=0 && n<=255)
                c++;
          if(n==0)
                z++;  
                
                if( str.length()>1 && str.charAt(0)=='0')
                return false;
        if(z==4)
        return false;
        if(c==4 && d==3)
        return true;
        return false;
    }
}
