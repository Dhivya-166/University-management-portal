package universtity_management_portal_dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import universtity_management_portal_model.Student;

public class StudentDAO {

    public void addStudent(Student student) {

        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO students(name,department,email) VALUES(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setString(2, student.getDepartment());
            ps.setString(3, student.getEmail());

            ps.executeUpdate();

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {

        List<Student> list = new ArrayList<>();

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM students";

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getString("email")
                );

                list.add(s);
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void deleteStudent(int id) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "DELETE FROM students WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}