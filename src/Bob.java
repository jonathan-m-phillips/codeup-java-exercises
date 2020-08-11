import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a class named Bob with a main method for the following exercise.

        // Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        // Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        // He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        // He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        // He answers 'Whatever.' to anything else.

        boolean talk = true;


        do {
            System.out.println("Do you want to talk to Bob? y/n ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals("n")) {
                break;
            }
            System.out.println("Say something to Bob.");
            String talkingToBob = scanner.nextLine();
            String bobResponse = "";

            if (talkingToBob.endsWith("?")) {
                bobResponse += "sure";
                System.out.println(bobResponse);
            } else if (talkingToBob.endsWith("!")) {
                bobResponse += "Whoa, chill out!";
                System.out.println(bobResponse);
            } else if (talkingToBob.length() == 0) {
                bobResponse += "Fine. Be that way!";
                System.out.println(bobResponse);
            } else {
                bobResponse += "Whatever.";
                System.out.println(bobResponse);
            }
        } while (talk);

    }
}
