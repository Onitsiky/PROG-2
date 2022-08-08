package com.example.schoolapi.repository.JDBC;

import model.Students;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectAll {
    public static List<Students> getAllStudents(){
        Connection con = ConnectDB.connect();
        String query = "SELECT * FROM students;";
        List<Students> result = new ArrayList<Students>();
        try{
            Statement stm = con.createStatement();
            ResultSet temp = stm.executeQuery(query);
            while(temp.next()){
                Long id = temp.getLong("id");
                String name = temp.getString("name");
                Students someone = new Students(id, name);
                result.add(someone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}

