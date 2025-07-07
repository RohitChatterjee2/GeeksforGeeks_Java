class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> a = new ArrayList <>();
        int n= arr.length;
        int c= arr[n-1];
        a.add(c);
        for (int i =n-2;i>=0;i--){
            if(arr[i]>=c){
                c=arr[i];
                a.add(arr[i]);
                
            }
            
            
        }
        Collections.reverse(a);
        return a;
        
    }
}
