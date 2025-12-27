import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class myll {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void counter() {
       Node temp = head ;
       while (temp.next.next!=null){
           temp=temp.next;
           
       }
        System.out.print(temp.data);
    }
}

public class linkedlist1 {
    public static void main(String[] args) {
        myll my = new myll();

        my.insert(10);
        my.insert(20);
        my.insert(30);
        my.insert(40);

        my.display();
         my.counter();
    }
}
