package com.example.schoolapi.repository.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection connect(){
        String url = "jdbc:postgresql://localhost:5432/school";
        String user ="postgres";
        String passwd = "onitsiky";
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
             con = DriverManager.getConnection(url, user, passwd);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
