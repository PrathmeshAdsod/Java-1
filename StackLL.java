

public class StackLL {

    Node head;
    static class Node{
         int data;
         Node next;

         Node(int data){
             this.data = data;
             this.next = null;
         }
    }

    boolean isEmpty(){
        if(head == null){
            return false;
        }else{
            return true;
        }
    }

    void push(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
        }
        else{
            Node temp = head;
            head = new_node;
            new_node.next = temp;
        }
        System.out.println(data);
    }

    public int pop(){
        int popped = Integer.MIN_VALUE;
        if(head == null){
            System.out.println("Stack Underflow");
        }
        else{
             popped = head.data;
            head = head.next;
        }
        return popped;
    }

    void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    int peek(){
        if(head == null){
            System.out.println("Stack Underfow");
            return Integer.MIN_VALUE;
        }else{
            return head.data;
        }
    }

    public static void main(String[] args) {
        StackLL st = new StackLL();

        st.push(2);
        st.push(3);
        st.push(4);

        st.traverse();

        st.pop();
        st.traverse();
        System.out.println(st.peek());
    }
}
