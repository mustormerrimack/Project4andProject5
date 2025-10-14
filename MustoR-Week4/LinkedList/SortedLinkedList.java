package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * This class is used to create and then sort a linked list based on a user
 * input string.
 *
 * @author Renaldo Musto
 * @version 1.0.0
 * @since 2025-09-30
 */

public class SortedLinkedList {

    /**
     * This is the default constructor for the SortedLinkedList class.
     */
    public SortedLinkedList() {
        // The constructor is intentionally empty.
    }

    /**
     * This method accepts a string of user input. It then creates a new linked list and
     * subsequently fills it in by parsing through the string to isolate each number as
     * well as checking that they are numbers and offering an error message if there is
     * non-numeric input.
     * @param userInput This accepts the user input and passes it to the method for parsing
     *                  and sorting
     * @return linkedList This contains the now sorted user input in the form of a linked list
     */
    public List<Integer> createAndSortList(String userInput){

        List<Integer> linkedList = new LinkedList<>();

        // Separate the String into integers based on spaces
        String[] numberStrings = userInput.split("\\s+");

        // Loop through each number string, parse it, and add to the list
        for (String numStr : numberStrings) {
            // Use a try-catch block to handle non-numeric input
            try {
                linkedList.add(Integer.parseInt(numStr));
            } catch (NumberFormatException e) {
                System.out.println("Warning: '" + numStr + "' is not a valid integer and will be skipped.");
            }
        }

        Collections.sort(linkedList);

        return linkedList;
    }
}
