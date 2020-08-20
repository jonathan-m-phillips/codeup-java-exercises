package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Student student1 = new Student("Cullen Bohannon");
        Student student2 = new Student("Lily Bell");
        Student student3 = new Student("Thomas Durant");
        Student student4 = new Student("Elam Ferguson");
        HashMap<String, Student> students = new HashMap<>();

        students.put("bob-dylan", student1);
    }

}
