/*
Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets: 
1 + 2 = 3 and 3 +2 = 5 
*/

public class NumberOfTriplets {

    public static void main(String[] args) {
        int arr[] = {2,3,5,8,6};
        int n = arr.length;
        int sum, count=0;

        for(int i = 0; i < n-1;i++){
        sum = arr[i]+arr[i+1];
          for(int j=0; j < n;j++){
              if(arr[j] == sum){
                 count = count+1;
                 break;
              }
          }  
        }
        
        System.out.println("Number of Triplets present are "+count);
    }
}
