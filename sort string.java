import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		formatted(str);
	}
	
	public static void formatted(String str){
	    TreeMap<String , Integer> hm = new TreeMap<>();
	    String[] words = str.split(" ");
	    for(String word : words){
	        hm.put(word , hm.getOrDefault(word , 0) + 1);
	    }
	    
	    for(Map.Entry<String , Integer> entry : hm.entrySet()){
	        System.out.println(entry.getKey() + " : " + entry.getValue());
	    }
	}
