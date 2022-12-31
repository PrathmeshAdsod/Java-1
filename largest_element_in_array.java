public class largest_element_in_array {
    public static void main(String[] args) {
        int arr[] = {20,45,34,78,97,89,89,20,76,90,92};

        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
             if(max < arr[i]){
                 max = arr[i];
             }
        }
        System.out.println("MAXIMUN ELEMENT IN ARRAY IS : "+max);
    }
}
