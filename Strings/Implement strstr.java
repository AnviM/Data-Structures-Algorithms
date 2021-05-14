/*
Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. 
The function returns and integer denoting the first occurrence of the string x in s (0 based indexing). 

Example :

Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the string GeeksForGeeks as substring.

Expected Time Complexity: O(|s|*|x|)
Expected Auxiliary Space: O(1)

Asked in :  Amazon, Facebook, Microsoft, Qualcomm.
*/



import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends


/*
the function returns the 
position where the target string 
matches the string str

Your are required to complete this method */

class GfG
{
    int strstr(String str, String target)
    {
       // Your code here
       if(str.indexOf(target)==-1)
     return -1;
     else
     return str.indexOf(target);
    }
}
