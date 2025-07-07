class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet <Integer> a = new  HashSet<>();
        ArrayList <Integer> b= new ArrayList<>();
        for(int i :arr){
            if(a.contains(i)){
                b.add(i);
            }
            a.add(i);
        }
        return b;
    }
}
