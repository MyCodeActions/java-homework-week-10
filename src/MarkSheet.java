import java.util.Scanner;
/** 2. Write below program suing if else and while loop..
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */


public class MarkSheet {


    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("\nEnter Student Name      \t \t:\t");
        String name = scanner.next();

        // Input roll number
        System.out.print("Enter Student Roll Number \t\t:\t");
        int rollNum = scanner.nextInt();

        // Input marks for Maths, Science, and English with validation using while loop
        int mathsMarks = getValidMarks(scanner, "Maths");
        int scienceMarks = getValidMarks(scanner, "Science");
        int englishMarks = getValidMarks(scanner, "English");

        // Calculate total, percentage, result, and grade
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);

        // Print the mark sheet
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        // Close the scanner object
        scanner.close();
    }

    // Method to get valid marks within 0-100
    public static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter Marks of Subject " + subject + "\t:\t");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid input, Marks should be between 0 and 100.");
            }
        }
        return marks;
    }

    // Calculate the sum of marks
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Calculate the result based on subject marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculate grade based on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = "-";
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        }
        return grade;
    }

    // Print the mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, int total, int percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name: " + name + "                 |");
        System.out.println("| Roll No: " + rollNum + "               |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects : Marks          |");
        System.out.println("|___________________________|");
        System.out.println("| Math    : " + mathsMarks + "             |");
        System.out.println("| Science : " + scienceMarks + "             |");
        System.out.println("| English : " + englishMarks + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Total   : " + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage : " + percentage + "         |");
        System.out.println("| Result     : " + result + "          |");
        System.out.println("| Grade      : " + grade + "           |");
        System.out.println("|___________________________|");
    }
}

