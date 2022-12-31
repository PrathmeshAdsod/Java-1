import java.util.HashSet;

public class Union_of_Array {

    static int Union(int arr[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int element : arr){
            set.add(element);
        }
        for(int element : arr2){
            set.add(element);
        }

        System.out.println(set);
        return set.size();
    }

    // Union using Hash for Optimizes Code
    public static void main(String[] args) {
        int arr[] = {5,20,5,30};
        int arr2[] = {50,50};
        System.out.println(Union(arr, arr2));

        }
}
