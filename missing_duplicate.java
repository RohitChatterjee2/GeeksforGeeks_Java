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
		int[] res = new int[2];
		res[0] = Duplicate(arr);
		res[1] = missing(arr , res[0]);
		for(int i : res){
		    System.out.print(i + " ");
		}
	}
	
	public static int Duplicate(int[] arr){
	    HashMap<Integer , Integer> hm = new HashMap<>();
	    for(int i : arr){
	        hm.put(i , hm.getOrDefault(i , 0) + 1);
	    }
	    
	    for(Map.Entry<Integer , Integer> entry : hm.entrySet()){
	        if(entry.getValue() == 2){
	            return entry.getKey();
	        }
	    }
	    return -1;
	}
	
	public static int missing(int[] arr , int a){
	    int n = arr.length;
	    int total = n * (n + 1) / 2;  
	    int sum = 0; 
	    
	    for(int i : arr){
	        sum += i;
	    }
	    
	    return Math.abs(total - (sum - a));
	}
}
