class Reuse {
    int SquArea(int rad) {
        return rad*rad;
    }
}
class Circle {
    Reuse use; // Aggregation
    double d = 3.14;
    double CicArea(int radius) {
     //  Reuse use = new Reuse();
        use = new Reuse();
        int sqr = use.SquArea(radius);
        return d*sqr;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Circle c = new Circle();
        double res = c.CicArea(5);
        System.out.println(res);
    }
}
