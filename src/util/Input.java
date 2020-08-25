package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a string.");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Do you like Java? The language not the coffee.");
        String userInput = scanner.nextLine();

        return userInput.toLowerCase().equals("y") || userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("true");
    }

    public int getInt(int min, int max) {
        int num = 0;
        try {
            num = Integer.valueOf(getString());
        } catch (Exception e) {
            System.out.println("that isn't an integer");
        }

        return num;
    }

    public double getDouble(double min, double max) {
        double numDouble = 0;
        try {
            numDouble = Double.valueOf(getString());
            System.out.println(numDouble);
        } catch (Exception e) {
            System.out.println("that isn't a double");
        }
        return numDouble;
    }

    public void movieInput() {
        System.out.println("What would you like to do? \n0 - exit \n1 - view all movies \n2 - view movies in the animated category " +
                "\n3 - view movies in the drama category \n4 - view movies in the horror category " +
                "\n5 - view movies in the scifi category\nEnter your choice: ");
    }

}
