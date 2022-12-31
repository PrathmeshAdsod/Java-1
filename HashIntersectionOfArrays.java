import java.util.HashSet;

public class HashIntersectionOfArrays {

    public static void main(String[] args) {

        int arr[] = {2,5,3,8,9,43};
        int arr2[] = {5,8,23,50};

        HashSet<Integer> set = new HashSet<>();
        
        for(int element : arr){
            set.add(element);
        }
        for(int element : arr2){
            if(set.contains(element)){
                System.out.println("The insersecting Elements are "+element);
            }
        }
    }
}
