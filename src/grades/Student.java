package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    public Student (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ArrayList<Integer> grades = new ArrayList<>();

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double gradeTotal = 0;
        for (Integer i : grades) {
            gradeTotal += i;
        }
        return gradeTotal / grades.size();
    }

}
