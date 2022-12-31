
class EquilbriumPoint{

    static int equilibrium(int a[], int n)
    {
        if (n == 1)
            return (0);  // 0 index
        
        int[] front = new int[n];
        int[] back = new int[n];

        for (int i = 0; i < n; i++)
        {
            if (i != 0)
            {
                front[i] = front[i - 1] + a[i];
            }
            else
            {
                front[i] = a[i];
            }
        }
        for (int i = n - 1; i >= 0; i--)
        {
            if (i <= n - 2)
            {
                back[i] = back[i + 1] + a[i];
            }
            else
            {
                back[i] = a[i];
            }
        }
        for(int i = 0; i < n; i++)
        {
            /*
            front[0] = 3 , front[1] = 3,front[2] = 5,front[3] = 2,front[4] = 4
            back[4] = 4,back[3] = 2,back[2] = 5,back[1] = 3,back[0] = 3
            */
            if (front[i] == back[i])
            {
                // Here front[2] == back[2]
                return i;   // i is 2
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int arr[] = { 3,3,5,2,4};
        int arr_size = arr.length;
        
        System.out.println("First Point of equilibrium " +
                        "is at index " +
                        equilibrium(arr, arr_size));
    }
    }
    