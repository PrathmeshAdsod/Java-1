import java.util.Scanner;
/*
output for  4
*
* *
* * *
* * * *
*/
public class star_pattern2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}