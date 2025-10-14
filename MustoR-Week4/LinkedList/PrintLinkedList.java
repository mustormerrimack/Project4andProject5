package LinkedList;

import java.util.List;

/**
 * This class prints the sorted linked list to the user.
 *
 * @author Renaldo Musto
 * @version 1.0.0
 * @since 2025-09-30
 */

public class PrintLinkedList {

    /**
     * This is the default constructor for the PrintLinkedList class.
     */
    public PrintLinkedList() {
        // The constructor is intentionally empty.
    }

    /**
     * This method implements the code necessary to print the linked list to the terminal
     * after the user hits enter when completing their input.
     * @param linkedList This holds the sorted list of integers to be printed
     */
    public void printLinkedList(List<Integer> linkedList) {
        System.out.println("\nSorted List:"); // List is sorted in SortedLinkedList
        System.out.println(linkedList);
    }
}
