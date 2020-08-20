package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Student student1 = new Student("Cullen Bohannon");
        Student student2 = new Student("Lily Bell");
        Student student3 = new Student("Thomas Durant");
        Student student4 = new Student("Elam Ferguson");

        student1.addGrade(99);
        student1.addGrade(94);
        student1.addGrade(97);

        student2.addGrade(99);
        student2.addGrade(100);
        student2.addGrade(98);

        student3.addGrade(71);
        student3.addGrade(73);
        student3.addGrade(80);

        student4.addGrade(83);
        student4.addGrade(88);
        student4.addGrade(63);


        HashMap<String, Student> students = new HashMap<>();
        students.put("og-cullen-bohannon", student1);
        students.put("miss-lily-bell", student2);
        students.put("doc-durant", student3);
        students.put("mister-ferguson", student4);

        String cullen = "og-cullen-bohannon";
        String lily = "miss-lily-bell";
        String durant = "doc-durant";
        String ferguson = "mister-ferguson";


        System.out.println(students.get("doc-durant").getName());

        // looping to add all the github usernames to a single variable for output
        String gitHubUsernames = "";
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            gitHubUsernames += "|" + entry.getKey() + "| ";
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");

        // looping entire program
        boolean again = true;
        do {
            // which user would you like to get info on
            System.out.println("\nHere are the GitHub usernames of our students:\n" + gitHubUsernames);
            System.out.println("\nWhat student would you like to see more information on?");
            String userInput = scanner.nextLine();

            // looping to ensure user enters a correct github username
            boolean wrongName = true;
            do {
                if (userInput.equals(cullen) || userInput.equals(lily) || userInput.equals(durant) || userInput.equals(ferguson)) {
                    wrongName = false;
                } else {
                    System.out.println("There is no username: " + userInput + ". Please try again: ");
                    userInput = scanner.nextLine();
                }
            } while (wrongName);


            // switch case if user enters any of the github usernames correctly
            switch (userInput) {
                case "og-cullen-bohannon":
                    System.out.println("\nName: " + students.get("og-cullen-bohannon").getName() + " - GitHub Username: " + cullen);
                    System.out.printf("Current Average: %.2f", student1.getGradeAverage());
                    break;
                case "miss-lily-bell":
                    System.out.println("\nName: " + students.get("miss-lily-bell").getName() + " - GitHub Username: " + lily);
                    System.out.printf("Current Average: %.2f", student2.getGradeAverage());
                    break;
                case "doc-durant":
                    System.out.println("\nName: " + students.get("doc-durant").getName() + " - GitHub Username: " + durant);
                    System.out.printf("Current Average: %.2f", student3.getGradeAverage());
                    break;
                case "mister-ferguson":
                    System.out.println("\nName: " + students.get("mister-ferguson").getName() + " - GitHub Username: " + ferguson);
                    System.out.printf("Current Average: %.2f", student4.getGradeAverage());
                    break;
            }


            // see another student information
            System.out.println("\n\nWould you like to see another student? y/n: ");
            userInput = scanner.nextLine();

            if (userInput.equals("n") || userInput.equals("no")) {
                again = false;
            } else if (userInput.equals("y") || userInput.equals("yes")) {
                continue;
            } else {
                System.out.println("\n\nWould you like to see another student? y/n: ");
                userInput = scanner.nextLine();
            }

        } while (again);


    }

}
