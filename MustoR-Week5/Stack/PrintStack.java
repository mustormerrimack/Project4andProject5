package Stack;

import java.util.Stack;

/**
 * This class prints the sorted stack to the user.
 *
 * @author Renaldo Musto
 * @version 1.0.1
 * @since 2025-10-07
 */

public class PrintStack {

    /**
     * This is the default constructor for the PrintStack class.
     */
    public PrintStack() {
        // The constructor is intentionally empty.
    }

    /**
     * This method implements the code necessary to print the stack to the terminal
     * after the user hits enter when completing their input.
     * @param stack This holds the sorted stack of integers to be printed
     */
    public void printStack(Stack<Integer> stack) {
        System.out.println("\nSorted Stack:"); // Stack is sorted in SortedStack
        System.out.println(stack);
    }
}
