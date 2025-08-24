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
