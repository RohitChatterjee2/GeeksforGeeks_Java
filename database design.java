/*Task 7:

In a database there are N students. The fields of the table are name, age, grade, Gender. Your task is to return the students Name who are greater than 20 years old & calculate the average of grades using ascii values of female candidates.  (TCS DIGITAL 2023) 

Input:
3
AAA 21 A Female
BBB 22 B Male
CCC 24 C Female

O/P:
AAA BBB CCC
66   */

import  java.util.*;
public class calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        int  c;
        int z=0;
        String str[] = sc.nextLine().split(" ");
        for(int i=1;i<=n;i++){
            String s= str[0];
            int a= Integer.parseInt(str[1]);
            char ch=str[2].charAt(0);
            String d= str[3];
            if(a>20){
                System.out.println(s);
            }
            if(d=="Female"){
                c= (int)ch;
                z= z+c;
                System.out.println(c);
            }
        }
        
    }
}
