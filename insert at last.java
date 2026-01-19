import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Myll{
    Node head;
    public void insertBeg(int data){
        Node newNode = new Node(data);
        if(head == null){
             head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void insertLast(int data){
        Node newNode = new Node(data);
        Node ptr = head;
        
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.next = null;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Myll ll = new Myll();
        ll.insertBeg(10);
        ll.insertBeg(20);
        ll.insertBeg(30);
        ll.insertBeg(40);
        ll.insertLast(0);
        ll.display();
    }
}
