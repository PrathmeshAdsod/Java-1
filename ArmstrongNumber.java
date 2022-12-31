import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked as Armstrong or Not ");
        int num = sc.nextInt();
        
        // Store num value into n
        int n = num;

        int sum = 0;
        while(n != 0){
            int digit = n%10;
            sum = sum + (digit*digit*digit);
            n = n/10;
        }

        if(sum == num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
}
