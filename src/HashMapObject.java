import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integervalues:
 * And use for each loop to iterate the value from Map.
 */
public class HashMapObject {

    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        HashMap<String, Integer> people = new HashMap();

        // Add some entries to the HashMap
        people.put("Prashant", 101);
        people.put("David", 102);
        people.put("John", 103);
        people.put("Kevin", 104);
        people.put("Khairul", 105);


        // Use a for-each loop to iterate through the values of the map
        System.out.println("ID of people in the map:");
        for (Integer id : people.values()) {
            System.out.println(id);
        }
    }
}

