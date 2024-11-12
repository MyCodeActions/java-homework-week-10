import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class HashSetUsingLoop {

    public static void main(String[] args) {
        numberInSet();
    }

    public static void numberInSet() {
        // Create a HashSet to store Integer objects
        HashSet<Integer> setNumber = new HashSet();

        // Add numbers to the set
        setNumber.add(4);
        setNumber.add(7);
        setNumber.add(8);

        // Check which numbers from 1 to 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (setNumber.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}
