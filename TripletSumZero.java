import java.util.HashSet;

public class TripletSumZero {

    public static void Triplet(int arr[],int n){
        boolean found = false;

        

        for(int i=0; i < n-1; i++){

            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1; j < n; j++){

                
                int x = - (arr[i]+arr[j]);

                if(set.contains(x)){
                     System.out.println(x+" "+arr[i]+" "+arr[j]);
                     found = true;
                }else{
                    set.add(arr[j]);
                }
            }
        }
        if(found == false){
            System.out.println("No Triplet Present");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,-1,2,-3,1};
        int n = arr.length;

        Triplet(arr, n);
    }
}