public class Main {
    public static void main(String[] args) {

        myll m = new myll();

        myll.insertBeg(50);
        myll.insertBeg(40);
        myll.insertBeg(30);
        myll.insertBeg(20);
        myll.insertBeg(10);
        myll.insertBeg(0);

        myll.display();   // 0 10 20 30 40 50

        myll.deleteLast();

        System.out.println("After deleting last:");
        myll.display();   // 0 10 20 30 40
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class myll {

    static Node head;

    // Insert at beginning
    public static void insertBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete last node
    public static void deleteLast() {
        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    // Display linked list
    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
