import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int new_arr[] = new int[n1+n2];

        int pos = 0;
        for(int element : arr1 ){
             new_arr[pos] += element; 
             pos++;
        }
        for(int element : arr2){
            new_arr[pos] += element;
            pos++;
        }

        System.out.println(Arrays.toString(new_arr));
    }
}
