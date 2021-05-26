/*
You are given with an array A of size N.An element Ai is said to be charged if its value(Ai) is greater than or equal to Ki. Ki is the total number of subsets of array ,
that consist of element . Total charge value of the array is defined as summation of all charged elements present in the array mod .
Your task is to output the total charge value of the given array .

INPUT FORMAT:
The first line of input contains number of test cases .
The first line of each test case consists of , the size of the array.
Next line contains  space-separated integers corresponding to each element .

OUTPUT FORMAT:
For each test case, output a single number corresponding to total charge value of the given array.

Sample Input
2
3
3 4 5
2
1 6
Sample Output
9
6
Time Limit: 2
Memory Limit: 256
Source Limit:
Explanation

CASE 1:
Possible subsets are: {3}, {4}, {5}, {3,4}, {3,5}, {4,5}, {3,4,5}, {}.
Element 3 is present in 4 subsets. As 3<4, it is not charged.
Element 4 is present in 4 subsets. As 4>=4, it is charged.
Element 5 is present in 4 subsets. As 5>=4, it is charged.
Total charge=4+5=9

CASE 2:
Possible subsets are: {1}, {6}, {1,6}, {}.
Element 1 is present in 2 subsets. As 1<2, it is not charged.
Element 6 is present in 2 subsets. As 6>=2, it is charged.
Total charge=6

*/



import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[N];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Long.parseLong(arr_A[i_A]);
            }
 
            int out_ = solve(A,N);
            System.out.println(out_);
            System.out.println("");
         }
 
         wr.close();
         br.close();
    }
    static int solve(long[] A,int N){
        // Write your code here
        double x=Math.pow(2,N);
        x=x/2;
        int i;
        long s=0;
        for(i=0;i<N;i++)
        {
            long a=A[i];
            if (a>=x)
             {
                  s=(s+a)%1000000007;
             }
        }
        return (int)s;
    }
}
