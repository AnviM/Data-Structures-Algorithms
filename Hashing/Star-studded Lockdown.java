/*
Amongst the lockdown and all the hassles, there is a Professor – Professor Oak, who spends his time watching stars in the sky.
One day Professor Oak saw alphabets appearing on the stars. He was so fascinated by them that he started making a list of numbers and for every new star, he inserted a 
number X into the list. This X is equal to the no. of times the alphabet on the current star has previously appeared.After seeing N stars, he decided to stop and 
calculate the sum of all the N numbers. Professor Oak has spent all his life watching stars and do not know how to add. Can you help him in finding the sum?

Input:
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line contains a single integer – N, denoting the number of stars.
The next line contains a string S of length N, describing the characters that appeared on the N stars sequentially.
Output:
For each query, print a single line containing one integer – the sum of all the N numbers.

Constraints:
1 < T < 105
1 < N < 105
S contains lowercase English alphabets only
Sum of N over all test cases does not exceed 106

Sample Input
1
5
abaab

Sample Output
4

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        // Write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();   
        while(t-->0)
        {              
            int n=s.nextInt();
            String str=s.next();
            String s1="";
            int i;
            long count=0;
            HashMap<Character, Integer> map  = new HashMap<>();
            for(i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(!map.containsKey(ch))
                {
                    map.put(ch,0);
                }
                else
                {
                    map.put(ch,map.get(ch)+1);
                    count=count+map.get(ch);
                }
            }
            System.out.println(count);    
        }
    }
}
