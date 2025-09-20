/*There is a password protected gate. Every employee is getting a code as per their first name. Code is generated using following steps:
i) Take ASCII code of each character
ii) Reverse each code
iii) Take unique digits in sorted order as password

Input Format

Number of test cases(T)
T number of strings in separate lines.

Constraints

NA

Output Format

Generated Code

Sample Input 0

2
ABC
C@A
Sample Output 0

567
4567*/

import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        StringBuilder s = new StringBuilder ();
        HashSet<Character>d = new HashSet <>();
      
        for (int j =0; j<=T; j++){
            
            String str = sc.next();
            String a ="";
        for (int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            int z = (int)ch;
           s.append(z);
           a = s.reverse().toString();
        }
        
        
      System.out.println(a);
      StringBuilder sh = new StringBuilder();
      for(char ch : a.toCharArray()){
     if(!d.contains(ch)){
          d.add(ch);
          sh.append(ch);
     }
      
      
        }
        System.out.println(sh.reverse().toString());
     
    }
    
    }
}





