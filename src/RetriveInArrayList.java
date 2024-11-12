import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class RetriveInArrayList {

    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> cityName = new ArrayList();

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

        // Retrieve an element at a specified index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index to retrieve the element (0 to " + (cityName.size() - 1) + "): ");
        int index = scanner.nextInt();

        // Check if the index is within range
        if (index >= 0 && index < cityName.size()) {
            String element = cityName.get(index);  // Retrieve element at specified index
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index! Please enter a number between 0 and " + (cityName.size() - 1));
        }

        scanner.close();
    }
}
