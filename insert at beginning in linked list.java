import java.util.*;
class Node {
    int data;
    Node next;
Node (int data){
        this.data= data;
        this.next = null;
    }
}
class myll {
    Node head;
    public void insert ( int data){
        Node newNode = new Node (data);
        if(head==null){
            head= newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
        
    }
    public void display(){
        Node temp = head ;
        while (temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}
public class Main {
    public static void main(String[] args){
        myll ll= new myll();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.display();
    }
}
