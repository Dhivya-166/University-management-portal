package universtity_management_portal_service;


import java.util.List;

import universtity_management_portal_dao.StudentDAO;
import universtity_management_portal_model.Student;

public class StudentService {

    StudentDAO dao = new StudentDAO();

    public void registerStudent(Student student) {
        dao.addStudent(student);
    }

    public List<Student> getStudents() {
        return dao.getAllStudents();
    }

    public void removeStudent(int id) {
        dao.deleteStudent(id);
    }
}