package Stack;

import java.util.Stack;
import java.util.Scanner;

/**
 * This is the class that is meant to run the program and tie all the classes together.
 * This class creates the scanner object to pass to GetUserInput, creates objects of
 * the three classes and then passes the necessary information to them in order.
 *
 * @author Renaldo Musto
 * @version 1.0.1
 * @since 2025-10-07
 */

public class Main {

    /**
     * This is the default constructor for the Main class.
     */
    public Main() {
        // The constructor is intentionally empty.
    }

    /**
     * This method initiates the scanner and sends it to getUserInput. It then creates objects
     * of all the neccesary classes and proceeds to pass in the data accordingly to run the full
     * program
     *
     * @param args This is a default parameter for main (unused in this application)
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Used by GetUserInput

        GetUserInput userInput = new GetUserInput();
        SortedStack stackCreator = new SortedStack();
        PrintStack stackPrinter = new PrintStack();

        // Use the userInput object to get the unsorted string from the user.
        String unsortedInput = userInput.getUserInput(scanner);

        // Pass the unsorted string to the stackCreator object. It returns a sorted stack.
        Stack<Integer> sortedNumbers = stackCreator.createAndSortStack(unsortedInput);

        // Pass the final sorted stack to the stackPrinter object to be displayed.
        stackPrinter.printStack(sortedNumbers);

        scanner.close();
    }
}
