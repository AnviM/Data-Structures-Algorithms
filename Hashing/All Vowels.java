/*
Vowels are very essential characters to form any meaningful word in English dictionary. There are 5 vowels in English language - a, e, i, o u. You are given a random 
string containing only lowercase letters and you need to find if the string contains ALL the vowels.
Input:
FIrst line contains N , the size of the string.
Second line contains the letters (only lowercase).
Output:
Print "YES" (without the quotes) if all vowels are found in the string, "NO" (without the quotes) otherwise.
Constraints:
The size of the string will not be greater than 10,000
1 ≤ N ≤ 10000

Sample Input
8
atuongih

Sample Output
NO

*/




import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str=s.next();
        int i;
         HashMap<Character, Integer> map  = new HashMap<>();   
         for(i=0;i<5;i++)
         {
            
         }
         for(i=0;i<n;i++)
         {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                if(!map.containsKey(ch))
                map.put(ch,1);
            }
         }   
         if(map.size()!=5)            
        System.out.println("NO");
        else
            System.out.println("YES");
    }
}
