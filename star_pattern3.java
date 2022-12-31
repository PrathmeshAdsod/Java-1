import java.util.Scanner;
/*
Output sample for 4
* * * *
 * * *
  * *
   *
*/
public class star_pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= num-i+1 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
    
}
