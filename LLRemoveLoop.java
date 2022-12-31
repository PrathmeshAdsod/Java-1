public class LLRemoveLoop {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print("Null");

    }

    void removeLoop(){
        Node slow = head;
        Node fast = head;

        while(slow != null && fast != null & fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow.next= null;
                fast.next = null;
                break;
            }
        }
    }
    public static void main(String[] args) {
        LLRemoveLoop ll = new LLRemoveLoop();

        Node head = new Node(2);
        Node sec = new Node(3);
        Node thi = new Node(4);
        Node fou = new Node(5);
        Node fif = new Node(6);

        head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fif;
        fif.next = sec;

        display();
        ll.removeLoop();
        System.out.println();
        display();
    }
}
