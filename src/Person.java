public class Person {

    private String name = "No name";

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String sayHello(){
        return name;
    }

    public static void main(String[] args) {
        Person jon = new Person();
        jon.name = "Jon";
        System.out.println(jon.sayHello());
    }

}
