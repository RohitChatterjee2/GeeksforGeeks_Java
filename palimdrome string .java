import java.util.*;

public class calc {
    
  
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

 
    public static boolean allSame(String s) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = str.length();

        if (allSame(str)) {
            System.out.println(0);
        }
     
        else if (isPalindrome(str)) {
            System.out.println(n - 1);
        }
    
        else {
            System.out.println(n);
        }
    }
}
