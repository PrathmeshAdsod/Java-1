
public class Overload {

    // double return type is given becoz of double is greater than int
    public static double Mul(int a,double b) {
        return a*b;
    }
    public static float Mul(float a,int b) {
        return a*b;
    }
    public static void main(String[] args) {
        double a = Mul(33,43.4444);
        double b = Mul(33.44f,22);
        System.out.println(a);
        System.out.println(b);
    }
}
