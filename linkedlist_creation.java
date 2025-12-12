class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
 class myll{

    Node head;
    public void insert (int data){
    Node newNode = new Node(data);
    if (head==null){
        head =newNode;
        return;
    }
    Node temp = head;
    while (temp.next!=null){
        temp = temp.next;
        
        }
        temp.next=newNode;
    }
    public void display(){
        Node temp = head;
        while (temp.next!=null){
            System.out.print(temp.data+" ->");
            temp= temp.next;
        }
System.out.println("NULL");
    }
}
public class linkedlist_creation {
    public static void main(String[] args){
        
myll calc=new myll();
calc.insert(10);
calc.insert(20);
calc.insert(30);
calc.display();
    }
    
}
