public class LLaddOne {

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
    
    void Traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node addOne(Node head){
        Node ln = head;
        if(head.next == null){
            head.data += 1;
            return head;
        }
        Node t = head;

        while(t.next != null){
            if(t.data != 9){
                ln = t;
            }
            t = t.next;
        }

        if(t.data == 9 && ln != null){
            t = ln;
            t.data +=1;
            t = t.next;

            while(t != null){
                t.data = 0;
                t = t.next;
            }
        }else{
            t.data +=1;

        }
        return head;
    }

    


    public static void main(String[] args) {
        LLaddOne ll = new LLaddOne();

        ll.head = new Node(2);
        Node sec = new Node(9);
        Node thi = new Node(9);
        Node fou = new Node(9);
      

        ll.head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = null;
        

        ll.Traverse();

        ll.head = addOne(ll.head);

        ll.Traverse();
    }
}
