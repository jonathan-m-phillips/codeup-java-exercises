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

    }

    // 1: Basic Arithmetic
    public static double addition (double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction (double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication (double num1, double num2) {
        return num1 * num2;
    }


    public static Serializable division (double num1, double num2) {
        String undefined = "undefined";
        if (num2 == 0) {
            return undefined;
        }

        return num1 / num2;

    }

    public static double remainder (double num1, double num2) {
        return num1 % num2;
    }



    // 2: Create a method that validates that user input is in a certain range
    public static int getInteger (int min, int max) {
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


}
