import java.util.LinkedHashSet;

public class ArrayRemoveDuplicates {

   // Using LINKEDHASHSET
    public static void main(String[] args) {

        int arr[] = {2,5,8,4,5,2,9,7,3,2,0,9,7,8,5,3};

        int n = arr.length;

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        for(int i=0; i < n; i++){
            set.add(arr[i]);
        }

        System.out.println(set);
        

    }
}
