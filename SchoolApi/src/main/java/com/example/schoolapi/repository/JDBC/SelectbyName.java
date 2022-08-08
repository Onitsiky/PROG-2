package com.example.schoolapi.repository.JDBC;

import model.Students;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SelectbyName {
    public static List<Students> getByName(String name){
        Connection con = ConnectDB.connect();
        List<Students> result = new ArrayList<Students>();
        String query = "SELECT * FROM students where name ILIKE '%" + name + "%';";
        try{
            Statement stm = con.createStatement();
            ResultSet temp = stm.executeQuery(query);
            while(temp.next()){
                Long id = temp.getLong("id");
                String Name = temp.getString("name");
                Students someone = new Students(id, Name);
                result.add(someone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
