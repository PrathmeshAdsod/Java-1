class LLInsert{

    public Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    void Traverse(Node head){
       Node temp = head;

       while(temp != null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
       System.out.println();
    }

    public void atPosInsert(int pos,int data,Node head){
    /* We are giving Node head  as parameter becoz we will Traverse function using head Node*/
        Node new_node = new Node(data);

        if(pos == 1){
            new_node.next = head;
            head = new_node;
        }
        else{
            Node prev = head;
            int count = 1;

            while(count < pos - 1){
                prev = prev.next;
                count++;
            }

            // Give below order as it is
            Node temp = prev.next;
            prev.next = new_node;
            new_node.next = temp;
            
            
        }
    }

    public void atFirst(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }




    public static void main(String[] args) {

        LLInsert ll = new LLInsert();

        Node n1 = new Node(50);
        Node n2 = new Node(100);
        Node n3 = new Node(150);
        Node n4 = new Node(200);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        ll.Traverse(head);

        ll.atPosInsert(2, 25,head);
        ll.Traverse(head);

        ll.atFirst(20);
        ll.Traverse(head);



   

    }
}