
public class LLdelete {

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
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node deleteAtStart(){
        if(head==null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public Node deleteAtLast(){
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head;
        Node prev = null;

        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp;
    }

    public Node deleteAtPosition(int position){
        if(position == 1){
             head = head.next;
        }else{
            Node prev = head;
            int count = 1;

            while(count < position - 1){
                prev = prev.next;
                count++;
            }

            Node temp = prev.next;
            prev.next = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LLdelete myLL = new LLdelete();      /* Object CREATED*/

        myLL.head = new Node(20);
        Node second = new Node(30);
        Node Third = new Node(40);
        Node Fourth = new Node(50);
        Node Fifth = new Node(60);
        Node Sixth = new Node(70);

        myLL.head.next = second;
        second.next = Third;
        Third.next = Fourth;
        Fourth.next = Fifth;
        Fifth.next = Sixth;

        myLL.display();

        myLL.deleteAtStart();

        myLL.display();

        myLL.deleteAtPosition(4);

        myLL.display();
    }
}
