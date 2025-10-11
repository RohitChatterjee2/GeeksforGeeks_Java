import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> res = maxSliding(arr , n , k);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
    
    public static ArrayList<Integer> maxSliding(int[] arr , int n , int k){
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0; i <= n - k; i++){
            int max = arr[i];
            for(int j = i; j < i + k; j++){
                max = Math.max(max , arr[j]);
            }
            ar.add(max);
        }
        return ar;
    }
}
mey-mfjq-fcb
