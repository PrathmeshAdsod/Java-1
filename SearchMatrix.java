public class SearchMatrix {

    static void toSearch(int arr[][], int n, int x) {
        // To search
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == x) {
                    System.out.println("Element found at index ("+i+","+j+")");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Here 4 rows and 4 cols are present thus it is 2D array

        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

        // To Print elements in array
        /*
         * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length;
         * j++) { System.out.print(arr[i][j] + " "); }
         * 
         * System.out.println(); }
         */

        int x = 35;
        int n = arr.length;

        toSearch(arr, n, x);

    }
}
