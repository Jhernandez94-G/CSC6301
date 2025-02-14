import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
    /**
     * @author Jeremy Hernandez
     * @since Week 4 CSC6031
     * @version 1.0.0
     * This class takes in values from a user, stores them in a linked list and outputs the values
     * in ascending order. This class uses the Java Utilities package to create a Linked List as well as
     * aid in sorting user inputted data.
     */
    public class smallestToGreatestLL {
        /**
         * Main method gets integers from user input, stores them in a linked list,
         *  and prints them in ascending order.
         * @param args: None
         */
        public static void main(String[] args){
            /* Created instance of scanner that intakes user input from java utility package*/ 
            Scanner scanner = new Scanner(System.in);
            /* Created instance of linked list called Values that only stores integers from Java package util*/ 
            LinkedList<Integer> Values = new LinkedList<>();
            
            System.out.println("Please enter integer values to store in list: (if finished enter anything that is not an integer) ");
            /* While loop that continues running as long as user enters integer values.*/ 
            while (scanner.hasNext()){
                if (scanner.hasNextInt()) {
                    Values.add(scanner.nextInt());}
                else{
                    break;
                }
            }
            scanner.close();
            /*  Used collections package sort method to order values from least to greatest*/
            Collections.sort(Values);
            System.out.println("Numbers listed in order from least to greatest: ");
            /* for loop used to output linked list integers from least to greatest. */ 
            for (int val : Values){
                System.out.print(val + " ");
                }
        }
    }