import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class IteratorUsingArrayList {

    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> cityName = new ArrayList<>();

        // Adding elements to the ArrayList
        cityName.add("Leeds");
        cityName.add("Manchester");
        cityName.add("London");
        cityName.add("NewYork");
        cityName.add("Vienna");
        cityName.add("Prague");
        cityName.add("Barcelona");
        cityName.add("Salzburg");

        // Getting the iterator
        Iterator<String> iterator = cityName.iterator();

        // Using the iterator to iterate through the ArrayList
        System.out.println("Elements in the ArrayList:");
        while (iterator.hasNext()) {
            // Retrieve and print the next element
            System.out.println(iterator.next());
        }
    }
}

