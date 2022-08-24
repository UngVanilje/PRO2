package ex2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int StudentNo;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(int studentNo, String name) {
        StudentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "\n" + name + " - " + StudentNo + " - " + getGrades();
    }
}
