/*
There is a class consisting of 'N' students . There can be many students with the same name.Now, you have to print the names of the students followed by there frequency
as shown in the sample explanation given below.Output the names in the lexicographical order.

Input :
First line contains an integer 'N', i.e the no. of students in the class.
Next 'N' lines contains the names of the students.
Output:
Each line consists of the name of student space and separated its frequency.
Constraints:
1<=N<=1000
string length<=100
string consists of lowercase letters
Note : For practicing use Map technique only .

Sample Input
5
sumit
ambuj
himanshu
ambuj
ambuj

Sample Output
ambuj 3
himanshu 1
sumit 1

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        String a[]=new String[n];
        for(i=0;i<n;i++)
        a[i]=s.next();
      Arrays.sort(a);
        HashMap<String,Integer> map=new HashMap<>();
        for(i=0;i<n;i++)
        {
            if(!map.containsKey(a[i]))
                map.put(a[i],1);
            else
                map.put(a[i],map.get(a[i])+1);
        } 
        for(i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                           
        System.out.println(a[i]+" "+map.get(a[i]));  
        map.remove(a[i]);
            }
        }       
    }
}
