import java.util.Scanner;

public class SumOfNum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start_num = sc.nextInt();
        int last_num = sc.nextInt();

      /*//For first n natural numbers
       int sum = last_num*(last_num+1)/2;

        System.out.println(sum);*/

        //For n natural numbers in given range
        int sum = 0;
        for(int i = start_num; i <= last_num; i++){
            sum = sum+i;
        }
        System.out.println(sum);

    }
}