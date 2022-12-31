
//  Implementing Stack using Arrays

class StackArray {

    int top;
    static final int MAX = 50;
    int arr[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
     //   System.out.println();  // for entering on new line

        if (top >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        }else{
        arr[top++] = x;
        System.out.println(x + " is pushed in Stack");
        return true;
        }
       
    }

    int pop() {

    //    System.out.println();  // for entering on new line
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }else{
        int y = arr[top--];
        return y;
        }
    }

    void peek() {
       // System.out.println();  // for entering on new line
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }
        int y = arr[top];
        System.out.println(y+" is peek element");
    }

    void print(){
        for(int i = top; i >= 0; i--){
           System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(20);
        s.push(30);
        s.push(50);
        s.push(60);
        s.push(80);
        s.push(23);
        s.push(56);
        s.push(70);
        s.push(90);
        
        System.out.println(s.pop() + " is popped");
        System.out.println(s.pop() + " is popped");
        System.out.println(s.pop() + " is popped");
        System.out.println(s.pop() + " is popped");

        s.peek();
        System.out.println();
        s.print();
    }
}