import java.util.Hashtable;
import java.util.Map;

public class Hashtablenew {
    public static void main(String[] args) {
        Hashtable<Integer,String> hash = new Hashtable<>(2); // Two is Initial size

        System.out.println(hash.isEmpty());
        // Add Elements
        hash.put(20,"ABC");
        hash.put(12,"EFG");
        hash.put(10,"ABCF");
        hash.put(92,"EFGK");
        hash.put(80,"ABCE");
        hash.put(62,"EFGI");
        hash.put(70,"ABCD");
        hash.put(52,"EFGH");

        System.out.println("Elements in a hashtable is \n"+hash);

        // Changing Element in Hashtable
        hash.put(10,"Prathmesh");
        System.out.println("After updating element with key 10 \n"+hash);

        hash.remove(52);
        hash.remove(62);

        System.err.println("After removing \n"+hash);

        // Iterating a hashtable
        for(Map.Entry<Integer,String> abc : hash.entrySet()){
            System.out.println(abc.getKey()+"  "+abc.getValue());
        }

        System.out.println("Hashtabe is empty : "+hash.isEmpty());

        System.out.println("Provided value present or not "+hash.contains("ABCE"));

        hash.clear();
        System.out.println("Hashtabe is empty : "+hash.isEmpty());
    }
}
