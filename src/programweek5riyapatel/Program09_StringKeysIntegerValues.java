package programweek5riyapatel;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Program09_StringKeysIntegerValues {
    public static void main(String[] args) {
        HashMap<String, Integer> People = new HashMap<>();

        People.put("Sarvat", 100);
        People.put("Aarti", 101);
        People.put("Mukesh", 102);
        People.put("Riya", 103);
        People.put("Jasmeen", 104);
        People.put("Komal", 105);
        People.put("Jaydeep", 106);

        for (Map.Entry<String, Integer> people : People.entrySet()) {
            System.out.println(people.getKey() + " = " + people.getValue());
        }
    }
}
