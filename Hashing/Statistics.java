/*
Max likes football very much. In order to check the popuplarity of the game, he decided to talk to random people and ask them about their favourite game and note it 
down in a list.
Given a list of name of people and their favourite sport, help Max in finding the sport liked by most of the people, and also how many people like football.
He could have met same people more than once, he will only count response of his first meet with any person.
Note : Name of person as well as sport is a single string in lowercase. Length of name of people as well as sport is less than 11.

Input :: First line will contain no of entries in the list. i.e. N Next N lines will contain two strings, person's name and sports he like.

Output :: In first ine, name of sport liked by most no of people (In case of more than one games is liked by highest no of people, output the first one in 
lexicographical order). In second line, no of people having football as their favourite game.


Sample Input
7
abir cricket
aayush cricket
newton kabaddi
abhinash badminton
sanjay tennis
abhinash badminton
govind football

Sample Output
cricket
1

*/




import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        // Write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); 
        String x="";
        int max=0;
             HashSet<String> set=new HashSet<>();
             HashMap<String,Integer> map= new HashMap<>();
        while(t-->0)
        {
            String a=s.next();
            String b=s.next();
             if(!set.contains(a))
             {
                 set.add(a);
                 if(!map.containsKey(b))
                 map.put(b,1);
                 else
                 map.put(b,map.get(b)+1);
                 if(map.get(b)>max)
                 {
                 x=b;
                 max=map.get(b);
                 }
                 else if(map.get(b)==max)
                 {
                    if(x.compareTo(b)>0)
                    x=b;
                 }
             }
        }                
        System.out.println(x); 
        if(!map.containsKey("football"))
        System.out.println("0");
        else
        System.out.println(map.get("football"));    
    }
}
