package LinkedList;

public class FindLength {
    
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

        /* LENGTH of LinkedList */
        public int length() {
            if(head == null) {
                return 0;
            }
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

    public static void main(String[] args) {
        /* Create OBJECT */
        FindLength ll = new FindLength();

        ll.head = new Node(33);
        Node sec = new Node(66);
        Node third = new Node(99);
        Node fou = new Node(120);

        ll.head.next = sec;
        sec.next = third;
        third.next = fou;
        fou.next = null;

        ll.display();
        System.out.println("Length of LL is : "+ll.length());

    }
}
