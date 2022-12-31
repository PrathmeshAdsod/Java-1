import java.util.Scanner;

/*
   4
* * * *
  * * *
    * *
      *
*/

class star_pattern4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 1; i <= num ; i++) {
            for(int j = 1; j <= i-1; j++) {
                // Two spaces are given in print
                System.out.print("  ");        // Spaces are printing in this statement
            }
            for(int k=1; k<= num-i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}