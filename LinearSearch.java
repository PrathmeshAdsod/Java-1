public class LinearSearch {

    public static int Lsearch(int arr[],int element){
          for(int i = 0; i < arr.length ; i++){
              if(arr[i] == element){
                  return i;
              }
          }
        return -1;
          
    }

    public static void main(String[] args) {
          int arr[] = {20,40,60,80};
          int element = 60;
          System.out.println("Element found at index "+ Lsearch(arr,element));
    }
}
