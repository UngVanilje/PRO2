package ex3;

import java.util.LinkedHashMap;
import java.util.Map;

public class College {
    private String name;
//    private ArrayList<Student> students = new ArrayList();
//    private Set<Student> students = new LinkedHashSet<>();
    private Map<Integer, Student> students = new LinkedHashMap<>();

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
//        students.add(student);
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student){
//        students.remove(student);
        students.remove(student.getStudentNo(), student);
    }
    public double calcAverage(){
        int sum = 0;
        int count = 0;
        for (Student student : students.values()){
            for (Integer grade : student.getGrades()) {

                sum += grade;
            }
            count = count + student.getGrades().size();

        }
        return (double)sum / count;
    }

    private Student findStudent(int studentNo){
        Student correctStudent = null;
        for (Student student : students.values()){
            if (student.getStudentNo() == studentNo) {
                correctStudent = student;
            }
            else
                return correctStudent;
        }
        return correctStudent;
    }
}
