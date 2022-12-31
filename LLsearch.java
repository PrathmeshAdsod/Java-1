//   LinkedList is not Good For Searching 
//   You can use Array instead


public class LLsearch {

        
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

    public void Searching(int mydata){

        if(head == null){
            System.out.println("LinkedList is Null ");
        }

        Node  temp = head;

        while(temp != null){
            if(temp.data == mydata){
                System.out.println("Data "+temp.data+" found");
            }
            temp = temp.next;
        }
            
    }

    public static void main(String[] args) {
        LLsearch ll = new LLsearch();

        ll.head = new Node(33);
        Node sec = new Node(66);
        Node third = new Node(99);
        Node fou = new Node(120);

        ll.head.next = sec;
        sec.next = third;
        third.next = fou;
        fou.next = null;

        ll.display();

        ll.Searching(66);

    }
}
