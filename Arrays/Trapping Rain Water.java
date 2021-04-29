/*
Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 
Example :

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10

Question asked in : Amazon, Microsoft
*/

import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Trap obj = new Trap();
		    
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Trap{
    
    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
    static int trappingWater(int arr[], int n) { 
        
        // Your code here
        int left[]=new int[n];
    int right[]=new int[n];
    int water =0;
    left[0]=arr[0];
    int i;
    for(i=1;i<n;i++)
        left[i] = Math.max(left[i - 1], arr[i]); 
    right[n - 1] = arr[n - 1]; 
    for (i = n - 2; i >= 0; i--) 
        right[i] = Math.max(right[i + 1], arr[i]); 
    for (i = 0; i < n; i++) 
        water += Math.min(left[i], right[i]) - arr[i]; 
  
    return water; 
        
    } 
}

