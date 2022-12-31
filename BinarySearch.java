// binary Search only works in sorted array

import java.util.Scanner;

public class BinarySearch {

    public static int Search(int arr[], int element) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + high / 2;

            if (arr[mid] == element) {
                return mid;
            }

            if (element < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        System.out.println("Enter elment to be Searched ");
        int element = sc.nextInt();

        sc.close();
          
        System.out.println(Search(arr, element));

    }
}
