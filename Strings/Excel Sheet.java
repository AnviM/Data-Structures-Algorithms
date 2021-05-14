/*
Given a positive integer N, return its corresponding column title as it would appear in an Excel sheet.
For N =1 we have column A, for 27 we have AA and so on.

Note: The alphabets are all in uppercase.

Example :

Input:
N = 51
Output: AY

Expected Time Complexity: O(Log(N))
Expected Auxiliary Space: O(Log(N))

Asked in :  Amazon

*/





import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        int n = Integer.parseInt(br.readLine());
	        Solution T = new Solution();
	        
	        System.out.println(T.excelColumn(n));
	        
            t--;
	    }
	}
    
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public String excelColumn(int N){
        
        //  Your code here
       String s="";
        while(N>0)
        {
            N--;
            s=(char)('A'+N%26)+s;
            N=N/26;
        }
        return s;
        
        
        
    }
}
