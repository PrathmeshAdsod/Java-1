import java.util.Scanner;

public class sum_of_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int sum=0;
        while(num != 0){
            int digit = num % 10;
            sum = sum+digit;
            num = num/10; // it will be converted in int automatically from float
        }
        System.out.println("Sum of Digits is : "+sum);
    }
}
