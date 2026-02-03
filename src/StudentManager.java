import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added succesfully!");
    }

    public void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("--- STUDENT LIST ---");
        for (Student s : studentList) {
            System.out.println("ID: " + s.getId() + " | Name: " + s.getName() + " | Grade: " + s.getGrade());
        }

    }

    public Student findByStudentID(String id) {
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
}
