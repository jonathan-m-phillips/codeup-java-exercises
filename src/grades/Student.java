package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // array list of grades
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


    //attendance HashMap    date, absent/present
    HashMap<String, String> attendance = new HashMap<>();

    public void recordAttendance(String date, String value) {
        if (value.toLowerCase().equals("a") || value.toLowerCase().equals("absent")) {
            attendance.put(date, "A");
        } else if (value.toLowerCase().equals("p") || value.toLowerCase().equals("present")) {
            attendance.put(date, "P");
        }
    }

    // returns the average of the students grades
    public double getAttendancePercentage() {
        double totalDays = 0;
        double absent = 0;
        for (Map.Entry<String, String> entry : attendance.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("A")) {
                absent++;
            }
            totalDays++;
        }
        return (totalDays - absent) / totalDays;
    }

    // finding specific days a student was absent
    public ArrayList<String> absentDays () {
        ArrayList<String> absenceList = new ArrayList<>();
        for (Map.Entry<String, String> entry : attendance.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("a")) {
                absenceList.add(entry.getKey());
            }
        }
        return absenceList;
    }

}
