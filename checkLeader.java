public class checkLeader {

    public static void main(String[] args) {
        int arr[] = {2,5,4,17,8,14,12};
        int n = arr.length-1;
        int i,j;

        for(i = 0; i < n; i++){
            for(j = i+1; j < n; j++){
                 if(arr[j] > arr[i]){
                     break;
                 }
            }
            if(arr[i] > arr[j]){
                System.out.println(arr[i]+" is a LEADER");
            }
        }
        System.out.println(arr[n]+" is a LEADER");
    }
}
