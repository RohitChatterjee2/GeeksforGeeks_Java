/*Given an integer array nums and an integer k, return the kth largest element and kth smallest in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <=*/

import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int count =0;
      
        int arr[] = new int[n];
          int s= arr.length-1;
        for (int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
            Arrays.sort(arr);
        
        for (int j= 0;j<s;j++){
            System.out.println(arr[s-k]);
            System.out.println(arr[k-1]);
        }
    }
}
