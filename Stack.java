import java.util.EmptyStackException;

public class Stack {

    Node top;
    int length;

   // Node head;        --No need to create head for Stack implemennt using LinkedList

    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public Stack() {
        this.top = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        if(length == 0) {
            return true;
        }
        return false;    
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek(){
         if(isEmpty()){
             throw new EmptyStackException();
         }
         return top.data;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s.peek());

        s.pop();
        s.pop();
        
        System.out.println(s.peek());

    }
}
