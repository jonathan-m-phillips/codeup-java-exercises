import java.util.Arrays;
import java.util.Random;

public class ArraysExercises {

    public static String addPerson(String Person) {
        System.out.println(Person);
        return Person;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] person = new String [3];
//        Person jon = new Person("Jon");
//        Person jane = new Person("Jane");
//        Person doe = new Person("Doe");
        person[0] = new String("Jon");
        person[1] = new String("Zach");
        person[2] = new String("kim");



        for (String people : person) {
            System.out.println(people);
        }

        addPerson("Bob");

    }
}
