public class number_of_digits {
    public static void main(String[] args) {
        long num = 57685215845455487L;
        long n = num;
        int digit = 0;
        while(n != 0){
            long mod = n % 10;
            digit = digit + 1;
            n = n/10;
        }

        System.out.println("The NUMBER "+num+" have "+digit+" DIGITS");

    }
}
