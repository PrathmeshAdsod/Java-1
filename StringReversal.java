import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        sc.close();
        // Reverse a string
        String rev = "";
        int n = str.length();

        for(int i = n-1; i >= 0; i--){
            rev += str.charAt(i) ;
        }

        System.out.println(rev);

        // Reverse a string WORD by WORD

        String add = "";
        
        while(n >= 0){
            while(n >=0 && str.charAt(n) != ' '){
                n--;
            }
            int k = n;

            while(n >= 0 && str.charAt(n) != ' ') n--;

            if(add.isEmpty()){
                add.concat(str.substring(n+1, k+1));
            }else{
                add.concat(" "+ str.substring(n+1, k+1));
            }
        }


    }
}
