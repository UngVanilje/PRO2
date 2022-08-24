package ex2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int StudentNo;
    private String name;
    private List<Integer> grades;

    public Student(int studentNo, String name, List<Integer> grades) {
        StudentNo = studentNo;
        this.name = name;
        this.grades = grades;
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
        addGrade(grade);
    }

    @Override
    public String toString() {
        return name + " - " + StudentNo + " - " + grades ;
    }
}
