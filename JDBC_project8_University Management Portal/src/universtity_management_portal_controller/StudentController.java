package universtity_management_portal_controller;

import java.util.List;

import universtity_management_portal_model.Student;
import universtity_management_portal_service.StudentService;

public class StudentController {

    StudentService service = new StudentService();

    public void addStudent(String name, String dept, String email) {

        Student student = new Student(name, dept, email);

        service.registerStudent(student);

        System.out.println("Student Added Successfully");
    }

    public void displayStudents() {

        List<Student> list = service.getStudents();

        for (Student s : list) {
            System.out.println(
                    s.getId() + " "
                    + s.getName() + " "
                    + s.getDepartment() + " "
                    + s.getEmail()
            );
        }
    }

    public void deleteStudent(int id) {
        service.removeStudent(id);
        System.out.println("Student Deleted");
    }
}