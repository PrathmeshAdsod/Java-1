public class PairsWithGivenSum {

    static void findPairs(int arr1[],int arr2[],int n,int m,int find){
       
        int sum = 0;

        for(int i=0; i < n; i++){

            for(int j=0; j < m;j++){

                sum = (arr1[i] + arr2[j]);

                if(find == sum){
                    System.out.println(arr1[i]+" "+arr2[j]+" = "+sum);
                }

                

            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10};
        int arr2[] = {1,3,5,7,9};

        int find = 11;

        int n = arr1.length;
        int m = arr2.length;

        findPairs(arr1, arr2, n, m, find);
    }
}
