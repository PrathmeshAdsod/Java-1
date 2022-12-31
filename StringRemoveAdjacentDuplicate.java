public class StringRemoveAdjacentDuplicate {

    static String removeDuplicate(String S){
        char[] ch = new char[S.length()];

        int i=0;
        for(int j=0; j < S.length();j++){
            char current_char = S.charAt(j);
            if(i>0 && ch[i-1] == current_char){
                i--;
            }else{
                ch[i] = current_char;

                i += 1 ;
            }
        }
        return new String(ch,0,i);  // String(byte[] byte_arr, int start_index, int length) 
        
        // To know more for return new String(ch,0,i)
        // read https://www.geeksforgeeks.org/string-class-in-java/
    }

    public static void main(String[] args) {
        String S = "abcaabbde";
        System.out.println(removeDuplicate(S));
    }
}
