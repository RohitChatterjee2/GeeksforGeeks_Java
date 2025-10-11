import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new arr[row][col];
        for(int i =0;i<row;i++){
            for(int j =0; j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(isPrime(arr[i][j)){
                    System.out.println("Valid");
                    break;
                }
                else {
                    System.out.println("Invalid ");
                    break;
                }
            }
        }
    }
    
    public static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
