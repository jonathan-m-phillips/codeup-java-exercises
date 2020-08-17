package movies;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import util.Input;

public class MoviesApplication {

    public static void movieApp() {
        boolean userSelection = true;
        boolean run = true;
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println();
            do {
                input.movieInput();
                String userInputs = scan.nextLine();
                int userInput = Integer.parseInt(userInputs);
                if (userInput == 0) {
                    userSelection = false;
                } else if (userInput == 1) {
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                    break;
                } else if (userInput == 2) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                } else if (userInput == 3) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                } else if (userInput == 4) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                } else if (userInput == 5) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                }
            } while (userSelection);

            System.out.println("\nWould you like to try again? y/n: ");
            String yesNo = scan.nextLine();

            if (yesNo.equals("n")) {
                run = false;
            }

        } while (run);

    }

    private static Movie[] addMovie(Movie[] movies, Movie movie) {
        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length - 1] = movie;
        return movies;
    }

    public static void main (String[]args){

        movieApp();

    }
}