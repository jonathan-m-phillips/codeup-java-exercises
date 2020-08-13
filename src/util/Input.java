package util;

import java.util.Scanner;



public class Input {
    private Scanner scanner = new Scanner(System.in);


    public String getString () {
        System.out.println("Enter a string.");
        String str = scanner.nextLine();
        return str;
    }



    public boolean yesNo () {
        System.out.println("Do you like Java? The language not the coffee.");
        String userInput = scanner.nextLine();
        if (userInput.toLowerCase().equals("y") || userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("true")) {
            boolean answer = Boolean.parseBoolean(userInput);
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }



    public int getInt (int min, int max) {
        boolean waitingInt = true;
        int num = 0;

        do {
            System.out.printf("Enter a number between %d and %d:\n", min, max);
            String userInput = scanner.nextLine();
            num = Integer.parseInt(userInput);

            if (num >= min || num <= max) {
                System.out.println(num);
                waitingInt = false;
                break;
            }
        } while (waitingInt);
        return num;
    }



    public double getDouble (double min, double max) {
        boolean waitingDouble = true;
        double numDouble = 0;
        do {
            System.out.printf("Enter a number between %f and %f:\n", min, max);
            String userInput = scanner.nextLine();
            numDouble = Double.parseDouble(userInput);

            if (numDouble >= min || numDouble <= max) {
                System.out.println(numDouble);
                waitingDouble = false;
                break;
            }
        } while (waitingDouble);
        return numDouble;
    }
}