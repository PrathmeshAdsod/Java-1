import java.util.Scanner;

public class FindMaxElement {

    public void display(int arr[],int n){
        System.out.println("Elements of array are ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public int maximum(int arr[],int n){
        int Max = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] > Max){
                Max = arr[i];
            }
        }
        return Max;
    }
    
    public static void main(String[] args) {

        FindMaxElement max = new FindMaxElement();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array ");
        int n = sc.nextInt();

        int arr[] = new int[n]; // Initialize array

        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        max.display(arr, n);

        System.out.println("\nMaximum Element value in Given Array is "+max.maximum(arr, n));
    }
}
