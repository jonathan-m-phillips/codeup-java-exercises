import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        // printing pi
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %4.2f.", pi);
//
//
//        // taking user input and parsing it as an integer
//        System.out.println("\n\nEnter an integer: ");
//        String userInput = scanner.next();
//        int userInt = Integer.parseInt(userInput);
//        System.out.println("You entered: " + userInt);
//
//
//        // example of how to make user input integer
//        int userInteger = 0;
//        while (userInteger == 0) {
//            System.out.print("\n\nEnter some integer: ");
//            try {
//                userInteger = scanner.nextInt();
//            } catch (InputMismatchException ime) {
//                System.out.println("That is not an integer.");
//                userInteger = 0;
//                scanner.nextLine();
//            }
//        }
//        System.out.println("You entered: --> \"" + userInteger + "\" <--");


        // taking 3 user input words and displaying them separately
//        System.out.println("\nEnter three words: ");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.nextLine();
//        System.out.printf("First word: %s, Second word: %s, Third word: %s.", wordOne, wordTwo, wordThree);
//
//
//        // prompting user for sentence and returning it back
//        System.out.println("\nEnter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println("\nYou entered:" + userSentence);


        // giving area and perimeter of a room
        System.out.println("\nEnter length of your room in feet: ");
        String lengthOfRoom = scanner.next();
        int length = Integer.parseInt(lengthOfRoom);

        System.out.println("Enter width of your room in feet: ");
        String widthOfRoom = scanner.next();
        int width = Integer.parseInt(widthOfRoom);

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.printf("\nThe area of your room is: %d feet.\nThe perimeter of your room is: %d feet.", area, perimeter);

    }
}

