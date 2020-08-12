import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // min and max size of randomizer
        int min = 1;
        int max = 100;
        double random_number = Math.random() * (max - min + 1) + min;
        int num = (int) random_number;

        // countUp will increment every iteration
        int countUp = 0;

        // countDown will decrement every iteration for user
        int countDown = 10;

        // do while boolean for initial play
        boolean play = true;

        // do while boolean for restarting game
        boolean playAgain = true;

        // initial user input
        System.out.println("Would you like to play my guessing game?: y/n");
        String playOrNot = scanner.nextLine();

        // wrapping the entire game in do while to play again if yes
        do {
            if (playOrNot.equals("n")) {
                System.out.println("Okay, have a good day.");
            } else {
                System.out.println("you have 10 chances to guess the right number!\nHint: Press 'x' at any time to exit game.");
                System.out.println("Guess an integer, 1 to 100: ");

                // wrapping the game functionality into do while if the user wants to play
                do {
                    String userGuess = scanner.nextLine();
                    if (userGuess.toLowerCase().equals("x")) {
                        break;
                    }
                    int guess = Integer.parseInt(userGuess);
                    if (guess < 1 || guess > 100) {
                        System.out.println("This is not a valid number. This counts as a loss of a turn.");
                    } else {
                        if (guess > num && countUp != 10) {
                            System.out.println("LOWER");
                        } else if (guess < num && countUp != 10) {
                            System.out.println("HIGHER");
                        } else if (guess == num && countUp != 10) {
                            System.out.println("GOOD GUESS!");
                            break;
                        }
                    }
                    countUp++;
                    countDown--;
                    if (countDown == 5) {
                        System.out.printf("You have %d guesses left.\n", countDown);
                    } else if (countDown == 1) {
                        System.out.printf("You have %d guess left.\n", countDown);
                    }
                    if (countUp >= 10) {
                        break;
                    }
                } while (play);

                System.out.println("Would you like to play again? y/n: ");
                String yesOrNo = scanner.nextLine();
                if (yesOrNo.equals("n")) {
                    break;
                }
            }
        } while (playAgain);
    }
}
