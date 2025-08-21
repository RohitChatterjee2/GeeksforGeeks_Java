// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        
        System.out.println(lengthSub(a , b));
    }
    
    public static int lengthSub(int[] a , int[] b){
    
        int or = 0;
        int and = 1;
        
        for(int i = 0; i < a.length; i++){
            or = or | a[i];  // or |= a[i];
        }
        
        for(int i = 0; i < b.length; i++){
            and = and & b[i]; // and &= b[i];
        }
        
        int sum = or + and;
        return sum;
    }
}
