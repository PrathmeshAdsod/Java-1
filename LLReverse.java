
public class LLReverse {

        
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

    public Node ReverseLL(Node head){
          if(head == null){
              return head;
          }
          Node temp = head;
          Node prev = null;
          Node next = null;

          while(temp != null){
              next = temp.next;
              temp.next = prev;
              prev = temp;
              temp = next;
          }
          return prev;
    }

            
    public static void main(String[] args) {
        LLReverse ll = new LLReverse();

        ll.head = new Node(33);
        Node sec = new Node(66);
        Node third = new Node(99);
        Node fou = new Node(120);

        ll.head.next = sec;
        sec.next = third;
        third.next = fou;
        fou.next = null;

        ll.display();

        Node reverses = ll.ReverseLL(head);
        ll.display(reverses);

    }
}
