package LinkedList; 

public class LL {

    Node head;

    /*  Node Class */
    public static class Node{
        int data;
        Node next;

        /*  Constructor  */
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL myLL = new LL();      /* Object CREATED*/

        myLL.head = new Node(20);
        Node second = new Node(30);
        Node Third = new Node(40);
        Node Fourth = new Node(50);

        myLL.head.next = second;
        second.next = Third;
        Third.next = Fourth;

        myLL.display();
    }
}
