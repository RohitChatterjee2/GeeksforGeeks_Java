
class Node {
    int data ;
    Node next ;
    Node(int data){
        this.data= data;
        this.next= null;
    }
}
class myll {
    Node head;
    public void insert (int data){
        Node newNode = new Node (data);
        if (head == null){
            head= newNode;
            return;
        }
        Node temp = head ;
        while (temp.next!=null){
            temp = temp.next;
            
        }
           temp.next=newNode;
    }
    public void display (){
        Node temp = head;
        int count =1;
        while (temp!= null){
            
            if(count %2==1)
              
            
            System.out.print(temp.data);
        count ++;
            temp=temp.next;
        }
    }
}
class Main {
    public static void main(String[] args) {
      myll obj = new myll();
      obj.insert(10);
      obj.insert(20);
      obj.insert(30);
      obj.insert(40);
      obj.display();
    }
}
