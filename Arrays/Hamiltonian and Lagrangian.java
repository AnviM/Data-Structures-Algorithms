/*
Students have become secret admirers of SEGP. They find the course exciting and the professors amusing. After a superb Mid Semester examination its now time for the 
results. The TAs have released the marks of students in the form of an array, where arr[i] represents the marks of the ith student.
Since you are a curious kid, you want to find all the marks that are not smaller than those on its right side in the array.

Input Format
The first line of input will contain a single integer n denoting the number of students.
The next line will contain n space separated integers representing the marks of students.

Output Format
Output all the integers separated in the array from left to right that are not smaller than those on its right side.

Constraints
1 <= n <= 1000000
0 <= arr[i] <= 10000

Sample Input
6
16 17 4 3 5 2

Sample Output
17 5 2

*/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     
 
        // Write your code here
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();  
         int a[]=new int[n];
         int i,j,c=0;
         for(i=0;i<n;i++)
         a[i]=s.nextInt();  
         for(i=0;i<n-1;i++)
         {
             c=0;
            if(a[i]<a[i+1])
             continue;
             
             for(j=i+2;j<n;j++)
             {
                if(a[i]<a[j])
                {
                c++;
                break;
                }
              }
             if(c==0)
             System.out.print(a[i]+" ");             
         }
             System.out.print(a[n-1]+" ");
    }
}
