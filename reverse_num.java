import java.util.Scanner;

public class reverse_num {

    static void Addition(int num) {
        // Code for Addition of that Number
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of the digit is " + sum);
    }

    static void Reverse(int num) {
        // Code for Reversing
        int reversed = 0;
        while (num != 0) {
            int modulus = num % 10;
            reversed = reversed * 10 + modulus;
            num = num / 10;
        }
        System.out.println("Reverse of given number is " + reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        Reverse(num);
        Addition(num);

    }
}
