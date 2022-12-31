public class LLDelete2 {

    
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

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node deleteAtFirst(){
        if(head==null){
            return null;
        }
        Node temp = head;
        head= head.next;
        temp.next = null;

        return temp;
    }

    public Node deleteEnd(){
        if(head == null){
            return null;
        }
        Node temp = head;

        while(temp.next.next  != null){
            temp = temp.next;
        }
        temp.next = null;
        return temp;
    }

    public Node deletePosition(int pos){
        if(pos == 1){
            head = head.next;
        }
        else{
            Node prev = head;
            int count = 1;

            while(count < pos - 1){
                 prev = prev.next;
                 count++;
            }
            Node temp = prev.next;
            prev.next = temp.next;
        }
        return head;
    }



    public static void main(String[] args) {

        LLDelete2 ll = new LLDelete2();
        
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

        ll.deleteAtFirst();
        ll.display();

        ll.deleteEnd();
        ll.display();

        ll.deletePosition(2);
        ll.display();

        
    }
}
