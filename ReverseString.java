public class ReverseString {


    public static void main(String[] args) {
        String myname =  "Prathmesh";

        char name[] = myname.toCharArray();

        // First Method

/*   int start = 0;
        int end = myname.length()-1;

        while(start < end){
            char temp = name[start];
            name[start] = name[end];
            name[end] = temp;

            start++;
            end--;
        }

        System.out.println(name);
*/        

       // Second Method

       int n = myname.length() - 1;
       for(int i = 0;i < n;i++){
           char temp = name[i];
           name[i] = name[n];
           name[n] = temp;

           i++;
           n--;
       }

       //String.valueOf(char_name)   changes value to string
       System.out.println("Reverse of String is "+String.valueOf(name));
    }
}
