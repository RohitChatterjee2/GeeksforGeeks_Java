import java.util.*;
public class calc {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String str= sc.nextLine();  // "I am Sohom"
        int n=str.length();
       String arr[] = str.split(" "); // ["I" , "am" , "Sohom"]
         // ImamohoS
    
        StringBuilder sb = new StringBuilder();
        for(String i : arr){
            sb.append(new StringBuilder(i).reverse().toString()).append(" ");
        }
        String res = sb.toString();
        System.out.println(res);
    }
}
