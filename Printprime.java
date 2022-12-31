public class Printprime {

    static void print(int max){
        for(int i=2; i<=max; i++){
            int count=0;
            for(int j=2;j<i-1;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        print(150);
    }
}
