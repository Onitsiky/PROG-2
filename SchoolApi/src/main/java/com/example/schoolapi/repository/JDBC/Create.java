package com.example.schoolapi.repository.JDBC;

import model.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {
    public static Students insertStudent(String name){
        Connection con = ConnectDB.connect();
        String query = "Insert into students(name) values(?);";
        int i ;
        try{
            PreparedStatement stm = con.prepareStatement(query);
            i = stm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
