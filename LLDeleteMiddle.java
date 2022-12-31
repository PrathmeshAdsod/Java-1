public class LLDeleteMiddle {

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

     Node deleteMiddle(LLDeleteMiddle.Node head2){
        
        if(head== null){
            return null;
        }
        if(head.next == null){
            System.out.println(head);
        }

        Node slow_ptr = head;
        Node fast_ptr = head;
        Node prev = null;

        while(fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            prev = slow_ptr;
            slow_ptr = slow_ptr.next;
        }

        prev.next = slow_ptr.next;
        slow_ptr.next = null;

        return head;
        //return slow_ptr;

    }

    void Traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LLDeleteMiddle ll = new LLDeleteMiddle();

        ll.head = new Node(20);
        Node sec = new Node(25);
        Node thi = new Node(30);
        Node fou = new Node(35);
       // Node fif = new Node(40);

        ll.head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = null;
       // fif.next = null;

        ll.Traverse();

       ll.deleteMiddle(ll.head);

        ll.Traverse();
    }
}
