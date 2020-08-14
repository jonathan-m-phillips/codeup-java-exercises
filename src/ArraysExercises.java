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

        String[] Person = new String [3];
        Person jon = new Person("Jon");
        Person jane = new Person("Jane");
        Person doe = new Person("Doe");
        Person[0] = jon.getName();
        Person[1] = jane.getName();
        Person[2] = doe.getName();

        for (String person : Person) {
            System.out.println(person);
        }

        addPerson("Zach");

    }
}
