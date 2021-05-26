/*
Little Jhool is still out of his mind - exploring all his happy childhood memories. And one of his favorite memory is when he found a magical ghost, who promised to 
fulfill one of Little Jhool's wish.Now, Little Jhool was a kid back then, and so he failed to understand what all could he have asked for from the ghost. So, he ends 
up asking him something very simple. (He had the intuition that he'd grow up to be a great Mathematician, and a Ruby programmer, alas!) He asked the ghost the power to 
join a set of *the letters r, u, b and y * into a real ruby. And the ghost, though surprised, granted Little Jhool his wish...
Though he regrets asking for such a lame wish now, but he can still generate a lot of real jewels when he's given a string. You just need to tell him, given a string,
how many rubies can he generate from it?

Input Format:
The first line contains a number t - denoting the number of test cases.
The next line contains a string.

Output Format:
Print the maximum number of ruby(ies) he can generate from the given string.

Sample Input
2
rrrruubbbyy
rubrubrubrubrubrubrubrubrubrubrubrubrubrb

Sample Output
2
0

*/




import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        // Write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();  
        while(t-->0)
        {
            String str=s.next();
            str=str.toLowerCase();
            HashMap<Character, Integer> map=new HashMap<>();
            int i;
            for(i=0;i<str.length();i++)
            {
                char c=str.charAt(i);
                if(!map.containsKey(c))
                    map.put(c,1);
                else
                    map.put(c,map.get(c)+1);
            }
            int m=100;
 
        String s1="ruby";
            for(i=0;i<4;i++)
            {
                if(!map.containsKey(s1.charAt(i)))
                {
                    m=0;
                    break;
                }
                else
                {
                    if(map.get(s1.charAt(i))<m)
                        m=map.get(s1.charAt(i));
                }
            }  
        System.out.println(m);
        }                 
    }
}
