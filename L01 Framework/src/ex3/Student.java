package ex3;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student>{
    private int studentNo;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
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
        return "\n" + name + " - " + studentNo + " - " + getGrades();
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.studentNo, other.studentNo);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof ex3.Student other) {
            return this.studentNo == other.studentNo;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return studentNo;
    }
}
