public class Person {

    private String name = "No name";

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println(name);
    }

    public Person (String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person jon = new Person("Jon");
        jon.name = "Jon";
        jon.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("Jane");
        Person person3 = new Person("Doe");
        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person3.name);
    }
}
