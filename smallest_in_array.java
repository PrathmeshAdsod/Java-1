public class smallest_in_array {

    public static void main(String[] args) {
        int arr[] = {120,45,34,78,89,89,20,76,90,92};

        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Smallest Element of given Array is "+min);
    }
}
