// Using LL we can get worst case time complexity O(1)

class Node{
        int data;
        Node next;

        Node(int data){
           this.data = data;
           this.next = null;
        }
}
  

    class Queue{

            /* Create Node for Enqueue and Dequque */
    Node front = null;
    Node rare = null;

void enqueue(int data){
        Node new_node = new Node(data);

        if(front == null){
            front = rare = new_node;
            System.out.println("Enqueued "+front.data);
            return;
        }
            rare.next = new_node;
            rare = new_node;
            System.out.println("Enqueued " +rare.data);
        
}
int Dequque() throws Exception{
    if(front == null){
        throw new Exception("Empty Queue");
    }
    int result = front.data;
    front = front.next;
    return result;
}
   

    void Traverse(){
        Node temp = front;
 
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
     }

}

class QueueLL{   

    public static void main(String[] args) throws Exception {
        Queue qu = new Queue();

        qu.enqueue(20);
        qu.enqueue(30);
        qu.enqueue(40);
        qu.enqueue(50);

        qu.Traverse();

        System.out.println(qu.Dequque());
        System.out.println(qu.Dequque());

        qu.Traverse();
        

    }
}