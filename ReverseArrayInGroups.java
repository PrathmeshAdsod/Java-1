public class ReverseArrayInGroups {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,20};
        int k = 3;

        for(int i = 0; i < arr.length; i += k){
            int left = i;
            int right = Math.min(i+k-1,arr.length-1);
            int temp;

            while(left<right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }






  /*     // Enter How much numbers you want in Group of Subarray
        int a = 3;
        int n = a;
        int k = 0;
   while(n <= arr.length){
        for(int i = n-1; i>=k;i--){
            System.out.print(arr[i]+" ");
        }
        n = n+a;
        k = k+2;
    }
    if(n >= arr.length){
        System.out.print(arr[arr.length-1]);
    }*/
}

}
