package com.labs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.logging.Logger;
import java.util.logging.Level;

public class PostgreSQLDAO {
    public LinkedHashSet<Student> getStudentsByFields(String[] searchArgs) {
        LinkedHashSet<Student> students = new LinkedHashSet<Student>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();
            for (int i = 0; i < searchArgs.length; i++) {
                ResultSet rs = stmt.executeQuery("SELECT t.* FROM students t WHERE (t.*)::text LIKE '%" + searchArgs[i] + "%'");
                while (rs.next()) {
                    String name = rs.getString("name");
                    String surname = rs.getString("surname");
                    int age = rs.getInt("age");
                    int student_id = rs.getInt("student_id");
                    String mark = rs.getString("mark");
                    Student student = new Student(name, surname, age, student_id, mark);
//                    System.out.println(student.hashCode());
                    students.add(student);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }
}