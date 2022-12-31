
class Queue{
    int n;
    int arr[];
    int rear = -1,front = -1;

    public Queue(int n){
         this.n = n;
         arr = new int [n];
    }

    void enqueue(int data){
        if((rear + 1) % n == front){
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear+1)%n;
        arr[rear] = data;
        System.out.println(arr[rear]);

    }

    
    void Traverse(){
        
        for(int i=0; i < rear; i++){
            System.out.print(arr[i]+" " );
        }
        System.out.println();
    }

    int Dequeue(){
        if(front == -1){
            System.out.println("empty");
        }
        int result = arr[front];
        if(front == rear){
            front = rear = -1;
        }else{
            front = (front+1)%n;
        }
        return result;
    }



}

public class QueueArrayCircular {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(8);
        q.enqueue(2);
        q.Dequeue();
    }
}
