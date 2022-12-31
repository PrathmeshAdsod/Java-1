
import java.util.Stack;
class ReverseUsingStack{

    public static void main(String[] args) {
        
        Stack<Character> st =  new Stack<>();
        String s = "Ramanujan";
        char c[] = s.toCharArray();

        for(char d : c){
            st.push(d);
        }

        for(int i = 0; i < s.length();i++){
            c[i] = st.pop();
        }

        System.out.println(s.valueOf(c));

        
    }
}