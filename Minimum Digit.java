/*Given a list L of N numbers, write a program to print the sum S, which is formed by adding the minimum digit from each number.  (TCS DIGITAL 2022)

Input Format

The first line of input contains N where N is size of the list L. The second line of input consists of N integers separated by a single white space.
Constraints

length of each number > 1
0 < N < 106
Output Format

A single line of output contains the sum S.
Sample Input 0

4
23 56 45 342
Sample Output 0

13
Explanation 0

Here N = 4, List L(N) = (23, 56, 45, 342).
So after taking all the minimum digits of each number, We get 2, 5, 4, 2.
After adding all the minimum digits, Sum S= 2+5+4+2 = 13 which is printed as the output.
Sample Input 1

5
231 675 36 48 17
Sample Output 1

14
Explanation 1

Here N = 5, List L(N) = (231, 675, 36, 48, 17).

So after taking all the minimum digits of each number, We get 1, 5, 3, 4, 1.

After adding all the minimum digits, Sum S=1+5+3+4+1 = 14 which is printed as the output      */

import java.util.*;

public class calc {
    
    public static int min(int num) {
        int minDigit = 9;
        while (num > 0) {
            int digit = num % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            num /= 10;
        }
        return minDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int sum = 0;

     
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            sum =sum+min(num);  
        }

        System.out.println(sum);
    }
}
