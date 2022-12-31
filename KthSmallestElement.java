import java.util.Arrays;

class KthSmallestElement{

    public static void main(String[] args) {
        int arr[] = {2,6,3,8,12,15};
        int size = arr.length;
        int K = 3;

        Arrays.sort(arr);

  if(K > size){
            System.out.println("Kth enter is Greater than size");
        }else{
        System.out.println("Kth Smallest Element "+"of "+K+"--Kth position is "+arr[K-1]);
    }
    
        
    }
}