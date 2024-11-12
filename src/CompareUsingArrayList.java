import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class CompareUsingArrayList {

    public static void main(String[] args) {

        // Declare and initialize the first ArrayList
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Declare and initialize the second ArrayList
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare both ArrayLists and display results
        ArrayList<String> comparisonResult = new ArrayList<>();

        // For each element in c1, check if it is present in c2 and add "Yes" or "No" to comparisonResult
        for (String color : c1) {
            if (c2.contains(color)) {
                comparisonResult.add("Yes");
            } else {
                comparisonResult.add("No");
            }
        }

        // Print the comparison result
        System.out.println("Comparison of elements between c1 and c2:");
        System.out.println(comparisonResult);
    }
}
