
public class ArrayRemoveDuplicate2 {

    /*
     * static void removeDuplicateSorted(int arr[],int n){ int new_arr[] = new
     * int[n]; int j=0;
     * 
     * for(int i=0; i < n-1; i++){ if(arr[i] != arr[i+1]){ new_arr[j] = arr[i]; j++
     * ; } } new_arr[j] = arr[n-1];
     * 
     * System.out.print("Removal from SORTED Array "); for(int i=0; i <
     * new_arr.length; i++){
     * 
     * System.out.print(new_arr[i]+" "); } }
     */

    static void removeDuplicateSorted2(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        arr[j] = arr[n - 1];

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        // REMOVE From SORTED ARRAY
        int arr[] = { 2, 3, 3, 5, 7, 7, 8, 9, 9,20,20,30,30,30 };
        int n = arr.length;

        // removeDuplicateSorted(arr, n);

        removeDuplicateSorted2(arr, n);

    }
}
