import java.util.*;

public class Binary_Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(binarySearch(arr , target));
    }

    public static int binarySearch(int[] arr , int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] < target){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
