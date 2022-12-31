public class StringReverse {

    public static void main(String[] args) {
        String string = "prathmesh";

        int n = string.length();

        String reverse = "";
        for(int i = n-1; i >= 0; i--){
            reverse += string.toUpperCase().charAt(i);
        }
        System.out.println(reverse);
    }
}
