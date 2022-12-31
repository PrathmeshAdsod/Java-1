public class MyLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    void add(int data) {
        Node toAdd = new Node(data);

        if(head == null) {
            head = toAdd;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    void print() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        MyLinkedList LL = new MyLinkedList();
        LL.add(22);
        LL.add(33);
        LL.add(44);
        LL.add(55);
        LL.print();
    }
}
