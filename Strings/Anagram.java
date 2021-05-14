/*
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. 
An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
For example, “act” and “tac” are an anagram of each other.

Example :

Input:
a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with same frequency. So, both are anagrams.

Expected Time Complexity: O(|a|+|b|).
Expected Auxiliary Space: O(Number of distinct characters).

Asked in :  Nagarro, Media.net, Directi

*/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int m,t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(m=0;m<t;m++)
		{
		    String s=sc.next();
		    String a=sc.next();
		    int i,j,count=0,l=a.length();
		    if(s.length()==a.length())
		    {
		      int c=0;
		        for(j=0;j<l;j++)
		        {
		            if(s.indexOf(a.charAt(j))!=-1)
		            c++;
		        }
		        if(c==l)
		        count++;
		    if(count==0)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		}
		else
		System.out.println("NO");
		}
	}
}
