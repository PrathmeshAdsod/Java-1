
// Time Complexity is O(n)

import java.util.HashSet;

public class FirstRepeatingElement2 {

    static void firstRepeating(int arr[]){
        int first = -1;
        boolean found = false;

        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<arr.length; i++){
            if(set.contains(arr[i])){
                first = i;
                found = true;
                break;
            }else{
                set.add(arr[i]);
            }
        }
        if(found){
          System.out.println("First repeating element is "+arr[first]);
        }else{
            System.out.println("No repeating element found");
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {2,5,7,6,7,3,4,9};
        firstRepeating(arr);
    }
}
