/*
Given a string S, find the length of its longest substring that does not have any repeating characters.

Example :

Input:
S = geeksforgeeks
Output: 7
Explanation: The longest substring without repeated characters is "ksforge".

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Asked in :  Amazon, Google.
*/



import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        String s = br.readLine();
	        Solution T = new Solution();
	        System.out.println(T.SubsequenceLength(s));
	        
            t--;
	    }
	}
    
}



// } Driver Code Ends


//User function Template for Java


class Solution
{
    

    int SubsequenceLength(String s) 
    {
        // Code here    
        HashSet<Character> set=new HashSet<Character>();
        int i=0,j=0;
        int r=0;
        while(j<s.length())
        {
            if(set.contains(s.charAt(j)))
            {
                set.remove(s.charAt(i));
                i++;
            }
            else
            {
                set.add(s.charAt(j));
                r=Math.max(r,j-i+1);
                j++;
            }
        }
        return r;
    }
    
}
