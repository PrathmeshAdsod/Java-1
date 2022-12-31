
import java.util.Scanner;
public class ArrayByUserInput {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        sc.close();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<a.length ;i++) {
            System.out.println(a[i]);
        }
     }
}
