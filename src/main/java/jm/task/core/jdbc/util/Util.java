package jm.task.core.jdbc.util;


import java.sql.*;

public class Util {
    public static final String URL = "jdbc:mysql://localhost:3306/pp114";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "sodluc1213";

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}
