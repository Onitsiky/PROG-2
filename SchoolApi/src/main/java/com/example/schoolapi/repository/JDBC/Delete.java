package com.example.schoolapi.repository.JDBC;

import model.Students;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Delete {
    public static String deleteById(Long id){
        Connection con = ConnectDB.connect();
        String query = "DELETE FROM students WHERE id =" + id + ";";
        try{
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "Student.id=" + id + " was succefully deleted";
    }
}
