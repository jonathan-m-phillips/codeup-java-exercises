import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] existingPeople, Person newPeople) {

        Person[] updatedPeople = Arrays.copyOf(existingPeople, existingPeople.length + 1);

        updatedPeople[existingPeople.length] = newPeople;
        return updatedPeople;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
//        Person jon = new Person("Jon");
//        Person jane = new Person("Jane");
//        Person doe = new Person("Doe");
        people[0] = new Person("Jon");
        people[1] = new Person("Zach");
        people[2] = new Person("kim");



        System.out.println("Adding a new person: ");
        Person erin = new Person("Erin");
        Person[] updatedPeople = new Person[people.length + 1];

        for (Person person : updatedPeople) {
            System.out.println(person);
        }

        System.out.println(Arrays.toString(addPerson(people, erin)));

//        addPerson("Bob");

    }
}
