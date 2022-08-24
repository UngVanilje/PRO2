package ex2;

import java.util.ArrayList;

public class College {
    private String name;
    private ArrayList<Student> students;

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        addStudent(student);
    }

    public void removeStudent(Student student){
        removeStudent(student);
    }
    public double calcAverage(){
        int sum = 0;
        int count = 0;
        for (Student student : students){
            for (Integer grade : student.getGrades()) {
                sum += grade;
            }
            count = count + student.getGrades().size();

        }
        double average = sum / count;
        return average;
    }

    private Student findStudent(int studentNo){
        Student correctStudent = null;
        for (Student student : students){
            if (student.getStudentNo() == studentNo) {
                correctStudent = student;
            }
            else
                return correctStudent;
        }
        return correctStudent;
    }
}
