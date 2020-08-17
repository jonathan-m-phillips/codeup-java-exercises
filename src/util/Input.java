package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString () {
        boolean userInput = false;
        System.out.println("Enter a string.");
        String str = scanner.nextLine();
        return str;
    }

    public boolean yesNo () {
        System.out.println("Do you like Java? The language not the coffee.");
        String userInput = scanner.nextLine();

        if (userInput.toLowerCase().equals("y") || userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        boolean waitingInt = true;
        int num = 0;
        do {
            System.out.printf("Enter a number from %d and %d:\n", min, max);
            String userInput = scanner.nextLine();
            num = Integer.parseInt(userInput);
            if (num >= min && num <= max) {
                waitingInt = false;
            }
        } while (waitingInt);
        return num;
    }

    public double getDouble () {
        boolean waitingDouble = true;
        double numDouble = 13;
//        do {
//            System.out.printf("Enter a number between %.2f and %.2f:\n", min, max);
//            String userInput = scanner.nextLine();
//            numDouble = Double.parseDouble(userInput);
//            if (numDouble >= min && numDouble <= max) {
//                waitingDouble = false;
//            }
//        } while (waitingDouble);
//        return numDouble;
        return numDouble;
    }

    public void movieInput () {
        System.out.println("What would you like to do? \n0 - exit \n1 - view all movies \n2 - view movies in the animated category " +
                "\n3 - view movies in the drama category \n4 - view movies in the horror category " +
                "\n5 - view movies in the scifi category\nEnter your choice: ");
    }

}