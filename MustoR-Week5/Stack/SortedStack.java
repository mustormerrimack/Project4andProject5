package Stack;

import java.util.Collections;
import java.util.Stack;

/**
 * This class is used to create and then sort a stack based on a user
 * input string.
 *
 * @author Renaldo Musto
 * @version 1.0.1
 * @since 2025-10-07
 */

public class SortedStack {

    /**
     * This is the default constructor for the SortedStack class.
     */
    public SortedStack() {
        // The constructor is intentionally empty.
    }

    /**
     * This method accepts a string of user input. It then creates a new stack and
     * subsequently fills it in by parsing through the string to isolate each number as
     * well as checking that they are numbers and offering an error message if there is
     * non-numeric input.
     * @param userInput This accepts the user input and passes it to the method for parsing
     *                  and sorting
     * @return stack This contains the now sorted user input in the form of a stack
     */
    public Stack<Integer> createAndSortStack(String userInput){

        Stack<Integer> stack = new Stack<>();

        // Separate the String into integers based on spaces
        String[] numberStrings = userInput.split("\\s+");

        // Loop through each number string, parse it, and push to the stack
        for (String numStr : numberStrings) {
            // Use a try-catch block to handle non-numeric input
            try {
                stack.push(Integer.parseInt(numStr));
            } catch (NumberFormatException e) {
                System.out.println("Warning: '" + numStr + "' is not a valid integer and will be skipped.");
            }
        }

        Collections.sort(stack);

        return stack;
    }
}
