
// Reverse a Linked List in groups of given size

public class LLReverseGrpSize {
    
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

    public Node reverse(int k,Node head){

        if(head == null){
            return null;
        }

        Node temp = head;
        Node prev = null;
        Node curr = null;

        int count = 0;
        while(count < k && temp != null){
            curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
            count++;
        }
        if(curr != null){
            head.next = reverse(k, curr);   // Recursion
        }
        return prev;
        
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
        LLReverseGrpSize ll = new LLReverseGrpSize();
        
        ll.head = new Node(2);
        Node sec = new Node(3);
        Node thi = new Node(4);
        Node fou = new Node(5);
        Node fiv = new Node(6);
      

        ll.head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fiv;
        fiv.next = null;

        ll.Traverse();

        ll.head = ll.reverse(2,ll.head);


        ll.Traverse();
    }
}
