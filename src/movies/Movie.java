package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    private static String category;
    private static String name;

    public Movie(String name, String category) {
        Movie.name = name;
        Movie.category = category;
//        System.out.printf("%s -- %s\n", name, category);
    }


    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        Movie.name = name;
    }

    public void setCategory(String category) {
        Movie.category = category;
    }

    public static void userSelects() {
        boolean userAgree = true;

        Input input = new Input();

        Movie[] arr = MoviesArray.findAll();
        System.out.println(Arrays.toString(arr));

//        do {
//            Scanner scan = new Scanner(System.in);
//            input.movieInput();
//            String userInput = scan.nextLine();
//            int userInputInt = Integer.parseInt(userInput);
//            if (userInputInt == 0) {
//                userAgree = false;
//            } else if (userInputInt == 1) {
//                for (Movie movie : MoviesArray.findAll()) {
//                    System.out.println(movie);
//                }
//                break;
//            } else if (userInputInt == 2) {
////                for (Movie movie : MoviesArray.findAll().)
//            }
//            break;
//        } while (userAgree);
    }


}
