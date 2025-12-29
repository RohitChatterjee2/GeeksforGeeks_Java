import java.util.*;
class Node {
    int data;
    Node next ;
Node (int data ){
 this.data= data;
 this.next= null;
 
}
}
class myll {
    Node head;
    public void insert (int data){
        Node newNode = new Node (data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node temp = head ;
        while (temp.next!= null){
            temp=temp.next;
        }
        temp.next= newNode;
    }
    public void display (){
        Node temp= head;
        while(temp!=null){
            if (temp.data%2==0){
            System.out.print(temp.data);
            
        }
            temp = temp.next;
            
        }
    }
}
public class linkedlist1{
    public static void main(String[] args ){
        myll my = new myll ();
        my.insert(1);
        my.insert(20);
        my.insert(19);
        my.insert(40);
        my.display();
        
    }
}
