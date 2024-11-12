import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not
 */
public class CheckArrayList {

    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> list = new ArrayList();


        // Adding an element to the ArrayList
        list.add("Java is easy");

        // Checking if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

    }
}