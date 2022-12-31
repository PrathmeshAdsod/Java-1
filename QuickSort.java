class QuickSort{

    static int partition(int arr[] , int low , int high){
        int pivot = arr[low+high/2];

        while(low <= high){
            while(arr[low] < pivot){
                low++;
            }
            while(arr[high] > pivot){
                high--;
            }
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }
    static void QuickRecursion(int arr[],int low,int high){
        int par = partition(arr, low, high);
        if(low < par-1){
            QuickRecursion(arr, low, par-1);
        }
        if(par < high){
            QuickRecursion(arr, par, high);
        }
    }
    static void print(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
         int arr[] = {33,66,34,98,76,89,23,9,15,52,26,68};
         int n = arr.length;   
         
         QuickRecursion(arr, 0, n-1);
         print(arr);
    }
}