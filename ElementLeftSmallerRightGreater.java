
public class ElementLeftSmallerRightGreater {
	static int findElement(int[] arr, int n)
	{
			
			int[] leftMax = new int[n];
			leftMax[0] = Integer.MIN_VALUE;

			for (int i = 1; i < n; i++)
				leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
					
			int rightMin = Integer.MAX_VALUE;

			for (int i = n - 1; i >= 0; i--)
			{
				if (leftMax[i] < arr[i] && rightMin > arr[i])
					return i;

				rightMin = Math.min(rightMin, arr[i]);
			}
			return -1;

			
	}

	public static void main(String args[])
	{
			int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
			int n = arr.length;
			System.out.println("Index of the element is " +
			findElement(arr, n));
	}

}


// Wrong code for Given problem -- please Understand Question First 

/*public class ElementLeftSmallerRightGreater {

    /// Element with left side smaller and right side greater
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 3, 6, 8, 10, 7, 9};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println
                ("Element with left side smaller and right side greater is " + arr[i]);
            }
        }

    }
}*/
