import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.next();
        System.out.println("You entered:   \"" + userInput + "\"");


    }
}
