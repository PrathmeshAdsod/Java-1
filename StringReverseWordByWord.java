
class StringReverseWordByWord {

    static void reverse(char str[], int start, int end) {

        char temp;

        while (start <= end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    static char[] reverseWords(char[] s) {

        int start = 0;
        for (int end = 0; end < s.length; end++) {

            if (s[end] == ' ') {
                reverse(s, start, end);
                start = end + 1;
            }
        }

        reverse(s, start, s.length - 1);

        reverse(s, 0, s.length - 1);
        return s;
    }

    public static void main(String[] args) {
        String s = "   i like this program very much ";
        char[] p = reverseWords(s.toCharArray());
        System.out.print(p);
    }
}

/*
  
  public class StringReverseWordByWord {
  
  static void word_by_word(String word){ int i = word.length() - 1; String ans
  = " ";
  
  while(i >= 0){
  
  while(word.charAt(i) == ' ' && i >= 0){ i--; }
  
  int j = i;
  
  while(word.charAt(i) != ' ' && i >= 0){ i--; }
  
  if(ans.isEmpty()){ ans = ans.concat(word.substring(i, j)); }else{ ans =
  ans.concat(" "+word.substring(i, j)); }
  
  } System.out.println(ans); }
  
  
  
  public static void main(String[] args) {
  
  String word = "The Sky is Blue";
  
  word_by_word(word);
  
  } }
  */
 