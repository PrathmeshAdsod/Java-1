package Sort;

// It only Swaps elements only n-1 times in complete process
/*It checks smaller number in first iteration and if find it will swap by first number
then it will check again another smaller number in second iteration and 
swap it to position second and so on...
*/   
// Better than Bubble Sort

public class Selection {
    
    public static void main(String[] args) {
        
        int a[] = {3,8,5,0,3,4,2,7,8};
        int n = a.length;

        for(int i = 0; i < n-1; i++) {

            int minIndex = i;
            for(int j = i; j < n ; j++) {

                if(a[j] < a[minIndex]) {
                    minIndex = j;
                }

            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        for(int item : a) {
            System.out.print(item);
        }
    }
    
}
