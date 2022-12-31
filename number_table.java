public class number_table {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 20; i++) {
            int num1 = i;
            for(int j = 1 ; j <= 10; j++) {
                System.out.print(num1 * j + " ");
            }
            System.out.println();
        }
    }
    
}
