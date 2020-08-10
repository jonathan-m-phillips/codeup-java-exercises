import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner.useDelimiter("\n");

        // printing pi
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.", pi);


        // taking user input and parsing it as an integer
        System.out.println("\n\nEnter an integer: ");
        String userInput = scanner.next();
        int userInt = Integer.parseInt(userInput);
        System.out.println("You entered: " + userInt);


        // example of how to make user input integer
        int userInteger = 0;
        while (userInteger == 0) {
            System.out.print("\n\nEnter some integer: ");
            try {
                userInteger = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("That is not an integer.");
                userInteger = 0;
                scanner.nextLine();
            }
        }
        System.out.println("You entered: --> \"" + userInteger + "\" <--");


        // taking 3 user input words and displaying them separately
        System.out.println("\nEnter three words: ");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();
        System.out.printf("First word: %s, Second word: %s, Third word: %s.", wordOne, wordTwo, wordThree);


        // prompting user for sentence and returning it back
        System.out.println("\nEnter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.printf("\nYou entered:\n%s", userSentence);


        // giving area and perimeter of a room
        System.out.println("\nEnter length of your room in feet: ");
        String lengthOfRoom = scanner.next();
        double length = Double.parseDouble(lengthOfRoom);

        System.out.println("Enter width of your room in feet: ");
        String widthOfRoom = scanner.next();
        double width = Double.parseDouble(widthOfRoom);

        System.out.println("Enter the height of your room in feet: ");
        String heightOfRoom = scanner.next();
        double height = Double.parseDouble(heightOfRoom);

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double volume = length * width * height;

        System.out.printf("\nThe area of your room is: %.2f sq ft.\nThe perimeter of your room is: %.2f feet.\nThe volume of the room is: %.2f cu ft.", area, perimeter, volume);


    }
}

