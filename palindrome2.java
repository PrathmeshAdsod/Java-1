import java.util.Scanner;
/*For Palindrome this is best code that i made and dont refer any other web for this 
 Question*/
public class palindrome2 {

    static boolean palindromecheck() {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
    
        /* toCharArray method convers a string into char array in java */
        char charArray[] = word.toCharArray();

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

       if(palindromecheck()){
           System.out.println("It is a Palindrome");
       }else{
           System.out.println("It is not a Palindrome");
       }

    }
}
