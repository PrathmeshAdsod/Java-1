public class CheckMyPrime{

    static void checkPrime(int n){
        int flag=0,m=0,i;
        m=n/2; // if m come in float value then it automatically convert it in int

        if(n==0 || n==1){     //Becoz checking prime number starts from 2
            System.out.println(n+" is not a prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println(n+" is a prime number");
        }

    }

    public static void main(String[] args) {
        checkPrime(33);
        checkPrime(17);
        checkPrime(97);
        checkPrime(43);
        checkPrime(66);
    }
}