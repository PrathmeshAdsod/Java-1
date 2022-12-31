
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {

    private static Set<String> keySet;

    public static void main(String[] args) {
        
        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("Age",20);
        numbers.put("Marks",900);
        numbers.put("Bike",456);
        numbers.put("Age23",990);
        numbers.put("Bell",200);
        numbers.put("Tail",560);
        numbers.put("Mail",900);
        numbers.put("Hail",304);
        numbers.put("Fell",204);
        numbers.put("Sell",203);

        System.out.println(numbers);

        System.out.println(numbers.get("Tail"));

        System.out.println(numbers.containsKey("Jail"));
        System.out.println(numbers.containsValue(200));

        System.out.println(numbers.remove("Hail", 304));
        System.out.println(numbers.remove("Sell"));

        System.out.println(numbers);

        keySet = numbers.keySet();
        System.out.println(keySet);

      //  System.out.println(numbers.values());


        /*Entry Set in java

        Set<Entry<String,Integer> entries = numbers.entrySet();

        for(Entry<String,Integer>> entry: entries) {
            entry.setValue(entry.getValue() * 5);
        }

        System.out.println(numbers);
*/
    }
}
