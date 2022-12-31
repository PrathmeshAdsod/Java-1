import java.util.NoSuchElementException;

class Queue{

    Node front;
    Node rear;
    int length;

    public class Node{
         int data;
         Node next;

         Node(int data){
             this.data = data;
             this.next = null;
         }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
        Node temp = new Node(data);

        if(isEmpty()){
            front = temp;
        }
        else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;

        front = front.next;

        if(front == null){
            rear = null;
        }
        length--;

        return result;
    }

    public void print(){
        if(isEmpty()){
            return;
        }else{
            Node Current = front;
            while(Current != null){
                System.out.print(Current.data+" ");
                Current = Current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue que = new Queue();
 
        que.enqueue(25550);
        que.enqueue(2230);
        que.enqueue(1320);
        que.enqueue(820);
        que.enqueue(220);
        que.enqueue(230);
        que.enqueue(209);
        que.enqueue(207);
        que.enqueue(200);
        que.enqueue(2045);
        que.enqueue(2023);
        que.enqueue(2045);
        que.enqueue(2056);
        que.enqueue(2043);
        que.enqueue(2023);
        que.enqueue(2088);
        que.enqueue(2055);
        que.enqueue(2044);
        



        que.print();

        
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();

        que.print();

        


    }
}