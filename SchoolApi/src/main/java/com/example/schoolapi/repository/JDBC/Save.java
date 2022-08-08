package com.example.schoolapi.repository.JDBC;

import model.Students;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Save {
    public static Students addStudent(String name){
        Connection con = ConnectDB.connect();
        String query = "INSERT INTO students(name) VALUES ('" + name + "');";
        List<Students> result = new ArrayList<Students>();
        try{
            Statement stm = con.createStatement();
            int nb = stm.executeUpdate(query);
            result = SelectbyName.getByName(name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result.get(0);
    }
}
