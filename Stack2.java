import java.util.Stack;

public class Stack2 {
    
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();

        s.push("Ram");
        s.push("Krishna");
        s.push("Vithoba");

        System.out.println(s.peek());

        s.pop();

        System.out.println(s.peek());
    }
}
