/*Given an array of student marks of length N, find the difference between the most frequent mark and the least frequent mark. If all marks are the same, return 0.

Input Format
The first line contains an integer N, representing the number of results in the array.

The second line contains the array having N space-separated integers representing the number of marks of students.

Output Format
Print an integer representing the maximum difference.

Constraints
1 <= N <=10^5

1 <= A[i] <=10^5

Sample Testcase 0
Testcase Input
3
1 2 2
Testcase Output
 1
Explanation
Marks that came least number of times is 1, occured once.


Marks that came maximum number of times is 2, occured 2 times.


So the difference will be 2 - 1 = 1

Sample Testcase 1
Testcase Input
4
2 2 2 2
Testcase Output
 0
Explanation
0 because all the marks are same so the difference between the maximum and minimum marks is (2-2)=0.*/

import java.util.*;
public class calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int arr []= new int[n];
HashMap<Integer,Integer> h= new HashMap<>();
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
for(int i:arr){
    h.put(i,h.getOrDefault(i,0)+1);
    
}
int max =Integer.MIN_VALUE;
int min= Integer.MAX_VALUE;
int ele1=0;
int ele2 =0;

for(Map.Entry<Integer,Integer>e :h.entrySet()){
    int freq = e.getValue();
    if(freq>max){
        max= freq;
        ele1= e.getKey();
    }
    if(freq<min)
    {
        min= freq;
        ele2 = e.getKey();
    }
}
int diff = ele1-ele2;
System.out.println(diff);

    }
}
