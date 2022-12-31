public class LLFindMiddle{

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    /* Push element at First Position */
    public void Push(int Value){
        Node new_node = new Node(Value);
        new_node.next = head;
        head = new_node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print("Null");

    }

    public void Middle(){
        Node first = head;
        Node second = head;

        while(second != null && second.next != null){
            second = second.next.next;
            first = first.next;
        }
        System.out.print(first.data+" is the Middle element");
    }

    public static void main(String[] args) {
        LLFindMiddle find = new LLFindMiddle();

        for(int i=5 ; i > 0; --i){
            find.Push(i);
        }
        find.display();

        System.out.println();
        find.Middle();
        
                 
    }
}