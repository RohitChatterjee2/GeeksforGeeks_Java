import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		
		int b = DigitSum(arr , n);
		if(b % 2 == 0){
		    System.out.println("Even");
		}else{
		    System.out.println("Odd");
		}
		
	}
	
	public static int DigitSum(int[] arr , int n){
	    StringBuilder sb = new StringBuilder();
	    for(int i : arr){
	        sb.append(i);
	    }
	    
	    sb.reverse();
	    for(int i = 0; i < sb.length(); i++){
	        if(sb.charAt(sb.length() - 1) == '0'){
	            sb.deleteCharAt(sb.length() - 1);           
	        }
	    }
	 
	    int a = Integer.parseInt(sb.toString());
	    int temp = a;
	    int sum = 0;
	    while(temp != 0){
	        sum += temp % 10;
	        temp /= 10;
	    }
	    
	    int diff = a - sum;
	    return diff;
	}
}
