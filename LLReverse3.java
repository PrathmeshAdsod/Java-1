public class LLReverse3 {

    static Node head;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print("Null");

    }

    Node Reverse(Node node){
          Node prev = null;
          Node next_node = null;
          Node temp = node;

          while(temp != null){
               next_node = temp.next;
               temp.next = prev;
               prev = temp;
               temp = next_node;
          }
          node = prev;
          return node;
    }

    public static void main(String[] args) {
        LLReverse3 ll = new LLReverse3();

        ll.head = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node fifth = new Node(60);
        Node six = new Node(70);

        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = null;

        ll.display();

        head = ll.Reverse(head);
        ll.display();

    }
}
