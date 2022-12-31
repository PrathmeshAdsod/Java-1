public class Method {
    public static int sum(int a,String b,int c) {
        System.out.println(b);
        int d = a+c;
        return d;
    }


    public static void main(String[] args) {
        System.out.println(sum(5,"Prathm",10));
    }
}
