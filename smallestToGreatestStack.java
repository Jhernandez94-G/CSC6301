import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

    /**
     * @author Jeremy Hernandez
     * @since Week 5 CSC6031
     * @version 1.0.0
     * This class takes in values from a user, stores them in a stack, and outputs the values
     * in ascending order.
     */
    public class smallestToGreatestStack {
        /**
         * Main method gets integers from user input, stores them in a stack,
         * and prints them in ascending order.
         * @param args: None
         */
        public static void main(String[] args){
            /* Created instance of scanner that intakes user input */
             Scanner scanner = new Scanner(System.in);
            /* Created instance of stack called Values that only stores integers */
            Stack<Integer> Values = new Stack<>();
            
            System.out.println("Please enter integer values to store in stack: (if finished enter anything that is not an integer) ");
            
            /* While loop that continues running as long as user enters integer values.*/
            while (scanner.hasNext()){
                if (scanner.hasNextInt()) {
                    /* Pushing values onto the stack*/
                    Values.push(scanner.nextInt());  
                }
                else{
                    break;
                }
            }
            scanner.close();
            
            /* Sort the list in ascending order*/ 
            Collections.sort(Values);
            
            /* Output the sorted values*/ 
            System.out.println("Numbers listed in order from least to greatest: ");
            for (int val : Values){
                System.out.print(val + " ");
            }
        }
    }
