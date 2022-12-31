import java.util.Scanner;

// 2^n = ? then true else false

/*
Input: N = 98
Output: false
Explanation: 
98 cannot be obtained by any power of 2.
*/

public class PowerOfTwo {

    static boolean isPower(int val){
        if(val==0){
            return false;
        }
        
return (int)(Math.ceil((Math.log(val) / Math.log(2)))) ==
(int)(Math.floor(((Math.log(val) / Math.log(2)))));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int val = sc.nextInt();
        sc.close();

        if(isPower(val)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

      
    }
}
