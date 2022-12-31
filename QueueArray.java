
// By using array time complexity is O(1) for enqueue and O(n) for Dequeue

class Queue{
    int arr[];
    int capacity; 
    int rear;

    public Queue(int n){
        capacity = n;
        arr = new int[n];
        rear = -1;
    }

    void enqueue(int data){
        if(rear == capacity - 1){
            System.out.println("Capacity reached its MAXIMUM");
            return;
        }
        rear++;
        arr[rear] = data;
        System.out.println(arr[rear]);
    }

    void dequeue(){
        if(rear == -1){
            System.out.println("No element to Dequeue is present");
        }
        int result = arr[0];
        for(int i=0; i < rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        System.out.println(result);
    }

    void Traverse(){
        
        for(int i=0; i < rear; i++){
            System.out.print(arr[i]+" " );
        }
        System.out.println();
    }

    void getFront(){
        if(rear == -1){
            System.out.println("No element is present");
            return;
        }
        System.out.println(arr[0]+" is front element");
    }




}

public class QueueArray {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(5);
        q.enqueue(20);
        q.enqueue(40);
        q.enqueue(60);
        q.enqueue(80);
        q.getFront();
        q.Traverse();
        q.dequeue();
        q.dequeue();
        q.Traverse();
    }
}
