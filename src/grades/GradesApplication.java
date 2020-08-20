package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {
        Student student1 = new Student("Cullen Bohannon");
        Student student2 = new Student("Lily Bell");
        Student student3 = new Student("Thomas Durant");
        Student student4 = new Student("Elam Ferguson");
        HashMap<String, Student> students = new HashMap<>();

        students.put("og-cullen-bohannon", student1);
        students.put("miss-lily-bell", student2);
        students.put("doc-durant", student3);
        students.put("mister-ferguson", student4);

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

        for (Map.Entry<String, Student> entry: students.entrySet()) {
            System.out.println("Github username: " + entry.getKey() + "\nName: " + entry.getValue().getName());
        }


    }

}
