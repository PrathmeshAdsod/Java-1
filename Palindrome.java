
public class Palindrome {


    public boolean isPalindrome(String word){

        /* toCharArray method convers a string into char array in java */
        char charArray[] = word.toCharArray();
         int start = 0;
         int end = word.length() - 1;

         while(start < end){
             if(charArray[start] != charArray[end] ){
                 return false;
             }
             start++;
             end--;
         }
         return true;
    } 


    public static void main(String[] args) {
        Palindrome check = new Palindrome();

        if(check.isPalindrome("madam")){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
