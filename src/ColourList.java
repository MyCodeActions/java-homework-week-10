import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
 */
public class ColourList {

    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList();

        // Add some colors to the list
        colors.add("White");
        colors.add("Orange");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Print out each color using a for-each loop
        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

