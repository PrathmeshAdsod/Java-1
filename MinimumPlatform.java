import java.util.Arrays;

public class MinimumPlatform {

    static int findPlatorm(int arr[],int dep[],int n){

        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat_needed = 1, result = 1;
        int i = 1, j = 0;
 
        // Similar to merge in merge sort to process
        // all events in sorted order
        while (i < n && j < n) {
            // If next event in sorted order is arrival,
            // increment count of platforms needed
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }
 
            // Else decrement count of platforms needed
            else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }
 
            // Update result if needed
            if (plat_needed > result)
                result = plat_needed;
        }
 
        return result;
    }

    
    public static void main(String[] args) {
        
        int arr[] = { 2000,3000,4000,5000 };
        int dep[] = { 2300,3400,4500,5600};
        int n = arr.length;
        System.out.println("Minimum Number of Platforms Required = "
                           + findPlatorm(arr, dep, n));
    }
}
