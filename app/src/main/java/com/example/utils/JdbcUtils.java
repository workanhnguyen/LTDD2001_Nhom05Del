package com.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConn() throws SQLException {
        // Adjust the variables below followed by yours
        String mySQLDatabaseName = "fmdb";
        String mySQLUsername = "root";
        String mySQLPassword = "admin";

        return DriverManager.getConnection(String.format("jdbc:mysql://localhost/%s", mySQLDatabaseName), mySQLUsername, mySQLPassword);
    }
}
