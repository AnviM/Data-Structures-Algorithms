/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such 
that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).

Example :

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.

Question asked in : Amazon, FactSet, Goldman Sachs, Paytm, Microsoft.
*/



import java.io.*;
import java.util.*;

class ArrayWave {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());// taking size of array
		    int arr[] = new int[n]; // declaring array of size n
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Wave obj = new Wave();
		    
		    
		    obj.convertToWave(arr, n);
		    
		    StringBuffer sb = new StringBuffer(); 
            for (int i = 0; i < n; i++) 
                sb.append(arr[i] + " "); 
                
		    System.out.println(sb); // print array
		}
	}
}


 // } Driver Code Ends


class Wave{

    
    // Function to convert the given array to wave like array
    // arr: input array
    // n: size of the array
    public static void convertToWave(int arr[], int n){
        
        // Your code here
        int i,temp;
        for(i=0;i<n-1;i+=2)
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    
}
