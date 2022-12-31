import java.util.Scanner;

// Addition by Recursion

public class Recursion {

    static int add(int n){
        if(n==1){
            return 1;
        }
        return n = n + add(n - 1);
    }

    static int addEvenOdd(int n){

        if(n==1){
            return 1;
        }
        return n + addEvenOdd(n - 2);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( "Addition of first "+n+" numbers is " + add(n));

        if(n%2 == 1){
             System.out.println("Addition of first "+n+" Odd natural numbers is "+addEvenOdd(n));
        }else{
            System.out.println("Addition of first "+n+" Even natural numbers is "+addEvenOdd(n));
        }
    }
}
