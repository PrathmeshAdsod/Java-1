import java.util.*;
public class PythagorusTriplet {

	static boolean isTriplet(int arr[], int n)
	{
		
		for (int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];

		
		Arrays.sort(arr);

		for (int i = n - 1; i >= 2; i--) {
			
			int l = 0; // index of the first element in arr[0..i-1]
			int r = i - 1; // index of the last element in arr[0..i-1]
			while (l < r) {
				// A triplet found
				if (arr[l] + arr[r] == arr[i])
					return true;

				// Else either move 'l' or 'r'
				if (arr[l] + arr[r] < arr[i])
					l++;
				else
					r--;
			}
		}

		// If we reach here, then no triplet found
		return false;
	}

	// Driver program to test above function
	public static void main(String[] args)
	{
		int arr[] = { 3, 1, 4, 6, 5 };
		int arr_size = arr.length;
		if (isTriplet(arr, arr_size) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}


