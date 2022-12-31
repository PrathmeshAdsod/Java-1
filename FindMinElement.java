import java.util.Scanner;

public class FindMinElement {


    static void display(int arr[],int size){
         for(int i = 0; i < size; i++){
              System.out.print(arr[i]+" ");
         }
         System.out.println();
    }

    static int minimum(int arr[]){
          if(arr == null){
              throw new IllegalArgumentException("Invalid Input");
          }

          int min = arr[0];
          for(int i =0; i<arr.length;i++){
               if(arr[i] < min){
                   min = arr[i];
               }
          }
          return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter Elements of Array : ");
        for(int i = 0; i < size;i++){
            arr[i] = sc.nextInt();
        }

        display(arr, size);
        System.out.println("Minimum Element in Array is "+minimum(arr));



    }
}
