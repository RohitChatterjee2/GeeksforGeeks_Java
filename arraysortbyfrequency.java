


import java.util.*;
public class calc {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
         int arr[]= new int [n];
       for (int i =0;i<arr.length;i++){
           arr[i]= sc.nextInt();
       }
       ArrayList<Integer> a= kohli( arr, n );
       for(int j : a){
           System.out.print(j+" ");
       }
    }
    public static ArrayList<Integer> kohli(int arr[],int n ){
       
        HashMap <Integer,Integer> hm = new HashMap<> ();
        ArrayList<Integer> ar= new ArrayList<>();
        for (int i : arr){
            hm.put (i,hm.getOrDefault(i,0)+1);
        }
        for (int j : arr){
            ar.add(j);
        }
        Collections.sort(ar,(a,b)->{
            int freq1 = hm.get(a);
            int freq2 = hm.get(b);
            if(freq1!=freq2){
                return freq2-freq1;
            }
            else {
                return a-b;
            }
        });
        return ar;
    }
}
