public class LLReverse2 {
    
    static Node head;

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
    static LLReverse2.Node Reverse(Node node){

        Node temp = node;

        Node next_node = null;
        Node prev_node = null;

        while(temp != null){
            next_node = temp.next;
            temp.next = prev_node;
            prev_node = temp;
            temp = next_node;
        }
        node = prev_node;
        return node;
    }


    public static void main(String[] args) {
        LLReverse2 find = new LLReverse2();

        for(int i=5 ; i > 0; --i){
            find.Push(i);
        }
        find.display();

        System.out.println();
      
        head = find.Reverse(head);
        find.display();
        
                 
    }
}
