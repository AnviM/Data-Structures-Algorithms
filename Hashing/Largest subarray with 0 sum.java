/*
Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example :

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with sum 0 will be -2 2 -8 1 7.

Expected Time Complexity: O(N*Log(N)).
Expected Auxiliary Space: O(N).

Question asked in :  Amazon, MakeMyTrip, Microsoft.
*/



import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here 
        int maxLength = 0, prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0)
                maxLength = i + 1;
            Integer index = map.get(prefixSum);
            if (index == null)
                map.put(prefixSum, i);
            else
                maxLength = Math.max(maxLength, i - index);
        }
        return maxLength;
    }
}
