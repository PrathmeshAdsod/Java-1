
public class BubbleSorting {

    static void Bubble(int arr[] , int n){
        int i,j,temp;
        boolean swapped;

        for(i=0;i<n-1;i++){

            /* Here we are creating boolean swap becoz if array is sorted after that
               pass then their is no need to do another iteration of pass*/
            swapped = false;
            for(j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }

    static void print(int arr[],int n){
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,6,4,9,2,1,5};
        int n = arr.length;
        
        Bubble(arr, n);

        print(arr,n);
    }
}
