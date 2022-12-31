/*public class SubarraySum2 {

    static void getSum(int arr[],int n,int given_sum){
          int start = 0;
          int end;
          int curr_sum = 0;

          for(end = 0; end < n; end++){

            

            if(curr_sum == given_sum){
                System.out.println(start+" is starting index and "+(end-1)+" is ending index");
                break;
            }

            curr_sum = curr_sum + arr[end];

            if(curr_sum > given_sum){
                while(curr_sum > given_sum){
                    curr_sum = curr_sum - arr[start]; 
                    start++;  
                }
                
            }
        }
        if(curr_sum != given_sum){
            System.out.println("Nothing found !!");
        }
          
    }

    public static void main(String[] args) {
        //int arr[] = { 10, 20, 16, 18, 10, 8, 6 };
        int arr[] = {2,3,4,4,9,6,8};
        int n = arr.length;
        int given_sum = 14;
        
        getSum(arr, n, given_sum);
    }
}
*/


class SubarraySum2 {
	int subArraySum(int arr[], int n, int sum)
	{
		int curr_sum = arr[0], start = 0, i;

		for (i = 1; i <= n; i++) {
			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}

			if (curr_sum == sum) {
				int p = i - 1;
				System.out.println(
					"Sum found between indexes " + start
					+ " and " + p);
				return 1;
			}

			// Add this element to curr_sum
			if (i < n)
				curr_sum = curr_sum + arr[i];
		}

		System.out.println("No subarray found");
		return 0;
	}

	public static void main(String[] args)
	{
		SubarraySum2 arraysum = new SubarraySum2();
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 33;
		arraysum.subArraySum(arr, n, sum);
	}
}
