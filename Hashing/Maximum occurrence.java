/*
You are given a string which comprises of lower case alphabets (a-z), upper case alphabets (A-Z), numbers, (0-9) and special characters like !,-.; etc.You are supposed to
find out which character occurs the maximum number of times and the number of its occurrence, in the given string. If two characters occur equal number of times, you have 
to output the character with the lower ASCII value.For example, if your string was: aaaaAAAA, your output would be: A 4, because A has lower ASCII value than a.

Input format:
The input will contain a string.

Output format:
You've to output two things which will be separated by a space:
i) The character which occurs the maximum number of times.
ii) The number of its occurrence.

Sample Input
Pulkit is a dog!!!!!!!!!!!!
Sample Output
! 12

*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        // Write your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashMap<Character, Integer> map  = new HashMap<>();  
        int i, max=0;
        char c, ch=' '; 
 
        for(i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            if(!map.containsKey(c))
            map.put(c,1);
            else
            map.put(c,map.get(c)+1);
        }
        for(i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            if(map.get(c)>max)
            {
                ch=c;
                max=map.get(c);
            }
            else if(map.get(c)==max)
            {
                if(c-0<ch-0)
                ch=c;
            }
            
        }              
        System.out.println(ch+" "+max);    
    }
}
