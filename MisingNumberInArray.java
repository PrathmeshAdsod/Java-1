public class MisingNumberInArray {

    // Find Missing element in Given Range 1-N
    public static void main(String[] args) {

        //Here Range is 1 - 10
        int arr[] = {1,2,3,4,5,6,7,9,10};
        int n = arr.length-1;  // n becomes 9-1=8


        for(int i = 0; i < n; i++){
             if(arr[i+1] != arr[i] + 1){
                  System.out.println(arr[i]+1);
             }
        }
    }
}
