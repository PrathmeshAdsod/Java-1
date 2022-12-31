import java.util.HashSet;

class CountDistinctElementsUsingHashSet{
    static int count(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        return set.size();
    }
    public static void main(String[] args) {
              int arr[] = {20,30,40,30,20,50,60};
              System.out.println("Count of Distinct of Element using Array is " 
              +count(arr));
    }
}