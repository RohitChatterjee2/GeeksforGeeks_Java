import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(formatted(str));
    }
    
    public static String formatted(String str){
        HashMap<Character , Integer> hm = new HashMap<>();
        ArrayList<Character> arr = new ArrayList<>();
        
        for(char ch : str.toCharArray()){
            hm.put(ch , hm.getOrDefault(ch , 0) + 1);
        }
        
        for(char ch : str.toCharArray()){
            arr.add(ch);
        }
        
        Collections.sort(arr , (a , b) -> {
           int freqA = hm.get(a);
           int freqB = hm.get(b);
           
           if(freqB != freqA){
               return freqB - freqA;  // Max Freq - Min Freq
           }
           
            else{
                return a - b;  // ascending sort, number coming first
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
mey-mfjq-fcb
