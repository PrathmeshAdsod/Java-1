package LinkedList;

public class LLinsert {
    
    Node head;

    public static class Node{
          int data;
          Node next;

          /* Constructor */
          public Node(int data){
              this.data=data;
              this.next=null;
          }
    }

    public void display() {
          Node temp = head;
          while(temp != null) {
              System.out.print(temp.data+" ");
              temp = temp.next;
          }
          System.out.println();
    }

    public void insertAtFirst(int value){

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(int pos , int data){
        Node newNode = new Node(data);

        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }else{
            Node Previous = head;
            int count = 1;

            while(count < pos - 1){
                Previous = Previous.next;
                count++;
            }
            Node temp = Previous.next;
            Previous.next =newNode;
            newNode.next = temp;
        }
    }
   

    public static void main(String[] args) {
        /* Create OBJECT */
        LLinsert ll = new LLinsert();

        ll.head = new Node(33);
        Node sec = new Node(66);
        Node third = new Node(99);
        Node fou = new Node(120);

        ll.head.next = sec;
        sec.next = third;
        third.next = fou;
        fou.next = null;

        ll.display();

        ll.insertAtFirst(22);
        ll.insertAtFirst(11);

        ll.display();

        ll.insertAtEnd(55);
        ll.insertAtEnd(66);

        ll.display();

        ll.insertAtPosition(3, 2);
        ll.insertAtPosition(5, 9);
        ll.insertAtPosition(4, 8);

        ll.display();

    }
}


