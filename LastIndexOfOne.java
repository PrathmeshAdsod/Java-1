public class LastIndexOfOne {

    public static void main(String[] args) {
        String str =  "000100000000000100000";
        int n = str.length();

        for(int i=n-1; i >= 0;i--){
            char st = str.charAt(i);
            if(st == '1'){
                System.out.println("Last Index Of One position is "+i);
                break;
            }
        }
    }
}
