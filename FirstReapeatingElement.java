public class FirstReapeatingElement {

    static int firstRepeating(int arr[],int n){

        boolean found = false;
        
        for(int i=0; i < n-1; i++){

            for(int j=i+1; j < n; j++){

                if(arr[i] == arr[j]){
                    found = true;
                    return arr[i];
                }
                
            }
            if(found){
                break;
            }
            
        }
        return 0; 
        
    }

    public static void main(String[] args) {
        int arr[] = {2,6,3,5,8,9,10};
        int n = arr.length;


       System.out.println(firstRepeating(arr, n));
       


    }
}
