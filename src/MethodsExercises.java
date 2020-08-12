import java.io.Serializable;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addition(1, 2));

        System.out.println(subtraction(3, 4));

        System.out.println(multiplication(5, 6));

        System.out.println(division(8, 0));

        System.out.println(remainder(17, 3));

        System.out.println(getInteger(1, 10));

        System.out.println(factorial());

        System.out.println(diceRoll());
//
    }

    // 1: Basic Arithmetic
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }


    public static Serializable division(double num1, double num2) {
        String undefined = "undefined";
        if (num2 == 0) {
            return undefined;
        }

        return num1 / num2;

    }

    public static double remainder(double num1, double num2) {
        return num1 % num2;
    }


    // 2: Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        String userInput = scanner.next();
        int userNum = Integer.parseInt(userInput);
        boolean valid = true;

        if (userNum < 1 || userNum > 10) {
            do {
                System.out.print("Enter a number between 1 and 10: ");
                userInput = scanner.next();
                userNum = Integer.parseInt(userInput);
                if (userNum < 1 || userNum > 10) {
                    valid = false;
                } else {
                    valid = true;
                }
            } while (!valid);
        }
        return userNum;
    }


    // 3: Calculate the factorial of a number
    public static String factorial() {
        Scanner scanner = new Scanner(System.in);

        boolean userAgain = true;

        do {
            System.out.println("Enter a number from 1 to 59");
            String userInput = scanner.nextLine();
            long userNum = Integer.parseInt(userInput);
            long fact = 1;
            System.out.printf("%s! = ", userInput);
            for (int i = 1; i <= userNum; i++) {
                fact *= i;
                if (i < userNum) {
                    System.out.printf("%d X ", i);
                } else if (i >= userNum) {
                    System.out.printf("%d \t = ", i);
                }
            }
            System.out.println(fact);
            System.out.println("Do you want to enter another number? y/n: ");
            String yesOrNo = scanner.nextLine();
            if (yesOrNo.equals("n")) {
                userAgain = false;
            }
        } while (userAgain);
        return "Goodbye.";
    }

    // 4: Create an application that simulates dice rolling.
    public static String diceRoll () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides for a pair of dice: ");
        String userInput = scanner.nextLine();
        int numberOfSides = Integer.parseInt(userInput);
        numberOfSides /= 2;

        boolean userAgain = true;

        do {

            double randomRollOne = Math.random() * numberOfSides + 1;
            double randomRollTwo = Math.random() * numberOfSides + 1;
            int diceOne = (int) randomRollOne;
            int diceTwo = (int) randomRollTwo;

            System.out.println("You rolled a " + diceOne + " and a " + diceTwo + ".");

            System.out.println("Do you want to roll again? y/n: ");
            String yesOrNo = scanner.nextLine();

            if (yesOrNo.equals("n")) {
                userAgain = false;
            }

        } while (userAgain);

        return "Goodbye.";
    }

}


