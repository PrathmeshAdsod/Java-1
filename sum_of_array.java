public class sum_of_array {

    public static void main(String[] args) {
        int arr[] = {20,70,80,56,90,89,78};

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
