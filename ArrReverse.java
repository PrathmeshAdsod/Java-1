
import java.util.Scanner;

class ArrReverse{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array ");
        int n = sc.nextInt();

        //Initialization
        int arr[] = new int[n];


        System.out.println("Enter Elements of array ");
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}