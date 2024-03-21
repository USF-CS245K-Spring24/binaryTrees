import java.util.HashMap;

/** Demonstrates how to use a HashMap that you'd need in computeCorrelation in RatingsList in project 2.
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> phoneBookMap = new HashMap<>();
        phoneBookMap.put("Hao Li", "415-422-5617");
        phoneBookMap.put("Jessica Smith", "510-728-5825");
        phoneBookMap.put("Carlos Hernandez", "510-234-3409");
        System.out.println(phoneBookMap.get("Carlos Hernandez"));
        System.out.println(phoneBookMap.containsKey("Kate"));
    }
}
